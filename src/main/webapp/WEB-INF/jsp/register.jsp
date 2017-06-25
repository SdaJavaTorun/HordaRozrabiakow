<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>


<!DOCTYPE html>
<html>
<head>
    <title>Zarejestruj się!</title>
</head>

<body>
<form action="/register"  method="post">
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />


    <div>Tworzenie konta</div>
    <table>
        <tr>
            <td>Imię:</td>
            <td><input type="text" name="firstName"/></td>
            <%--<td th:if="${#fields.hasErrors('firstName')}" th:errors="*{firstName}">First Name Error</td>--%>
        </tr>
        <tr>
            <td>Nazwisko:</td>
            <td><input type="text" name="lastName" /></td>
            <%--<td th:if="${#fields.hasErrors('lastName')}" th:errors="*{lastName}">Last Name Error</td>--%>
        </tr>
        <tr>
            <td>Adres e-mail:</td>
            <td><input type="text" name="email" /></td>
            <%--<td th:if="${#fields.hasErrors('email')}" th:errors="*{email}">Email Error</td>--%>
        </tr>
        <tr>
            <td>Hasło:</td>
            <td><input type="text" name="password"/></td>
            <%--<td th:if="${#fields.hasErrors('password')}" th:errors="*{password}">Password Error</td>--%>
        </tr>
        <tr>
            <td><button type="submit" >Zarejestruj się</button></td>
            <td><button><a href="main"> Anuluj </a> </button></td>
        </tr>
    </table>


</form>
</body>
</html>