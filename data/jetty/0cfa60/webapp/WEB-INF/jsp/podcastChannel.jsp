<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="iso-8859-1"%>

<html><head>
    <%@ include file="head.jsp" %>
    <%@ include file="jquery.jsp" %>

    <script type="text/javascript" language="javascript">
        function init() {
            $("#dialog-delete").dialog({resizable: false, height: 170, autoOpen: false,
                buttons: {
                    "<fmt:message key="common.delete"/>": function() {
                        location.href = "podcastReceiverAdmin.view?channelId=${model.channel.id}" +
                                "&deleteChannel=${model.channel.id}";
                    },
                    "<fmt:message key="common.cancel"/>": function() {
                        $(this).dialog("close");
                    }
                }});
        }

        function selectAll() {
            var selected = $("#selectAll").is(":checked");
            $('.episode-checkbox').prop('checked', selected);
        }

        function downloadSelected() {
            location.href = "podcastReceiverAdmin.view?channelId=${model.channel.id}" +
                    "&downloadEpisode=" + getSelectedEpisodes();
        }

        function deleteChannel() {
            $("#dialog-delete").dialog("open");
        }

        function deleteSelected() {
            location.href = "podcastReceiverAdmin.view?channelId=${model.channel.id}" +
                    "&deleteEpisode=" + getSelectedEpisodes();
        }

        function refreshChannels() {
            location.href = "podcastReceiverAdmin.view?refresh&channelId=${model.channel.id}";
        }

        function refreshPage() {
            location.href = "podcastChannel.view?id=${model.channel.id}";
        }

        function getSelectedEpisodes() {
            var result = "";
            for (var i = 0; i < ${fn:length(model.episodes)}; i++) {
                var checkbox = $("#episode" + i);
                if (checkbox.is(":checked")) {
                    result += (checkbox.val() + " ");
                }
            }
            return result;
        }

    </script>
</head>
<body class="mainframe bgcolor1" onload="init()">

<div style="float:left;margin-right:1.5em;margin-bottom:1.5em">
<c:import url="coverArt.jsp">
    <c:param name="podcastChannelId" value="${model.channel.id}"/>
    <c:param name="showPlay" value="${model.user.streamRole}"/>
    <c:param name="coverArtSize" value="200"/>
</c:import>
</div>

<h1 id="name"><a href="podcastChannels.view"><fmt:message key="podcastreceiver.title"/></a>&nbsp;&nbsp;&bull;&nbsp;&nbsp;${fn:escapeXml(empty model.channel.title ? model.channel.url : model.channel.title)}</h1>
<h2>
    <c:if test="${model.user.streamRole}">
        <span class="header" style="padding-left:0"><a href="javascript:top.playQueue.onPlayPodcastChannel(${model.channel.id}, false)"><fmt:message key="common.play"/></a></span>
    </c:if>
    <c:if test="${model.user.podcastRole}">
        | <span class="header"><a href="javascript:deleteChannel()"><fmt:message key="common.delete"/></a></span>
        | <span class="header"><a href="javascript:refreshChannels()"><fmt:message key="podcastreceiver.check"/></a></span>
    </c:if>
</h2>

<div class="detail" style="padding-top:0.2em;white-space:normal;width:80%">${fn:escapeXml(model.channel.description)}</div>

<div class="detail" style="padding-top:1.0em">
    <fmt:message key="podcastreceiver.episodes"><fmt:param value="${fn:length(model.episodes)}"/></fmt:message> &ndash;
    <fmt:message key="podcastreceiver.status.${fn:toLowerCase(model.channel.status)}"/>
    <c:if test="${model.channel.status eq 'ERROR'}">
        <span class="warning">${model.channel.errorMessage}</span>
    </c:if>
</div>

<div style="height:0.7em;clear:both"></div>

