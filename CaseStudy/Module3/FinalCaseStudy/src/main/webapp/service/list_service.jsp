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
    <title>Service List</title>
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
            <img id="logo" src="../image/avatar.jpg" class="rounded-circle" alt="Logo">
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
    <%--    TẠO BẢNG CUSTOMER--%>
    <div class="row">
        <div class="col-lg-12">
            <table id="tableStudent" class="table table-striped table-bordered" align="center">
                <thead>
                <tr>
                    <th scope="col">Index</th>
                    <th scope="col">Id</th>
                    <th scope="col">Name</th>
                    <th scope="col">Area</th>
                    <th scope="col">Cost</th>
                    <th scope="col">Floors</th>
                    <th scope="col">Max people</th>
                    <th scope="col">Type Service</th>
                    <th scope="col">Type Rent</th>
                    <th scope="col">Standard Room</th>
                    <th scope="col">Pool area</th>
                    <th scope="col">Status</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="service" items="${serviceList}">
                    <tr>
                        <td><c:out value=" ${service.index}"></c:out></td>
                        <th><c:out value=" ${service.id}"></c:out></th>
                        <td><c:out value=" ${service.name}"></c:out></td>
                        <td><c:out value="${service.area}"></c:out></td>
                        <td><c:out value="${service.floor}"></c:out></td>
                        <td><c:out value=" ${service.max_people}"></c:out></td>
                        <td><c:out value=" ${service.cost}"></c:out></td>
                        <td>
                            <c:choose>
                                <c:when test="${service.type_of_service_id=='1'}">
                                    <c:out value="Villa"></c:out>
                                </c:when>
                                <c:when test="${service.type_of_service_id=='2'}">
                                    <c:out value="House"></c:out>
                                </c:when>
                                <c:when test="${service.type_of_service_id=='3'}">
                                    <c:out value="Room"></c:out>
                                </c:when>
                            </c:choose>
                        </td>
                        <td>
                            <c:forEach var="type_rent" items="${typeOfRentList}">
                                <c:if test="${service.type_rent_id.equals(type_rent.id)}">
                                    <c:out value="${type_rent.name}"></c:out>
                                </c:if>
                            </c:forEach>
                        </td>
                        <c:choose>
                            <c:when test="${service.type_of_service_id == '1' || service.type_of_service_id == '2'}">
                                <td><c:out value="${service.standard_room}"> </c:out></td>
                                <td><c:out value="${service.pool_area}"></c:out></td>
                                <td><c:out value="${service.description_other_convenience}"></c:out></td>
                            </c:when>
                            <c:when test="${service.type_of_service_id=='3'}">
                                <td></td>
                                <td></td>
                                <td></td>
                            </c:when>
                        </c:choose>

                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>
// bootstrap phân trang
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
    function submitIdDelete(id, customerList) {
        document.getElementById("submitDelete").value = id;

    }

    function submitDelete() {
        document.getElementById("submit").submit();
    }
</script>
</body>
</html>
