<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <title>Horda Rozrabiaków</title>
</head>
<body>
<h1>Horda Rozrabiaków pozdrawia</h1>
This is ${text}
<c:if test="${param.error ne null}">
    <div>Nieprawidłowe hasło.</div>
</c:if>
<c:if test="${param.logout ne null}">
    <div>Użytkownik został wylogowany.</div>
</c:if>
<form action="/login" method="post">
    <div><label for="username">Login: <input type="text" id="username" name="username"/></label></div>
    <div><label for="password">Hasło: <input type="password" id="password" name="password"/></label></div>
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
    <div><input type="submit" value="Zaloguj"/></div>
</form>
<div><a href="register.jsp">Nie ma konta ... to do rejestracji :-)</a></div>
</body>
</html>