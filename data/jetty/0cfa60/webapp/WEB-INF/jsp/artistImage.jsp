<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="iso-8859-1" %>
<%@ include file="include.jsp" %>

<%--
PARAMETERS
  artistId: ID of artist.
  size: Height and width of image.
  caption: Caption line (optional)
  showLink: Whether to make the artist image link to the artist page.
--%>
<c:set var="imageSize" value="${param.size - 6}px"/>
<c:set var="outerSize" value="${param.size}px"/>

<div class="artistimage">
    <div style="width:${outerSize};max-width:${outerSize};height:${outerSize};max-height:${outerSize};cursor:${param.showLink ? 'pointer' : 'inherit'}" title="${param.caption}">

        <c:url value="main.view" var="targetUrl">
            <c:param name="id" value="${param.artistId}"/>
        </c:url>

        <c:url value="/artistImage.view" var="artistImageUrl">
            <c:param name="id" value="${param.artistId}"/>
        </c:url>

        <c:choose>
            <c:when test="${param.showLink}">
                <a href="${targetUrl}" title="${param.caption}">
                    <img src="${artistImageUrl}" alt="${param.caption}" class="circle dropshadow hoverable" style="width:${imageSize}; height:${imageSize}">
                </a>
            </c:when>
            <c:otherwise>
                <img src="${artistImageUrl}" alt="${param.caption}" class="circle dropshadow" style="width:${imageSize}; height:${imageSize}">
            </c:otherwise>
        </c:choose>
    </div>

    <c:if test="${not empty param.caption}">
        <div class="caption" style="width:${outerSize}">
            <c:choose>
                <c:when test="${param.showLink}">
                    <a href="${targetUrl}" title="${param.caption}">${param.caption}</a>
                </c:when>
                <c:otherwise>
                    ${param.caption}
                </c:otherwise>
            </c:choose>
        </div>
    </c:if>
</div>

