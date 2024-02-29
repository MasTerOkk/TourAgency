<%--
  Created by IntelliJ IDEA.
  User: Capybara
  Date: 26.02.2024
  Time: 18:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="input" uri="http://www.springframework.org/tags/form" %>

<style>
    <%@include file="../../../WEB-Content/css/style.css" %>
</style>

<html>
<head>
    <title>Title</title>
</head>
<body>
    <%@ include file="../General/header.jsp" %>
    <main>
        <div class="container">
            <h1 class="tname">Tours</h1>
            <a href="<c:url value="/tour/create"/>">Create new</a>
            <table class="table">
                <thead>
                    <tr>
                        <th>name</th>
                        <th>price</th>
                        <th>places</th>
                        <th>to cart</th>
                        <th>edit</th>
                    </tr>
                </thead>
                <tbody>
                <c:forEach var="product" items="${allTours}">
                    <c:url value="cart/addToCart/${product.getId()}" var="addUrl"/>

                    <tr>
                        <td><c:out value="${product.getName()}"/></td>
                        <td><c:out value="${product.getPrice()}"/></td>
                        <td><c:out value="${product.getCountOfPlaces() - product.getRemainingSeats()}"/></td>
                        <td>
                            <a href="${addUrl}">Добавить в корзину</a>
                        </td>
                        <td>Редактировать</td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </main>
</body>
</html>
