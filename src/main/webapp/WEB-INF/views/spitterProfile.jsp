<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="false" %>

<html>
<head>
    <title>Spitter</title>
    <link rel="sylesheet" type="text/css" href="<c:url value="/resources/style.css" />">
</head>
<body>
<h1>Profile of spitter <b><c:out value="${spitter.username}"/></b></h1>
<table border="0">
    <tbody>
    <tr>
        <td>First name:</td>
        <td><b><c:out value="${spitter.firstName}"/></b></td>
    </tr>
    <tr>
        <td>Last name:</td>
        <td><b><c:out value="${spitter.lastName}"/></b></td>
    </tr>
    <tr>
        <td>e-mail:</td>
        <td><b><c:out value="${spitter.email}"/></b></td>
    </tr>
    </tbody>
</table>
</body>
</html>
