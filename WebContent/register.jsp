<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 29.10.2016
  Time: 20:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register Page</title>
</head>
<body>
<form method="post" action="/register" >
    <table border="2">
        <tr>Please register here :</tr>
        <tr><c:if test="${mess != null}">${mess}</c:if><c:if test="${mess == null}">carefully enter values</c:if> </tr>
        <tr>
            <td>Login...</td>
            <td><input type="text" name="login"/></td>
        </tr>
        <tr>
            <td>Enter password first time...</td>
            <td><input type="password" name="pass"/></td>
        </tr>
        <tr>
            <td>one more time enter password...</td>
            <td><input type="password" name="pass2"/></td>
        </tr>
        <tr>
            <td>email...</td>
            <td><input type="email" name="email"/></td>
        </tr>
        <tr>
            <td>
                <input type="reset" value="Reset"/>
            </td>
            <td>
                <input type="submit" value="Register"/>
            </td>
        </tr>
    </table>
</form>
<a href="/">To main</a>
</body>
</html>
