<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <title>Horda Rozrabiaków</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>

<div class="container">
    <div class="jumbotron">
        <h1>Horda Rozrabiaków</h1>
        <p>Witaj <c:out value="${pageContext.request.remoteUser}"/></p>
    </div>
</div>
<table>
    <thead>
    <tr>
        <th>Tytuł</th>
        <th>Autor</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${listing.books}" var="book">
        <tr>
            <td><c:out value="${book.id}" /></td>
            <td><c:out value="${book.title}" /></td>
            <td><c:out value="${book.author}" /></td>
            <td><a href="/books/delete/${book.id}"
                   onclick="return confirm('Czy na pewno usunąć książkę o id ${book.id}?')">Usuń</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<div class="col-sm-offset-2">
    <a class="btn btn-primary btn-lg" href="personalDetails.jsp" role="button">Edytuj swoje dane</a>
</div>
<div class="col-sm-offset-2">
    <a class="btn btn-primary btn-lg" href="changePassword" role="button">Zmiana hasło</a>
</div>
<div class="col-sm-offset-2">
    <a class="btn btn-primary btn-lg" href="main.jsp" role="button">Wyloguj się</a>
</div>

<%@ include file="../layout/footer.jspf" %>