<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 26/9/2020
  Time: 1:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Customer</title>
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
            background-image: url("../image/bia.png");
            width: 1600px;
            background-repeat: no-repeat;
        }

        .navbars {
            margin-left: 20px;
        }

        .input_box_row {
            height: 60px;
        }

        .text_box_service {
            width: 200px;
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
                    <a class="nav-link" href="/home">Home <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item navbars dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button"
                       data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        Employee
                    </a>
                    <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                        <a class="dropdown-item" href="/employee?action=create">Add new employee</a>
                        <a class="dropdown-item" href="/employee?action=list">Employee list</a>
                    </div>
                </li>
                <li class="nav-item navbars dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button"
                       data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        Customer
                    </a>
                    <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                        <a class="dropdown-item" href="/customer?action=create">Add new customer</a>
                        <a class="dropdown-item" href="/customer?action=list">Customer list</a>
                    </div>
                </li>
                <li class="nav-item navbars dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button"
                       data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        Service
                    </a>
                    <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                        <a class="dropdown-item" href="/service?action=create">Add new service</a>
                        <a class="dropdown-item" href="/service?action=list">Service list</a>
                    </div>
                </li>
                <li class="nav-item navbars dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button"
                       data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        Contract
                    </a>
                    <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                        <a class="dropdown-item" href="/contract?action=create">Add new contract</a>
                        <a class="dropdown-item" href="/contract?action=list">Contract list</a>
                        <a class="dropdown-item" href="/contract_detail?action=create">Add new contract Detail</a>
                        <a class="dropdown-item" href="/contract_detail?action=list">Contract detail list</a>
                    </div>
                </li>
            </ul>
            <form action="/customer" class="form-inline my-2 my-lg-1">
                <input type="hidden" name="action" value="find">
                <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search"
                       name="search">
                <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
            </form>
        </div>
    </nav>
    <%--    TẠO BOX REGISTER--%>
    <div class="row">
        <div class="col-lg-4">
            <p>
                <button class="btn btn-primary" type="button" data-toggle="collapse" data-target="#villa"
                        aria-expanded="false" aria-controls="villa">
                    Villa
                </button>
            </p>
        </div>
        <div class="col-lg-4">
            <p>
                <button class="btn btn-primary" type="button" data-toggle="collapse" data-target="#house"
                        aria-expanded="false" aria-controls="house">
                    House
                </button>
            </p>
        </div>
        <div class="col-lg-4">
            <p>
                <button class="btn btn-primary" type="button" data-toggle="collapse" data-target="#room"
                        aria-expanded="false"
                        aria-controls="room">
                    Room
                </button>
            </p>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-4">
            <div class="row">
                <div class="collapse" id="villa">
                    <div class="card card-body">
                        <div align="left">
                            <form action="/service" method="post">
                                <input type="hidden" name="action" value="create">
                                <input type="hidden" name="type_of_service_id" value="1">
                                <h2 align="center">Register Villa</h2>
                                <div class="row input_box_row">
                                    <div class="col-lg-5">
                                        Id
                                    </div>
                                    <div class="col-lg-7">
                                        <input class="text_box_service" type="text" name="id" placeholder="Service Id">
                                    </div>
                                </div>
                                <div class="row input_box_row">
                                    <div class="col-lg-5">
                                        Name
                                    </div>
                                    <div class="col-lg-7">
                                        <input class="text_box_service" type="text" name="name">
                                    </div>
                                </div>
                                <div class="row input_box_row">
                                    <div class="col-lg-5">
                                        Area
                                    </div>
                                    <div class="col-lg-7">
                                        <input class="text_box_service" type="text" name="area" placeholder="Area">
                                    </div>
                                </div>
                                <div class="row input_box_row">
                                    <div class="col-lg-5">
                                        Floor
                                    </div>
                                    <div class="col-lg-7">
                                        <input class="text_box_service" type="text" name="floors" placeholder="Floor">
                                    </div>
                                </div>
                                <div class="row input_box_row">
                                    <div class="col-lg-5">
                                        Max People
                                    </div>
                                    <div class="col-lg-7">
                                        <input class="text_box_service" type="text" name="max_people"
                                               placeholder="Max people">
                                    </div>
                                </div>
                                <div class="row input_box_row">
                                    <div class="col-lg-5">
                                        Cost
                                    </div>
                                    <div class="col-lg-7">
                                        <input class="text_box_service" type="text" name="cost" placeholder="Cost">
                                    </div>
                                </div>
                                <div class="row input_box_row">
                                    <div class="col-lg-5">
                                        Type Rent
                                    </div>
                                    <div class="col-lg-7">
                                        <select name="type_rent_id">
                                            <c:forEach var="typeOfRentList" items="${typeOfRentList}">
                                                <option value="${typeOfRentList.id}">${typeOfRentList.name}</option>
                                            </c:forEach>
                                        </select>
                                    </div>
                                </div>
                                <div class="row input_box_row">
                                    <div class="col-lg-5">
                                        Standard room
                                    </div>
                                    <div class="col-lg-7">
                                        <select name="standard_room">
                                            <option value="1">1*</option>
                                            <option value="2">2*</option>
                                            <option value="3">3*</option>
                                            <option value="4">4*</option>
                                            <option value="5">5*</option>
                                        </select>
                                    </div>
                                </div>
                                <div class="row input_box_row">
                                    <div class="col-lg-5">
                                        Desctiption
                                    </div>
                                    <div class="col-lg-7">
                                        <input class="text_box_service" type="text"
                                               name="description_other_convenience">
                                    </div>
                                </div>
                                <div class="row input_box_row">
                                    <div class="col-lg-5">
                                        Pool Area
                                    </div>
                                    <div class="col-lg-7">
                                        <input class="text_box_service" type="text" name="pool_area">
                                    </div>
                                </div>
                                <br>
                                <div align="center"><input type="submit" value="Register"></div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="col-lg-4">
            <div class="row">
                <div class="collapse" id="house">
                    <div class="card card-body">
                        <div align="left">
                            <form action="/service" method="post">
                                <input type="hidden" name="action" value="create">
                                <input type="hidden" name="type_of_service_id" value="2">
                                <h2 align="center">Register House</h2>
                                <div class="row input_box_row">
                                    <div class="col-lg-5">
                                        Id
                                    </div>
                                    <div class="col-lg-7">
                                        <input class="text_box_service" type="text" name="id" placeholder="Service Id">
                                    </div>
                                </div>
                                <div class="row input_box_row">
                                    <div class="col-lg-5">
                                        Name
                                    </div>
                                    <div class="col-lg-7">
                                        <input class="text_box_service" type="text" name="name">
                                    </div>
                                </div>
                                <div class="row input_box_row">
                                    <div class="col-lg-5">
                                        Area
                                    </div>
                                    <div class="col-lg-7">
                                        <input class="text_box_service" type="text" name="area" placeholder="Area">
                                    </div>
                                </div>
                                <div class="row input_box_row">
                                    <div class="col-lg-5">
                                        Floor
                                    </div>
                                    <div class="col-lg-7">
                                        <input class="text_box_service" type="text" name="floors" placeholder="Floor">
                                    </div>
                                </div>
                                <div class="row input_box_row">
                                    <div class="col-lg-5">
                                        Max People
                                    </div>
                                    <div class="col-lg-7">
                                        <input class="text_box_service" type="text" name="max_people"
                                               placeholder="Max people">
                                    </div>
                                </div>
                                <div class="row input_box_row">
                                    <div class="col-lg-5">
                                        Cost
                                    </div>
                                    <div class="col-lg-7">
                                        <input class="text_box_service" type="text" name="cost" placeholder="Cost">
                                    </div>
                                </div>
                                <div class="row input_box_row">
                                    <div class="col-lg-5">
                                        Type Rent
                                    </div>
                                    <div class="col-lg-7">
                                        <select name="type_rent_id">
                                            <c:forEach var="typeOfRentList" items="${typeOfRentList}">
                                                <option value="${typeOfRentList.id}">${typeOfRentList.name}</option>
                                            </c:forEach>
                                        </select>
                                    </div>
                                </div>
                                <div class="row input_box_row">
                                    <div class="col-lg-5">
                                        Standard room
                                    </div>
                                    <div class="col-lg-7">
                                        <select name="standard_room">
                                            <option value="1">1*</option>
                                            <option value="2">2*</option>
                                            <option value="3">3*</option>
                                            <option value="4">4*</option>
                                            <option value="5">5*</option>
                                        </select>
                                    </div>
                                </div>
                                <div class="row input_box_row">
                                    <div class="col-lg-5">
                                        Desctiption
                                    </div>
                                    <div class="col-lg-7">
                                        <input class="text_box_service" type="text"
                                               name="description_other_convenience">
                                    </div>
                                </div>
                                <div class="row input_box_row">
                                    <div class="col-lg-5">
                                        Pool Area
                                    </div>
                                    <div class="col-lg-7">
                                        <input class="text_box_service" type="text" name="pool_area">
                                    </div>
                                </div>
                                <br>
                                <div align="center"><input type="submit" value="Register"></div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="col-lg-4">
            <div class="row">
                <div class="collapse" id="room">
                    <div class="card card-body">
                        <div align="left">
                            <form action="/service" method="post">
                                <input type="hidden" name="action" value="create">
                                <input type="hidden" name="type_of_service_id" value="3">
                                <h2 align="center">Register Room</h2>
                                <div class="row input_box_row">
                                    <div class="col-lg-5">
                                        Id
                                    </div>
                                    <div class="col-lg-7">
                                        <input class="text_box_service" type="text" name="id" placeholder="Service Id">
                                    </div>
                                </div>
                                <div class="row input_box_row">
                                    <div class="col-lg-5">
                                        Name
                                    </div>
                                    <div class="col-lg-7">
                                        <input class="text_box_service" type="text" name="name">
                                    </div>
                                </div>
                                <div class="row input_box_row">
                                    <div class="col-lg-5">
                                        Area
                                    </div>
                                    <div class="col-lg-7">
                                        <input class="text_box_service" type="text" name="area" placeholder="Area">
                                    </div>
                                </div>
                                <div class="row input_box_row">
                                    <div class="col-lg-5">
                                        Floor
                                    </div>
                                    <div class="col-lg-7">
                                        <input class="text_box_service" type="text" name="floors" placeholder="Floor">
                                    </div>
                                </div>
                                <div class="row input_box_row">
                                    <div class="col-lg-5">
                                        Max People
                                    </div>
                                    <div class="col-lg-7">
                                        <input class="text_box_service" type="text" name="max_people"
                                               placeholder="Max people">
                                    </div>
                                </div>
                                <div class="row input_box_row">
                                    <div class="col-lg-5">
                                        Cost
                                    </div>
                                    <div class="col-lg-7">
                                        <input class="text_box_service" type="text" name="cost" placeholder="Cost">
                                    </div>
                                </div>
                                <div class="row input_box_row">
                                    <div class="col-lg-5">
                                        Type Rent
                                    </div>
                                    <div class="col-lg-7">
                                        <select name="type_rent_id">
                                            <c:forEach var="typeOfRentList" items="${typeOfRentList}">
                                                <option value="${typeOfRentList.id}">${typeOfRentList.name}</option>
                                            </c:forEach>
                                        </select>
                                    </div>
                                </div>
                                <br>
                                <div align="center"><input type="submit" value="Register"></div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
