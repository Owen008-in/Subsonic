<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="iso-8859-1" %>
<%--<!DOCTYPE html>--%>
<html>
<head>
    <%@ include file="head.jsp" %>
    <%@ include file="jquery.jsp" %>
</head>

<body>

<div class="albumThumb">
    <c:import url="artistImage.jsp">
        <c:param name="artistId" value="1"/>
        <c:param name="caption" value="xxx"/>
        <c:param name="size" value="150"/>
    </c:import>
</div>

<div class="albumThumb">
    <c:import url="artistImage.jsp">
        <c:param name="artistId" value="21"/>
        <c:param name="caption" value="John Doe foo bnasf as dfasdfasf asdf asdfsdf"/>
        <c:param name="size" value="150"/>
    </c:import>
</div>

<div class="albumThumb">
    <c:import url="artistImage.jsp">
        <c:param name="artistId" value="1"/>
        <c:param name="size" value="150"/>
    </c:import>
</div>

</body>
</html>