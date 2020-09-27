<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 27/9/2020
  Time: 1:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Customer List</title>
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
        #logo {
            width: 100px;
            height: 100px;
        }

        #logo_ten {
            background-image: url("image/bia.png");
            width: 1600px;
            background-repeat: no-repeat;
        }

        .navbars {
            margin-left: 20px;
        }

        .input_box_row {
            height: 60px;
        }
    </style>
</head>
<body>
<div class="container-fluid">
    <!--    Tạo logo và tên -->
    <div class="row" id="logo_ten">
        <div class="col-lg-3">
            <img id="logo" src="image/avatar.jpg" class="rounded-circle" alt="Logo">
        </div>
        <div class="col-lg-7">

        </div>
        <div class="col-lg-2" style="margin: auto; font-weight: bold">
            Mai The Vinh
        </div>
    </div>
    <!--    Tạo navbar menu-->
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav mr-auto" style="margin-left: 30px">
                <li class="nav-item active">
                    <a class="nav-link" href="index.jsp">Home <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item navbars">
                    <a class="nav-link" href="#">Employee<span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item navbars dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button"
                       data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        Customer
                    </a>
                    <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                        <a class="dropdown-item" href="add_new_customer.jsp">Add new customer</a>
                        <a class="dropdown-item" href="#">Customer list</a>
                        <div class="dropdown-divider"></div>
                        <a class="dropdown-item" href="#">Something else here</a>
                    </div>
                </li>
                <li class="nav-item navbars">
                    <a class="nav-link" href="#">Service<span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item navbars">
                    <a class="nav-link" href="#">Contract<span class="sr-only">(current)</span></a>
                </li>
            </ul>
            <form class="form-inline my-2 my-lg-1">
                <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
            </form>
        </div>
    </nav>
    <%--    TẠO BẢNG CUSTOMER--%>
    <div class="row">
        <table class="table table-striped">
            <thead>
            <tr>
                <th scope="col">Name</th>
                <th scope="col">Birth Day</th>
                <th scope="col">Giới tính</th>
                <th scope="col">Id card</th>
                <th scope="col">Phone</th>
                <th scope="col">Email</th>
                <th scope="col">Type</th>
                <th scope="col">Address</th>
                <th scope="col">Edit</th>
                <th scope="col">Delete</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="customer" items="${customer_list}">
                <tr>
                    <td><c:out value=" ${customer.name}"></c:out></td>
                    <td><c:out value="${customer.birth_day}"></c:out></td>
                    <td>
                        <c:choose>
                            <c:when test="${customer.gender==0}">
                                <c:out value="Female"></c:out>
                            </c:when>
                            <c:when test="${customer.gender==1}">
                                <c:out value="Male"></c:out>
                            </c:when>
                            <c:otherwise>
                                <c:out value="Apache Helicopter"></c:out>
                            </c:otherwise>
                        </c:choose>
                    </td>
                    <th><c:out value=" ${customer.id}"></c:out></th>
                    <td><c:out value=" ${customer.email}"></c:out></td>
                    <td><c:out value=" ${customer.phone}"></c:out></td>
                    <td>
                        <c:choose>
                            <c:when test="${customer.type==0}">
                                <c:out value="Diamond"></c:out>
                            </c:when>
                            <c:when test="${customer.gender==1}">
                                <c:out value="Platinium"></c:out>
                            </c:when>
                            <c:when test="${customer.gender==2}">
                                <c:out value="Gold"></c:out>
                            </c:when>
                            <c:when test="${customer.gender==3}">
                                <c:out value="Silver"></c:out>
                            </c:when>
                            <c:when test="${customer.gender==4}">
                                <c:out value="Member"></c:out>
                            </c:when>
                        </c:choose>
                    </td>
                    <td><c:out value=" ${customer.address}"></c:out></td>
                    <td><input type="button" value="Edit" onclick="edit(${customer.id});"></td>
                    <td><input type="button" value="Delete" onclick="delete_customer(${customer.id});"></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
<script>
    function edit(value) {
        <c:forEach var="customer" items="${customer_list}">
        <c:if test="${customer.id==value}">
        ${customer_list.remove(customer)}
        </c:if>
        </c:forEach>
    }

    function delete_customer(value) {
        <c:forEach var="customer" items="${customer_list}">

        </c:forEach>
    }
</script>
</body>
</html>
