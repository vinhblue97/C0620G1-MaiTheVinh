<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Danh sách khách hàng</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
            integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
            crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
            integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
            crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
            integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
            crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.3/css/all.css">
    <style>
        .image{
            width: 50px;
            height: 50px;
        }
    </style>
</head>
<body>
<table class="table">
    <thead>
    <tr>
        <th scope="col">Name</th>
        <th scope="col">Birth Day</th>
        <th scope="col">Address</th>
        <th scope="col">Avatar</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="customer" items="${customerList}">
        <tr>
            <td><c:out value="${customer.name}"></c:out></td>
            <td><c:out value="${customer.birthDay}"></c:out></td>
            <td><c:out value="${customer.address}"></c:out></td>
            <td ><img class="image" src="${customer.imgPath}"></td>

        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
