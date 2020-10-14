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
    <title>List</title>
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
            background-image: url("img/BG.jpg");
            background-size: 100% 100%;
            background-repeat: no-repeat;
        }

        .input_box_row {
            height: 40px;
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
                    <a class="nav-link" href="/clientSide">Home <span class="sr-only">(current)</span></a>
                    </li>
                <li class="nav-item navbars dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button"
                       data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        Customer
                    </a>
                    <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                        <a class="dropdown-item" href="/clientSide?action=create">Add new</a>
                        <a class="dropdown-item" href="/clientSide?action=read">List</a>
                    </div>
                </li>
            </ul>
            <form action="/clientSide" class="form-inline my-2 my-lg-1">
                <input type="hidden" name="action" value="find">
                <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search"
                       name="search">
                <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
            </form>
        </div>
    </nav>

    <%----------------------------------------------------CREATE ------------------------------------------------------%>
    <div align="center" style="color: red; font-weight: bold">
        <c:forEach var="msgList" items="${msgList}">
            <c:out value="${msgList}"></c:out><br>
        </c:forEach>
    </div>
    <div class="row">
        <div class="col-lg-4"></div>
        <div class="col-lg-4" style="border: blue solid 1px; background: darkgray" align="center">
            <div align="left">
                <form action="/clientSide" method="post">
                    <input type="hidden" name="action" value="create">
                    <h2 align="center">Register</h2>
                    <div class="row input_box_row">
                        <div class="col-lg-6">
                            ID
                        </div>
                        <div class="col-lg-6">
                            <input type="text" name="_id" placeholder="Id">
                        </div>
                    </div>
                    <div class="row input_box_row">
                        <div class="col-lg-6">
                            NAME
                        </div>
                        <div class="col-lg-6">
                            <input type="text" name="_name" placeholder="name">
                        </div>
                    </div>
                    <div class="row input_box_row">
                        <div class="col-lg-6">
                            TYPE
                        </div>
                        <div class="col-lg-6">
                           <select name="type_id">
                               <c:forEach var="" items="">
                                   <option value="${a}"><c:out value=""></c:out></option>
                               </c:forEach>
                           </select>
                        </div>
                    </div>
                    <br>
                    <div align="center"><input type="submit" value="Register"></div>
                </form>
            </div>
        </div>
        <div class="col-lg-4"></div>
    </div>
</body>
</html>
