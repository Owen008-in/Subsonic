<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="iso-8859-1"%>
<%--@elvariable id="model" type="java.util.Map"--%>

<html><head>
    <%@ include file="head.jsp" %>
    <%@ include file="jquery.jsp" %>

    <sub:url value="/search.view" var="searchUrl">
        <sub:param name="query" value="${model.query}"/>
    </sub:url>

    <style type="text/css">
        .search-header {
            flex-grow: 1;
        }
        .show-more-button {
            cursor: pointer;
        }
    </style>
</head>
<body class="mainframe bgcolor1">

<div style="display:flex; align-items:center">
    <h1 style="flex-grow:1">
        <i class="fa fa-search fa-lg icon"></i>&nbsp;&nbsp;<fmt:message key="search.title"/>
    </h1>
    <div>
        <c:import url="viewSelector.jsp">
            <c:param name="changeViewUrl" value="${searchUrl}&viewAsList=${not model.viewAsList}"/>
            <c:param name="viewAsList" value="${model.viewAsList}"/>
        </c:import>
    </div>
</div>

<c:if test="${model.indexBeingCreated}">
    <p class="warning space-above"><fmt:message key="search.index"/></p>
</c:if>

<c:if test="${not model.indexBeingCreated and empty model.artists and empty model.albums and empty model.songs}">
    <p class="warning space-above"><fmt:message key="search.hits.none"/></p>
</c:if>

<c:if test="${not empty model.artists}">
    <div style="display:flex; align-items:center; padding-top:2em;">
        <h2 class="search-header"><fmt:message key="search.hits.artists"/></h2>
        <c:if test="${model.hasMoreArtists}">
            <input class="show-more-button" type="button" value="<fmt:message key="search.hits.more"/>" onclick="location.href='${searchUrl}&count=30&index=ARTIST'">
        </c:if>
    </div>

    <c:choose>
        <c:when test="${model.viewAsList}">
            <table class="music indent">
                <tr></tr>
                <c:forEach items="${model.artists}" var="artist" varStatus="loopStatus">
                    <tr>
                        <c:import url="playButtons.jsp">
                            <c:param name="id" value="${artist.id}"/>
                            <c:param name="playEnabled" value="${model.user.streamRole and not model.partyModeEnabled}"/>
                            <c:param name="addEnabled" value="${model.user.streamRole and (not model.partyModeEnabled or not artist.directory)}"/>
                            <c:param name="asTable" value="true"/>
                        </c:import>
                        <td class="truncate"><a href="main.view?id=${artist.id}">${fn:escapeXml(artist.name)}</a></td>
                    </tr>

                </c:forEach>
            </table>

        </c:when>
        <c:otherwise>
            <div style="padding-top:0.5em">
                <c:forEach items="${model.artists}" var="artist" varStatus="loopStatus">
                    <div class="albumThumb">
                        <c:import url="artistImage.jsp">
                            <c:param name="artistId" value="${artist.id}"/>
                            <c:param name="caption" value="${fn:escapeXml(artist.name)}"/>
                            <c:param name="size" value="${model.coverArtSize}"/>
                            <c:param name="showLink" value="true"/>
                        </c:import>
                    </div>
                </c:forEach>
            </div>
        </c:otherwise>
    </c:choose>
</c:if>

