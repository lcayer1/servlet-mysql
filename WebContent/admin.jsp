%--
  Created by IntelliJ IDEA.
  User: user
  Date: 31.10.2016
  Time: 20:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Administration</title>
</head>
<body>
<table border="2">
    <tr>
        <td>Id</td>
        <td>Login</td>
        <td>email</td>
        <td>Dell</td>
        <td>Update</td>
    </tr>
    <c:forEach var="client" items="${clients}">
        <tr>
            <td>${client.getClientId()}</td>
            <td>${client.getClientLogin()}</td>
            <td>${client.getClientEmail()}</td>
            <td><a href="/dell?id=${client.getClientId()}">Dell</a></td>
            <td><a href="/update?id=${client.getClientId()}">Update</a></td>
        </tr>
    </c:forEach>
</table>
<a href="/admin">To main</a>
</body>
</html>