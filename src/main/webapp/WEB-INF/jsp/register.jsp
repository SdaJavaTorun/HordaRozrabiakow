<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="th" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <title>Zarejestruj się!</title>
</head>
<body>
<form action="/register" method="post">
    <label for="username">Login</label><input type="text" id="username" name="username" />
    <label for="password">Hasło</label><input type="text" id="password" name="password" />
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
    <input type="submit" value="Dodaj" />
</form>
</body>
</html>