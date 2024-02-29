<%--
  Created by IntelliJ IDEA.
  User: Capybara
  Date: 29.02.2024
  Time: 15:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>

<style>
    <%@include file="../../../WEB-Content/css/style.css" %>
</style>

<html>
<head>
    <title>Create</title>
</head>

<body>
    <%@ include file="../General/header.jsp" %>
    <hr>
    <main>
        <form:form action="createTour" modelAttribute="tour" method="post">
            <table>
                <tr>
                    <td>Name</td>
                    <td><form:input path="name"/></td>
                </tr>
                <tr>
                    <td>Price</td>
                    <td><form:input path="price"/></td>
                </tr>
                <tr>
                    <td>Count Seats</td>
                    <td><form:input path="countOfPlaces"/></td>
                </tr>
                <tr>
                    <td colspan="1"><input type="submit" value="SUBMIT"></td>
                </tr>
            </table>
        </form:form>
    </main>
</body>
</html>
