<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <title>Formatka dodawania danych</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <link rel="stylesheet" href="../../css/main.css" type="text/css" />
</head>
<body>
<form class="form-horizontal" action="/login" method="post">
<div class="col-sm-offset-2">
    <h1 class="display-2">Formatka dodawania danych</h1>
    <h2 class="display-2">Prosimy o wypełnienie poniższych danych</h2>
</div>
<%--<div class="form-group">--%>
    <%--<label class="col-sm-2 control-label" for="name">Imię:</label>--%>
    <%--<div class="col-sm-4">--%>
        <%--<input class="form-control col-sm-6" type="text" id="name" name="name" placeholder="Imię"/>--%>
    <%--</div>--%>
<%--</div>--%>
<%--<div class="form-group">--%>
    <%--<label class="col-sm-2 control-label" for="surname">Nazwisko:</label>--%>
    <%--<div class="col-sm-4">--%>
        <%--<input class="form-control col-sm-6" type="text" id="surname" name="surname" placeholder="Nazwisko"/>--%>
    <%--</div>--%>
<%--</div>--%>
<div class="form-group">
    <label class="col-sm-2 control-label" for="datetimepicker10">Data urodzenia:</label>
    <div class="col-sm-4">
        <%--<input class="form-control col-sm-6" type="text" id="dateOfBirth" name="dateOfBirth" placeholder="Data urodzenia"/>--%>
            <div class="container">
                <div class="col-sm-6" style="height:130px;">
                    <div class="form-group">
                        <div class='input-group date' id='datetimepicker10'>
                            <input type='text' class="form-control" />
                            <span class="input-group-addon">
                    <span class="glyphicon glyphicon-calendar">
                    </span>
                </span>
                        </div>
                    </div>
                </div>
                <script type="text/javascript">
                    $(function () {
                        $('#datetimepicker10').datetimepicker({
                            viewMode: 'years',
                            format: 'MM/YYYY'
                        });
                    });
                </script>
            </div>
    </div>
</div>
<div class="form-group">
    <label class="col-sm-2 control-label" for="address">Adres:</label>
    <div class="col-sm-4">
        <input class="form-control col-sm-6" type="text" id="address" name="address" placeholder="Adres"/>
    </div>
</div>
<div class="form-group">
    <label class="col-sm-2 control-label" for="telephone">Telefon:</label>
    <div class="col-sm-4">
        <input class="form-control col-sm-6" type="text" id="telephone" name="telephone" placeholder="Telefon"/>
    </div>
</div>
<div class="form-group">
    <label class="col-sm-2 control-label" for="e-mail">E-mail:</label>
    <div class="col-sm-4">
        <input class="form-control col-sm-6" type="text" id="e-mail" name="e-mail" placeholder="E-mail"/>
    </div>
</div>
<div class="form-group">
    <label class="col-sm-2 control-label" for="education">Wykształcenie:</label>
    <div class="col-sm-4">
        <%--<input class="form-control col-sm-6" type="text" id="education" name="education" placeholder="Wykształcenie"/>--%>
        <div class="checkbox">
            <label><input type="checkbox" id="education" value="">Wyższe</label>
        </div>
        <div class="checkbox">
            <label><input type="checkbox" value="">Niepełne wyższe</label>
        </div>
        <div class="checkbox">
            <label><input type="checkbox" value="">Średnie</label>
        </div>
        <div class="checkbox">
            <label><input type="checkbox" value="">Zawodowe</label>
        </div>
        <div class="checkbox">
            <label><input type="checkbox" value="">Podstawowe</label>
        </div>
    </div>
</div>
<div class="form-group">
    <label class="col-sm-2 control-label" for="experience">Doświadczenie:</label>
    <div class="col-sm-4">
        <input class="form-control col-sm-6" type="text" id="experience" name="experience" placeholder="Doświadczenie"/>
    </div>
</div>
<div class="form-group">
    <label class="col-sm-2 control-label" for="training">Szkolenia:</label>
    <div class="col-sm-4">
        <input class="form-control col-sm-6" type="text" id="training" name="training" placeholder="Szkolenia"/>
    </div>
</div>
<div class="form-group">
    <label class="col-sm-2 control-label" for="hobby">Hobby:</label>
    <div class="col-sm-4">
        <input class="form-control col-sm-6" type="text" id="hobby" name="hobby" placeholder="Hobby"/>
    </div>
</div>
</form>
<img src="img/praca2.jpg" class="pull-right img-rounded" alt="PRACA2" width="50" height="50">
</body>
</html>