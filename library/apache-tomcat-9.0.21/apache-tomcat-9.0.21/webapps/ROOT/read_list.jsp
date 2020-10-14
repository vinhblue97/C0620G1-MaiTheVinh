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
            <form action="/exam" class="form-inline my-2 my-lg-1">
                <input type="hidden" name="action" value="find">
                <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search"
                       name="search">
                <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
            </form>
        </div>
    </nav>

    <%----------------------------------------------------TABLE ------------------------------------------------------%>
    <div class="row">
        <table class="table" id="">
            <thead class="thead-dark">
            <tr>
                <th scope="col">
                    <div align="center">Id</div>
                </th>
                <th scope="col">
                    <div align="center">Name</div>
                </th>
                <th scope="col">
                    <div align="center">Name</div>
                </th>
                <th scope="col">
                    <div align="center">Name</div>
                </th>
                <th scope="col">
                    <div align="center">Name</div>
                </th>
                <th scope="col">
                    <div align="center">Name</div>
                </th>
                <th scope="col">
                    <div align="center">Edit</div>
                </th>
                <th scope="col">
                    <div align="center">Delete</div>
                </th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="exam" items="${examList}">
                <tr>
                    <th>
                        <div>${exam.id}</div>
                    </th>
                    <td>
                        <div>${exam.name}</div>
                    </td>
                    <td>
                        <div align="center">

                        </div>
                    </td>
                    <td>
                        <div align="center">123123212131 2312321361231</div>
                    </td>
                    <td>
                        <div align="center">123123212131 2312321361231</div>
                    </td>
                    <td>
                        <div align="center">123123212131 2312321361231</div>
                    </td>
                    <td>
                        <a href="#">
                            <div align="center"><i class="fas fa-edit" style="color: black"></i></div>
                        </a>
                    </td>
                    <td>
                        <a href="#" onclick="submitIdDelete('${exam.id}')" data-toggle="modal"
                           data-target="#deleteModal">
                            <div align="center"><i class="fas fa-trash" style="color: black"></i></div>
                        </a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
<%------------------------------------------form submit delete customer -----------------------------------------------%>
<form action="/exam" id="_submit">
    <input type="hidden" name="action" value="delete">
    <input id="submitDelete" type="hidden" name="_id">
</form>
<%------------------------------------------form modal delete customer -----------------------------------------------%>

<div class="modal fade" id="deleteModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
     aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Confirm Delete</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body" style="color: #2632ff" id="deleteInfor">
                Are you sure to delete this customer?
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                <button type="button" class="btn btn-primary" onclick="submitDelete();">Save changes</button>
            </div>
        </div>
    </div>
</div>
<%--------------------------------------------bootstrap phân trang----------------------------------------------------%>
<script src="jquery/jquery-3.5.1.min.js"></script>
<script src="datatables/js/jquery.dataTables.min.js"></script>
<script src="datatables/js/dataTables.bootstrap4.min.js"></script>
<script>
    // hàm phân trang
    $(document).ready(function () {
        $('#tableStudent').dataTable({
            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 5
        });
    });

    // Function submit delete
    function submitIdDelete(id) {
        document.getElementById("submitDelete").value = id;
    }

    function submitDelete() {
        document.getElementById("_submit").submit();
    }
</script>
</body>
</html>
