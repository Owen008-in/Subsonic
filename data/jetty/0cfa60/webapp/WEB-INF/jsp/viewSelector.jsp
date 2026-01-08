<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h1 style="padding-right:1em">
    <c:choose>
        <c:when test="${param.viewAsList}">
            <i id="view-list" class="fa fa-bars fa-fw headerSelected clickable"></i>
            <i id="view-grid" class="fa fa-th-large fa-fw clickable" onclick="location.href='${param.changeViewUrl}'"></i>
        </c:when>
        <c:otherwise>
            <i id="view-list" class="fa fa-bars fa-fw clickable" onclick="location.href='${param.changeViewUrl}'"></i>
            <i id="view-grid" class="fa fa-th-large fa-fw headerSelected clickable"></i>
        </c:otherwise>
    </c:choose>
</h1>
<script>
    function keyboardShortcut(action) {
        if (action == "toggleViewAsList") {
            $("${param.viewAsList ? '#view-grid' : '#view-list'}").click();
        }
    }
</script>
