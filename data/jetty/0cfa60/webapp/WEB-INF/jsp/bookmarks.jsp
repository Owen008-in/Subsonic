<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="iso-8859-1"%>
<%--@elvariable id="model" type="java.util.Map"--%>

<html><head>
    <%@ include file="head.jsp" %>

    <script type="text/javascript" language="javascript">
        function onRemove(id) {
            location.href = "bookmarks.view?delete=" + id;
        }
    </script>
</head>

<body class="mainframe bgcolor1">

<h1>
    <i class="fa fa-bookmark fa-lg icon"></i>&nbsp;&nbsp;<fmt:message key="left.bookmarks"/>
</h1>


<c:if test="${not empty model.bookmarks}">
    <table class="music" style="margin-top:2em; margin-bottom:2em">
        <tr>
            <th colspan="4"></th>
            <th class="truncate"><fmt:message key="common.name"/></th>
            <th class="truncate"><fmt:message key="personalsettings.album"/></th>
            <th class="truncate"><fmt:message key="personalsettings.artist"/></th>
            <th class="truncate"><fmt:message key="common.description"/></th>
            <th class="fit center"><i class="fa fa-lg fa-clock-o"></i></th>
            <th class="fit center"><fmt:message key="common.delete"/></th>
        </tr>
        <c:forEach items="${model.bookmarks}" var="bookmark">
            <tr>
                <c:import url="playButtons.jsp">
                    <c:param name="id" value="${bookmark.mediaFile.id}"/>
                    <c:param name="playEnabled" value="${model.user.streamRole}"/>
                    <c:param name="addEnabled" value="${model.user.streamRole}"/>
                    <c:param name="video" value="${bookmark.mediaFile.video and model.player.web}"/>
                    <c:param name="asTable" value="true"/>
                    <c:param name="onPlay" value="top.playQueue.onPlaySingle(${bookmark.mediaFile.id})"/>
                </c:import>

                <td class="truncate"><span class="songTitle">${fn:escapeXml(bookmark.mediaFile.title)}</span></td>
                <td class="truncate"><a href="main.view?id=${bookmark.mediaFile.id}"><span class="detail">${fn:escapeXml(bookmark.mediaFile.albumName)}</span></a></td>
                <td class="truncate"><span class="detail">${fn:escapeXml(bookmark.mediaFile.artist)}</span></td>
                <td class="truncate"><span class="detail">${fn:escapeXml(bookmark.comment)}</span></td>
                <td class="fit right"><span class="detail">${bookmark.positionAsString} / ${bookmark.mediaFile.durationString}</span></td>
                <td class="fit center">
                    <i class="fa fa-remove clickable icon" onclick="onRemove(${bookmark.id})" title="<fmt:message key="playlist.remove"/>"></i>
                </td>
            </tr>
        </c:forEach>
    </table>
</c:if>

<p style="width:60%">
    <fmt:message key="bookmarks.info"/>
</p>

</body>
</html>
