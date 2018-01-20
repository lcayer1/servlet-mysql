<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 17.10.2016
  Time: 11:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
<h2>this is result servlet</h2>
<table border="2">
    <tr>
        <td>Id</td>
        <td>Login</td>
        <td>email</td>
    </tr>
    <c:forEach var="client" items="${clients}">
        <tr>
            <td>${client.getClientId()}</td>
            <td>${client.getClientLogin()}</td>
            <td>${client.getClientEmail()}</td>
        </tr>
    </c:forEach>
</table>
<a href="/">To main</a>
</body>
</html>
