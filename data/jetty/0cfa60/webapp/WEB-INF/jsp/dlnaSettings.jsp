<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="iso-8859-1" %>

<html><head>
    <%@ include file="head.jsp" %>
    <%@ include file="jquery.jsp" %>
    <script type="text/javascript" src="<c:url value="/script/scripts-2.0.js"/>"></script>
</head>

<body class="mainframe bgcolor1">
<script type="text/javascript" src="<c:url value="/script/wz_tooltip.js"/>"></script>
<script type="text/javascript" src="<c:url value="/script/tip_balloon.js"/>"></script>

<c:set var="category" value="dlna"/>
<c:set var="toast" value="${model.toast}"/>
<%@ include file="settingsHeader.jsp" %>

<form method="post" action="dlnaSettings.view">

    <div>
        <input type="checkbox" name="dlnaEnabled" id="dlnaEnabled" class="checkbox"
               <c:if test="${model.dlnaEnabled}">checked="checked"</c:if>/>
        <label for="dlnaEnabled"><fmt:message key="dlnasettings.enabled"/></label>
    </div>

    <p class="detail" style="width:60%;white-space:normal">
        <fmt:message key="dlnasettings.description"/>
    </p>
    <div>
        <fmt:message key="dlnasettings.servername"/>
        <input name="dlnaServerName" id="dlnaServerName" size="40"
               value="<c:out value="${model.dlnaServerName}" escapeXml="true"/>"/>
    </div>
    <p class="detail" style="width:60%;white-space:normal;padding-top:0">
        <fmt:message key="dlnasettings.servername.description"/>
    </p>

    <c:set var="licenseInfo" value="${model.licenseInfo}"/>
    <%@ include file="licenseNotice.jsp" %>

    <p>
        <input type="submit" value="<fmt:message key="common.save"/>" style="margin-right:0.3em">
        <input type="button" value="<fmt:message key="common.cancel"/>" onclick="location.href='nowPlaying.view'">
    </p>

</form>

</body></html>