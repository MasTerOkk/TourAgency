<%--
  Created by IntelliJ IDEA.
  User: Capybara
  Date: 29.02.2024
  Time: 16:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<style>
    <%@include file="../../../WEB-Content/css/style.css" %>
</style>

<html>
<head>
    <title>cart</title>
</head>

<body>
    <%@ include file="../General/header.jsp" %>
    <main class="main">
        <div class="container">
            <table class="table">
                <thead>
                <tr>
                    <th>name</th>
                    <th>price</th>
                    <th>placesCount</th>
                    <th>plus</th>
                    <th>minus</th>
                </tr>
                </thead>
                <!--tbody>
                <c:forEach var="product" items="${allTours}">
                    <tr>
                        <td><c:out value="${product.getName()}"/></td>
                        <td><c:out value="${product.getPrice()}"/></td>
                        <td><c:out value="${product.getCountOfPlaces() - product.getRemainingSeats()}"/></td>
                        <td>В корзину</td>
                        <td>Редактировать</td>
                    </tr>
                </c:forEach>
                </tbody-->
            </table>
        </div>
    </main>
</body>
</html>
