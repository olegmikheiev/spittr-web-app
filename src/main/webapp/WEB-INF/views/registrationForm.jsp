<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<%@ page session="false" %>

<html>
<head>
    <title>Spitter registration form</title>
    <link rel="sylesheet" type="text/css" href="<c:url value="/resources/style.css" />">
    <style>
        .errors {
            text-decoration-color: red;
            background-color: #ffcccc;
        }

        label.error {
            color: red;
            text-decoration-color: red;
        }

        input.error {
            background-color: #ffcccc;
        }
    </style>
</head>
<body>
<h1>Registration</h1>
<sf:form method="POST" modelAttribute="spitter">
    <%--<sf:errors path="*" element="div" cssClass="errors"/>--%>
    <table border="0">
        <tbody>
        <tr>
            <td><sf:label path="firstName">First name:</sf:label></td>
            <td><sf:input path="firstName" cssErrorClass="error"/></td>
        </tr>
        <tr>
            <td></td>
            <td><i><sf:errors path="firstName" cssClass="errors"/></i></td>
        </tr>
        <tr>
            <td><sf:label path="lastName">Last name:</sf:label></td>
            <td><sf:input path="lastName" cssErrorClass="error"/></td>
        </tr>
        <tr>
            <td></td>
            <td><i><sf:errors path="lastName" cssClass="errors"/></i></td>
        </tr>
        <tr>
            <td><sf:label path="email">Email:</sf:label></td>
            <td><sf:input path="email" cssErrorClass="error" type="email"/></td>
        </tr>
        <tr>
            <td></td>
            <td><i><sf:errors path="email" cssClass="errors"/></i></td>
        </tr>
        <tr>
            <td><sf:label path="username">Username:</sf:label></td>
            <td><sf:input path="username" cssErrorClass="error"/></td>
        </tr>
        <tr>
            <td></td>
            <td><i><sf:errors path="username" cssClass="errors"/></i></td>
        </tr>
        <tr>
            <td><sf:label path="password">Password:</sf:label></td>
            <td><sf:password path="password" cssErrorClass="error"/></td>
        </tr>
        <tr>
            <td></td>
            <td><i><sf:errors path="password" cssClass="errors"/></i></td>
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