<c:if test="${not empty model.episodes}">
    <table class="music">

        <tr>
            <th class="fit center"><input type="checkbox" id="selectAll" class="checkbox" onclick="selectAll()"/></th>
            <th colspan="4"></th>
            <th class="truncate"><fmt:message key="podcastreceiver.episode"/></th>
            <th class="fit center"><i class="fa fa-lg fa-clock-o"></i></th>
            <th class="fit left"><fmt:message key="podcastreceiver.published"/></th>
            <th class="fit center"><fmt:message key="common.status"/></th>
            <th class="truncate"><fmt:message key="common.description"/></th>
        </tr>

        <c:forEach items="${model.episodes}" var="episode" varStatus="i">

            <tr>
                <td class="fit center"><input type="checkbox" class="checkbox episode-checkbox" id="episode${i.index}" value="${episode.id}"/></td>
                <c:choose>
                    <c:when test="${empty episode.mediaFileId or episode.status ne 'COMPLETED'}">
                        <td colspan="4"></td>
                    </c:when>
                    <c:otherwise>
                        <c:import url="playButtons.jsp">
                            <c:param name="id" value="${episode.mediaFileId}"/>
                            <c:param name="playEnabled" value="${model.user.streamRole and not model.partyMode}"/>
                            <c:param name="addEnabled" value="${model.user.streamRole and not model.partyMode}"/>
                            <c:param name="asTable" value="true"/>
                            <c:param name="onPlay" value="top.playQueue.onPlayPodcastEpisode(${episode.id})"/>
                        </c:import>
                    </c:otherwise>
                </c:choose>

                <td class="truncate">
                    <span title="${episode.title}" class="songTitle">${episode.title}</span>
                </td>

                <td class="fit right">
                    <span class="detail">${episode.duration}</span>
                </td>

                <td class="fit left">
                    <span class="detail"><fmt:formatDate value="${episode.publishDate}" dateStyle="medium"/></span>
                </td>

                <td class="fit center">
                    <span class="detail">
                        <c:choose>
                            <c:when test="${episode.status eq 'DOWNLOADING'}">
                                <fmt:formatNumber type="percent" value="${episode.completionRate}"/>
                            </c:when>
                            <c:otherwise>
                                <fmt:message key="podcastreceiver.status.${fn:toLowerCase(episode.status)}"/>
                            </c:otherwise>
                        </c:choose>
                    </span>
                </td>

                <td class="truncate">
                    <c:choose>
                        <c:when test="${episode.status eq 'ERROR'}">
                            <span class="detail warning" title="${episode.errorMessage}">${episode.errorMessage}</span>
                        </c:when>
                        <c:otherwise>
                            <span class="detail" title="${episode.description}">${episode.description}</span>
                        </c:otherwise>
                    </c:choose>
                </td>

            </tr>
        </c:forEach>

    </table>
</c:if>

<div style="padding-top:1em">
    <c:if test="${model.user.podcastRole}">
        <span style="padding-right:3em"><i class="fa fa-download fa-lg fa-fw icon"></i>&nbsp;&nbsp;<a href="javascript:downloadSelected()"><fmt:message key="podcastreceiver.downloadselected"/></a></span>
        <span style="padding-right:3em"><i class="fa fa-remove fa-lg fa-fw icon"></i>&nbsp;&nbsp;<a href="javascript:deleteSelected()"><fmt:message key="podcastreceiver.deleteselected"/></a></span>
    </c:if>
    <span style="padding-right:3em"><i class="fa fa-refresh fa-lg fa-fw icon"></i>&nbsp;&nbsp;<a href="javascript:refreshPage()"><fmt:message key="podcastreceiver.refresh"/></a></span>
    <c:if test="${model.user.adminRole}">
        <span style="padding-right:2em"><i class="fa fa-cog fa-lg fa-fw icon"></i>&nbsp;&nbsp;<a href="podcastSettings.view?"><fmt:message key="podcastreceiver.settings"/></a></span>
    </c:if>
    </tr></div>

<div id="dialog-delete" title="<fmt:message key="common.confirm"/>" style="display: none;">
    <p><span class="ui-icon ui-icon-alert" style="float:left; margin:0 7px 20px 0;"></span>
        <fmt:message key="podcastreceiver.confirmdelete"/></p>
</div>

</body></html>
