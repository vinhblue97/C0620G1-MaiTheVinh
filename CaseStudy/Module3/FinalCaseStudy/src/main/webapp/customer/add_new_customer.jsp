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
                    <a class="nav-link" href="/home"> Home <span class="sr-only">(current)</span></a>
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
                        <a class="dropdown-item" href="#">Add new customer</a>
                        <a class="dropdown-item" href="/customer?action=list">Customer list</a>
                    </div>
                </li>
                <li class="nav-item navbars">
                    <a class="nav-link" href="#">Service<span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item navbars">
                    <a class="nav-link" href="#">Contract<span class="sr-only">(current)</span></a>
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
        <div class="col-lg-4"></div>
        <div class="col-lg-4" style="border: blue solid 1px" align="center">
            <div align="left">
                <form action="/customer" method="post">
                    <input type="hidden" name="action" value="create">
                    <h2 align="center">Register</h2>
                    <div class="row input_box_row">
                        <div class="col-lg-6">
                            Customer id
                        </div>
                        <div class="col-lg-6">
                            <input type="text" name="id" placeholder="Customer Id">
                        </div>
                    </div>
                    <div class="row input_box_row">
                        <div class="col-lg-6">
                            Id card
                        </div>
                        <div class="col-lg-6">
                            <input type="text" name="identify_card" placeholder="identify_card">
                        </div>
                    </div>
                    <div class="row input_box_row">
                        <div class="col-lg-6">
                            Customer name
                        </div>
                        <div class="col-lg-6">
                            <input type="text" name="name" placeholder="Customer name">
                        </div>
                    </div>
                    <div class="row input_box_row">
                        <div class="col-lg-6">
                            Birth day
                        </div>
                        <div class="col-lg-6">
                            <input type="date" name="birthDay" placeholder="Birthday">
                        </div>
                    </div>
                    <div class="row input_box_row">
                        <div class="col-lg-6">
                            Gender
                        </div>
                        <div class="col-lg-6">
                            <select name="gender">
                                <option value="0">Female</option>
                                <option value="1">Male</option>
                                <option value="3">Apache Helicopter</option>
                            </select>
                        </div>
                    </div>

                    <div class="row input_box_row">
                        <div class="col-lg-6">
                            Number phone
                        </div>
                        <div class="col-lg-6">
                            <input type="text" name="phone_number" placeholder="phone_number">
                        </div>
                    </div>
                    <div class="row input_box_row">
                        <div class="col-lg-6">
                            Email
                        </div>
                        <div class="col-lg-6">
                            <input type="text" name="email" placeholder="abc@abc.abc">
                        </div>
                    </div>
                    <div class="row input_box_row">
                        <div class="col-lg-6">
                            Type
                        </div>
                        <div class="col-lg-6">
                            <select name="type_of_customer_id">
                                <option value="0">Diamond</option>
                                <option value="1">Platinium</option>
                                <option value="2">Gold</option>
                                <option value="3">Silver</option>
                                <option value="4">Member</option>
                            </select>
                        </div>
                    </div>
                    <div class="row input_box_row">
                        <div class="col-lg-6">
                            Address
                        </div>
                        <div class="col-lg-6">
                            <input type="text" name="address">
                        </div>
                    </div>
                    <br>
                    <div align="center"><input type="submit" value="Register"></div>
                </form>
            </div>
        </div>
        <div class="col-lg-4"></div>
    </div>
</div>
<script>

</script>
</body>
</html>
