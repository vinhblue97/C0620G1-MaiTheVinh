<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 26/9/2020
  Time: 1:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
            background-image: url("image/bia.png");
            width: 1600px;
            background-repeat: no-repeat;
        }

        .navbars {
            margin-left: 20px;
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
                    <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item navbars">
                    <a class="nav-link" href="#">Employee<span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item navbars">
                    <a class="nav-link" href="customer.jsp">Customer<span class="sr-only">(current)</span></a>
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
    <div class="row">
        <div class="col-lg-4">
            <div align="left">
                <form action="/add_customer" method="post">
                    <h2 align="center">Register</h2>
                    <label> User name <input type="text" name="customer_name" placeholder="User name"></label>
                    <label>Birth day<input type="date" name="customer_birthday" placeholder="Birthday"
                                           style="margin-left: 10px"></label>
                    <label>Gender
                        <select>
                            <option>Male</option>
                            <option>Female</option>
                            <option>Apache Helicopter</option>
                        </select>
                    </label>
                </form>
            </div>
        </div>
        <div class="col-lg-8">

        </div>
    </div>
</div>
</body>
</html>
