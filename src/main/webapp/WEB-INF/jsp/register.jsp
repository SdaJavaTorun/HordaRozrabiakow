<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
<head>
    <title>Zarejestruj się!</title>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>

<body>
<form class="form-horizontal" action="/register" method="post">
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    <div class="col-sm-offset-2">
        <h2 class="display-2">Prosimy o wypełnienie poniższych danych</h2>
    </div>

    <div class="form-group">
        <label class="col-sm-2 control-label" for="login">Login</label>
        <div class="col-sm-4">
            <input class="form-control col-sm-6" type="text" id="login" name="login" placeholder="Wybierz swój login"/>
        </div>
    </div>

    <div class="form-group">
        <label class="col-sm-2 control-label" for="firstName">Imię</label>
        <div class="col-sm-4">
            <input class="form-control col-sm-6" type="text" id="firstName" name="firstName" placeholder="Imię"/>
        </div>
    </div>

    <div class="form-group">
        <label class="col-sm-2 control-label" for="lastName">Nazwisko</label>
        <div class="col-sm-4">
            <input class="form-control col-sm-6" type="text" id="lastName" name="lastName" placeholder="Nazwisko"/>
        </div>
    </div>

    <div class="form-group">
        <label class="col-sm-2 control-label" for="email">E-mail</label>
        <div class="col-sm-4">
            <input class="form-control col-sm-6" type="text" id="email" name="email" placeholder="E-mail"/>
        </div>
    </div>

    <div class="form-group">
        <label class="col-sm-2 control-label" for="password">Hasło</label>
        <div class="col-sm-4">
            <input class="form-control col-sm-6" type="text" id="password" name="password" placeholder="Wprowadź hasło"/>
        </div>
    </div>

    <div class="form-group">
        <label class="col-sm-2 control-label" id="role" name="role" for="role"> Co cię do nas sprowadza?</label>
        <div class="col-sm-4">
            <div class="checkbox">
                <label><input type="checkbox"  value="CANDIDATE">Szukam pracy</label>
            </div>
            <div class="checkbox">
                <label><input type="checkbox" value="CHIEF">Szukam pracownika</label>
            </div>
        </div>
    </div>

    <div class="form-group">
        <button type="submit">Zarejestruj się</button>
        <button><a href="main"> Anuluj </a></button>
    </div>

</form>


</body>
</html>