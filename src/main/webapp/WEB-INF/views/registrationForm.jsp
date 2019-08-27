<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<%@ page session="false" %>

<html>
<head>
    <title>Spitter registration form</title>
    <link rel="sylesheet" type="text/css" href="<c:url value="/resources/style.css" />">
</head>
<body>
<h1>Registration</h1>
<sf:form method="POST" modelAttribute="spitter">
    <table border="0">
        <tbody>
        <tr>
            <td>First name:</td>
            <td><sf:input path="firstName"/></td>
        </tr>
        <tr>
            <td>Last name:</td>
            <td><sf:input path="lastName"/></td>
        </tr>
        <tr>
            <td>Email:</td>
            <td><sf:input path="email" type="email"/></td>
        </tr>
        <tr>
            <td>Username:</td>
            <td><sf:input path="username"/></td>
        </tr>
        <tr>
            <td>Password:</td>
            <td><sf:password path="password"/></td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="submit" name="submit" value="Register"/>
            </td>
        </tr>
        </tbody>
    </table>
</sf:form>
</body>
</html>
