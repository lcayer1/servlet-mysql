<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%--<jsp:u seBean id="name" class="controllers.ControllerAdmin" scope="request"/>--%>
<%--<%@ page isELIgnored="false" %>--%>
<html>
<body>
<h2>Hello! my dear friend.</h2>

<form method="post" action="/login">
    <table border="2">
        <tr>Please login here :</tr>
        <tr><c:if test="${mess != null}">${mess}</c:if><c:if
                test="${mess==null}"> check language on your keyboard </c:if></tr>
        <tr>
            <td>Login...</td>
            <td><input type="text" name="login"/></td>
        </tr>
        <tr>
            <td>Password...</td>
            <td><input type="password" name="pass"/></td>
        </tr>
        <tr>
            <td>
                <input type="reset" value="Reset"/>
                <input type="submit" value="Login"/>

            </td>
        </tr>
    </table>
</form>
<p>
    <a href="/register.jsp">to Register form ...</a>
</p>
<p>
    <a href="/look">look as guest...</a>
</p>
<p>
    <a href="/author.jsp">developed by: &Psi; &Chi;</a>
</p>
</body>
</html>
