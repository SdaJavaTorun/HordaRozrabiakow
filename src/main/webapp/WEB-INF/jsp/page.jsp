<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <title>Aplikacja</title>
</head>
<body>
<c:if test="${param.error ne null}">
    <div>Nieprawidłowe hasło.</div>
</c:if>
<c:if test="${param.logout ne null}">
    <div>Użytkownik został wylogowany.</div>
</c:if>
<%--This is ${text}--%>
<%--<h1>Hello <b><c:out value="${pageContext.request.remoteUser}"/></b> </h1>--%>
<form action="/logout" method="post">
    <div><label for="username">Login: <input type="text" id="username" name="username"/></label></div>
    <div><label for="password">Hasło: <input type="password" id="password" name="password"/></label></div>
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
    <div><input type="submit" value="Zaloguj się"/></div>
    <div><input type="submit" value="Zarejestruj się"/></div>
    <input type="submit" value="Sign Out"/>
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
</form>
</body>