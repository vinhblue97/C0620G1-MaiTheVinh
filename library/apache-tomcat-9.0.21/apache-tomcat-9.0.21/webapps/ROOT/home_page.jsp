<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 7/10/2020
  Time: 9:08 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Home</title>
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

        .navbars {
            margin-left: 20px;
        }

        body {
            background-image: url("img/background.jpg");
            background-size: 100% 100%;
            background-repeat: no-repeat;
        }
    </style>
</head>
<body>
<div class="container-fluid">
    <%----------------------------------------------------LOGO ---------------------------------------------------------%>
    <div class="row" id="logo_ten">
        <div class="col-xl-3">
            <img id="logo" src="../image/avatar.jpg" class="rounded-circle" alt="Logo">
        </div>
        <div class="col-xl-7">

        </div>
        <div class="col-xl-2" style="margin: auto; font-weight: bold; float: right">
            Mai Thế Vinh
        </div>
    </div>
    <%----------------------------------------------------NavBar ---------------------------------------------------------%>
    <nav class="navbar navbar-expand-lg navbar-light bg-light row">
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav mr-auto" style="margin-left: 30px">
                <li class="nav-item active">
                    <a class="nav-link" href="/exam">Home <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item navbars dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button"
                       data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        Customer
                    </a>
                    <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                        <a class="dropdown-item" href="/exam?action=create">Add new</a>
                        <a class="dropdown-item" href="/exam?action=read">List</a>
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
    <%----------------------------------------------------FOOTER ---------------------------------------------------------%>
    <footer class="page-footer font-small blue">
        <div class="footer-copyright text-center py-3">Bootstrap
            <a href="https://www.facebook.com/VinhBIue/posts/1430420450495688" style="color: black"> Bootstrap hân hạnh tài trợ project này</a>
        </div>
    </footer>
</div>
</body>
</html>