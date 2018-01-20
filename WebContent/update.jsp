<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 01.11.2016
  Time: 19:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Update Page</title>
</head>
<body>
<form action="/update" method="post">
<table border="2">
    <tr>
        <td>Id</td>
        <td>Login</td>
        <td>email</td>
        <td>Password</td>
    </tr>
    <tr>
        <td><input type="text" name="id" value="${client.getClientId()}"/></td>
        <td><input type="text" name="login" value="${client.getClientLogin()}"/></td>
        <td><input type="text" name="email" value="${client.getClientEmail()}"/></td>
        <td><input type="text" name="pass" value="${client.getClientPass()}"/></td>
    </tr>
    <br><input type="submit" value="UPDATE"></br>
</table>
</form>
<a href="/">To main</a>
</body>
</html>
