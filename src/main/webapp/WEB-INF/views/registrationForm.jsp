<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<html>
<head>
    <title>Spitter registration form</title>
    <link rel="sylesheet" type="text/css" href="<c:url value="/resources/style.css" />">
</head>
<body>
<h1>Registration</h1>
<form method="POST">
    <table border="0">
        <tbody>
        <tr>
            <td>First name:</td>
            <td><input type="text" name="firstName"/></td>
        </tr>
        <tr>
            <td>Last name:</td>
            <td><input type="text" name="secondName"/></td>
        </tr>
        <tr>
            <td>Username:</td>
            <td><input type="text" name="username"/></td>
        </tr>
        <tr>
            <td>Password:</td>
            <td><input type="password" name="password"/></td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="submit" name="submit" value="Register"/>
            </td>
        </tr>
        </tbody>
    </table>
</form>
</body>
</html>
