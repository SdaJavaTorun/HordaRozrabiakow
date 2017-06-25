<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <title>Horda Rozrabiaków</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<div class="col-sm-offset-2">
    <h1 class="display-2">Horda Rozrabiaków pozdrawia</h1>
</div>
    <%--This is ${text}--%>
<c:if test="${param.error ne null}">
    <div>Nieprawidłowe hasło.</div>
</c:if>
<c:if test="${param.logout ne null}">
    <div>Użytkownik został wylogowany.</div>
</c:if>
<form class="form-horizontal" action="/login" method="post">
    <div class="form-group">
        <label class="col-sm-2 control-label" for="username">Login:</label>
        <div class="col-sm-4">
            <input class="form-control col-sm-6" type="text" id="username" name="username" placeholder="Nazwa użytkownika"/>
        </div>
    </div>
    <div class="form-group">
        <label class="col-sm-2 control-label" for="password">Hasło:</label>
        <div class="col-sm-4">
            <input class="form-control col-sm-6" type="password" id="password" name="password" placeholder="Hasło"/>
            <%--<p class="help-block">Example block-level help text here.</p>--%>
        </div>
    </div>
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <button class="btn btn-success" type="submit">Zaloguj</button>
        </div>
    </div>
</form>
<div class="col-sm-offset-2">
    <p class="help-block">Nie masz jeszcze konta zarejestruj się</p>
    <a class="btn btn-primary btn-lg" href="register" role="button">Zarejestruj się</a>
</div>
</body>
</html>