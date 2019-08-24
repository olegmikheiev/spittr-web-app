<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<html>
<head>
    <title>Spittle #<c:out value="${spittle.id}"/></title>
</head>
<body>
<div class="spittleView">
    <h1>Spittle #<c:out value="${spittle.id}"/></h1>
    <div class="spittleMessage"><c:out value="${spittle.message}"/></div>
    <div class="spittleTime"><c:out value="${spittle.time}"/></div>
    <div class="spittleLocation">
        Location: <c:out value="${spittle.latitude}"/>, <c:out value="${spittle.longitude}"/>
    </div>
</div>
</body>
</html>
