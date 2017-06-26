<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@include file="../layout/header.jspf" %>

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
<%@ include file="../layout/footer.jspf" %>