<c:if test="${not empty model.albums}">

    <div style="display:flex; align-items:center; padding-top:2em;">
        <h2 class="search-header"><fmt:message key="search.hits.albums"/></h2>
        <c:if test="${model.hasMoreAlbums}">
            <input class="show-more-button" type="button" value="<fmt:message key="search.hits.more"/>" onclick="location.href='${searchUrl}&count=30&index=ALBUM'">
        </c:if>
    </div>

    <c:choose>
        <c:when test="${model.viewAsList}">
            <table class="music indent">
                <tr>
                    <th colspan="4"></th>
                    <th class="truncate"><fmt:message key="personalsettings.album"/></th>
                    <th class="truncate"><fmt:message key="personalsettings.artist"/></th>
                </tr>
                <c:forEach items="${model.albums}" var="album" varStatus="loopStatus">
                    <tr>
                        <c:import url="playButtons.jsp">
                            <c:param name="id" value="${album.id}"/>
                            <c:param name="playEnabled" value="${model.user.streamRole and not model.partyModeEnabled}"/>
                            <c:param name="addEnabled" value="${model.user.streamRole and (not model.partyModeEnabled or not album.directory)}"/>
                            <c:param name="asTable" value="true"/>
                        </c:import>

                        <td class="truncate"><a href="main.view?id=${album.id}">${fn:escapeXml(album.albumName)}</a></td>
                        <td class="truncate"><span class="detail">${fn:escapeXml(album.artist)}</span></td>
                    </tr>

                </c:forEach>
            </table>
        </c:when>

        <c:otherwise>
            <div style="padding-top:0.5em">
                <c:forEach items="${model.albums}" var="album" varStatus="loopStatus">

                    <c:set var="albumTitle">
                        <c:choose>
                            <c:when test="${empty album.name}">
                                <fmt:message key="common.unknown"/>
                            </c:when>
                            <c:otherwise>
                                ${fn:escapeXml(album.name)}
                            </c:otherwise>
                        </c:choose>
                    </c:set>

                    <div class="albumThumb">
                        <c:import url="coverArt.jsp">
                            <c:param name="albumId" value="${album.id}"/>
                            <c:param name="auth" value="${album.hash}"/>
                            <c:param name="caption1" value="${albumTitle}"/>
                            <c:param name="caption2" value="${fn:escapeXml(album.artist)}"/>
                            <c:param name="captionCount" value="2"/>
                            <c:param name="coverArtSize" value="${model.coverArtSize}"/>
                            <c:param name="showLink" value="true"/>
                            <c:param name="showPlay" value="${model.user.streamRole}"/>
                            <c:param name="appearAfter" value="${loopStatus.count * 30}"/>
                        </c:import>
                    </div>
                </c:forEach>
            </div>
        </c:otherwise>
    </c:choose>
</c:if>

<c:if test="${not empty model.songs}">

<div style="display:flex; align-items:center; padding-top:2em;">
    <h2 class="search-header"><fmt:message key="search.hits.songs"/></h2>
    <c:if test="${model.hasMoreSongs}">
        <input class="show-more-button" type="button" value="<fmt:message key="search.hits.more"/>" onclick="location.href='${searchUrl}&count=30&index=SONG'">
    </c:if>
</div>

    <table class="music indent">
        <tr>
            <th colspan="4"></th>
            <th class="truncate"><fmt:message key="lyrics.song"/></th>
            <th class="truncate"><fmt:message key="personalsettings.album"/></th>
            <th class="truncate"><fmt:message key="personalsettings.artist"/></th>
        </tr>

        <c:forEach items="${model.songs}" var="match" varStatus="loopStatus">

            <sub:url value="/main.view" var="mainUrl">
                <sub:param name="path" value="${match.parentPath}"/>
            </sub:url>

            <tr>
                <c:import url="playButtons.jsp">
                    <c:param name="id" value="${match.id}"/>
                    <c:param name="playEnabled" value="${model.user.streamRole and not model.partyModeEnabled}"/>
                    <c:param name="addEnabled" value="${model.user.streamRole and (not model.partyModeEnabled or not match.directory)}"/>
                    <c:param name="video" value="${match.video and model.player.web}"/>
                    <c:param name="asTable" value="true"/>
                    <c:param name="onPlay" value="top.playQueue.onPlaySingle(${match.id})"/>
                </c:import>

                <td class="truncate"><span class="songTitle">${fn:escapeXml(match.title)}</span></td>
                <td class="truncate"><a href="${mainUrl}"><span class="detail">${fn:escapeXml(match.albumName)}</span></a></td>
                <td class="truncate"><span class="detail">${fn:escapeXml(match.artist)}</span></td>
            </tr>

            </c:forEach>
    </table>
</c:if>

<div style="padding-top:2em"></div>

</body></html>