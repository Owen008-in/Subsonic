<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="iso-8859-1" %>

<html><head>
    <%@ include file="head.jsp" %>
    <%@ include file="jquery.jsp" %>
    <script type="text/javascript" src="<c:url value="/script/scripts.js"/>"></script>
</head>

<body class="mainframe bgcolor1">
<script type="text/javascript" src="<c:url value="/script/wz_tooltip.js"/>"></script>
<script type="text/javascript" src="<c:url value="/script/tip_balloon.js"/>"></script>

<c:set var="category" value="sonos"/>
<c:set var="toast" value="${model.toast}"/>
<%@ include file="settingsHeader.jsp" %>

<form method="post" action="sonosSettings.view">

    <div>
        <input type="checkbox" name="sonosEnabled" id="sonosEnabled" class="checkbox"
               <c:if test="${model.sonosEnabled}">checked="checked"</c:if>/>
        <label for="sonosEnabled"><fmt:message key="sonossettings.enabled"/></label>
    </div>

    <p class="detail" style="width:60%;white-space:normal">
        <fmt:message key="sonossettings.description"/>
    </p>
    <div>
        <fmt:message key="sonossettings.servicename"/>
        <input name="sonosServiceName" id="sonosServiceName" size="40"
               value="<c:out value="${model.sonosServiceName}" escapeXml="true"/>"/>
    </div>
    <p class="detail" style="width:60%;white-space:normal;padding-top:0">
        <fmt:message key="sonossettings.servicename.description"/>
    </p>

    <c:set var="licenseInfo" value="${model.licenseInfo}"/>
    <%@ include file="licenseNotice.jsp" %>

    <p>
        <input type="submit" value="<fmt:message key="common.save"/>" style="margin-right:0.3em">
        <input type="button" value="<fmt:message key="common.cancel"/>" onclick="location.href='nowPlaying.view'">
    </p>

</form>

</body></html>