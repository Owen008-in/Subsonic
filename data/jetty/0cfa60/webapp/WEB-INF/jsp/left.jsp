<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="iso-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html><head>
    <%@ include file="head.jsp" %>
    <%@ include file="jquery.jsp" %>
    <script type="text/javascript" src="<c:url value="/dwr/engine.js"/>"></script>
    <script type="text/javascript" src="<c:url value="/dwr/interface/multiService.js"/>"></script>

    <style type="text/css">
        .left-index-title {
            display: flex;
            align-items: center;
            width: 100%;
            font-size: 105%;
            margin-top: 1.5em;
            padding-top: 2px;
            padding-bottom: 2px;
            font-weight: 600;
        }
        .left-index-shortcut-letter {
            flex-grow: 1;
            padding-left: 2px;
        }
        .left-index-shortcut-arrow {
            padding-right: 2px;
        }
        .left-index-shortcut-artist {
            padding: 0 0 0 2px;
            text-overflow: ellipsis;
            overflow: hidden;
            white-space: nowrap;
            font-weight: 300;
            font-size: inherit;
        }
    </style>

    <script type="text/javascript" language="javascript">

        function showPage(url) {
            parent.frames.main.location.href = url;
        }

        function logout() {
            parent.location.href = "j_acegi_logout";
        }

        function changeMusicFolder(musicFolderId) {
            multiService.setSelectedMusicFolder(musicFolderId, refresh);
        }

        function refresh() {
            var mainLocation = top.main.location.href;
            if (mainLocation.indexOf("/home.view") != -1 ||
                mainLocation.indexOf("/artists.view") != -1 ) {
                top.main.location.href = mainLocation;
            }
            location.href = "left.view";
        }
    </script>
</head>

<body class="bgcolor2 leftframe">
<a name="top"></a>

<div style="padding-top:0.5em; padding-bottom:1.0em; white-space:nowrap; cursor:pointer; user-select: none; -webkit-user-select: none;" onclick="showPage('help.view')">
    <img src="<c:url value="/icons/subsonic_logo.png"/>" style="height:50px; vertical-align:middle" title="<fmt:message key="top.help"/>" alt="">
    <span style="font-size:20px; font-weight:400; vertical-align:middle; padding-left:3px">Subsonic</span>
</div>

<div class="left-menu-item" onclick="logout()">
    <fmt:message key="top.logout" var="logout"><fmt:param value="${model.user.username}"/></fmt:message>
    <i class="fa fa-sign-out fa-lg fa-fw icon"></i>&nbsp;${fn:escapeXml(logout)}
</div>

<c:if test="${model.user.settingsRole}">
    <div class="left-menu-item" onclick="showPage('settings.view')">
        <i class="fa fa-cog fa-lg fa-fw icon"></i>&nbsp;<fmt:message key="top.settings"/>
    </div>
</c:if>

<div class="left-menu-item" onclick="showPage('internetRadio.view')">
    <i class="fa fa-globe fa-lg fa-fw icon"></i>&nbsp;<fmt:message key="left.radio"/>
</div>

<div class="left-menu-item" onclick="showPage('bookmarks.view')">
    <i class="fa fa-bookmark fa-lg fa-fw icon"></i>&nbsp;<fmt:message key="left.bookmarks"/>
</div>

<div class="left-menu-item" onclick="showPage('more.view')">
    <i class="fa fa-plus-square fa-lg fa-fw icon"></i>&nbsp;<fmt:message key="top.more"/>
</div>

<div class="left-menu-item" onclick="showPage('help.view')">
    <i class="fa fa-info-circle fa-lg fa-fw icon"></i>&nbsp;<fmt:message key="help.title"><fmt:param value="${model.brand}"/></fmt:message>
</div>

<c:if test="${model.showIndex}">

    <c:if test="${fn:length(model.musicFolders) > 1}">
        <h2 style="padding-top:1em;padding-bottom:0.25em">
            <i class="fa fa-folder-open-o fa-lg fa-fw icon"></i>&nbsp;<fmt:message key="settingsheader.musicFolder"/>
        </h2>

        <div style="padding-bottom:0.5em">
            <select name="musicFolderId" onchange="changeMusicFolder(options[selectedIndex].value);" style="width:100%">
                <option value="-1"><fmt:message key="left.allfolders"/></option>
                <c:forEach items="${model.musicFolders}" var="musicFolder">
                    <option ${model.selectedMusicFolder.id == musicFolder.id ? "selected" : ""} value="${musicFolder.id}">${fn:escapeXml(musicFolder.name)}</option>
                </c:forEach>
            </select>
        </div>
    </c:if>

    <c:forEach items="${model.indexedArtists}" var="entry">
        <a name="${fn:escapeXml(entry.key.index)}"></a>
        <div class="left-index-title bgcolor1">
            <span class="left-index-shortcut-letter">${fn:escapeXml(entry.key.index)}</span>
            <span class="left-index-shortcut-arrow"><i class="fa fa-arrow-up icon clickable" onclick="location.href='#top'"></i></span>
        </div>

        <c:forEach items="${entry.value}" var="artist">
            <c:url value="main.view" var="mainUrl">
                <c:forEach items="${artist.mediaFiles}" var="mediaFile">
                    <c:param name="id" value="${mediaFile.id}"/>
                </c:forEach>
            </c:url>
            <div class="left-menu-item left-index-shortcut-artist ellipsis" onclick="showPage('${mainUrl}')" title="${fn:escapeXml(artist.name)}">
                <span class="ellipsis">${fn:escapeXml(artist.name)}</span>
            </div>
        </c:forEach>
    </c:forEach>

    <div style="padding-top:1em"></div>

    <c:forEach items="${model.singleSongs}" var="song">
        <div class="left-index-shortcut-artist">
            <c:import url="playButtons.jsp">
                <c:param name="id" value="${song.id}"/>
                <c:param name="playEnabled" value="${model.user.streamRole and not model.partyMode}"/>
                <c:param name="addEnabled" value="${model.user.streamRole}"/>
                <c:param name="downloadEnabled" value="${model.user.downloadRole and not model.partyMode}"/>
                <c:param name="video" value="${song.video and model.player.web}"/>
            </c:import>
            <span class="ellipsis" title="${fn:escapeXml(song.title)}">${fn:escapeXml(song.title)}</span>
        </div>
    </c:forEach>

    <div style="height:5em"></div>

    <div class="bgcolor2" style="opacity:1.0; width:100%; position:fixed; bottom:0; left:0; padding: 0.25em 0.75em 0.25em 0.75em; border-top:1px solid darkgray;">
        <c:forEach items="${model.indexes}" var="index">
            <a href="#${index.index}">${index.index}</a>
        </c:forEach>
    </div>

</c:if>

</body>
</html>