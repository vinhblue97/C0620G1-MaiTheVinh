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
    <title>Employee List</title>
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
    <%--    TẠO BẢNG Employee--%>
    <div class="row">
        <table id="tableStudent" class="table table-striped table-bordered">
            <thead>
            <tr>
                <%--                <th scope="col">Index</th>--%>
                <th scope="col">Id</th>
                <th scope="col">Name</th>
                <th scope="col">Position</th>
                <th scope="col">Level</th>
                <th scope="col">Office</th>
                <th scope="col">Birth day</th>
                <th scope="col">Id card</th>
                <th scope="col">Salary</th>
                <th scope="col">Phone</th>
                <th scope="col">Email</th>
                <th scope="col">Address</th>
                <th scope="col">Action</th>

            </tr>
            </thead>
            <tbody>
            <c:forEach var="employee" items="${employeeList}">
                <tr>
                    <th><c:out value=" ${employee.id}"></c:out></th>
                    <td>
                        <c:out value=" ${employee.last_name} ${employee.middle_name} ${employee.first_name}"></c:out>
                    </td>
                    <td>
                        <c:forEach var="position" items="${positionList}">
                            <c:if test="${employee.position_id.equals(position.id)}">
                                <c:out value="${position.name}"></c:out>
                            </c:if>
                        </c:forEach>
                    </td>
                    <td>
                        <c:forEach var="level" items="${levelList}">
                            <c:if test="${employee.level_id.equals(level.id)}">
                                <c:out value="${level.name}"></c:out>
                            </c:if>
                        </c:forEach>
                    </td>
                    <td>
                        <c:forEach var="office" items="${officeList}">
                            <c:if test="${employee.office_id.equals(office.id)}">
                                <c:out value="${office.name}"></c:out>
                            </c:if>
                        </c:forEach>
                    </td>
                    <td><c:out value=" ${employee.birth_day}"></c:out></td>
                    <td><c:out value=" ${employee.identify_card}"></c:out></td>
                    <td><c:out value=" ${employee.salary}"></c:out></td>
                    <td><c:out value=" ${employee.phone_number}"></c:out></td>
                    <td><c:out value=" ${employee.email}"></c:out></td>
                    <td><c:out value=" ${employee.address}"></c:out></td>
                    <td><a href="#">
                        <i class="fas fa-edit"
                           onclick="setInfor('${employee.id}', '${employee.last_name}','${employee.middle_name}',
                                   '${employee.first_name}','${employee.position_id}','${employee.level_id}',
                                   '${employee.office_id}', '${employee.birth_day}', '${employee.identify_card}',
                                   '${employee.salary}','${employee.phone_number}','${employee.email}',
                                   '${employee.address}');"
                           data-toggle="modal" data-target="#updateModal"></i>
                    </a>
                        <a href="/employee?action=delete&id=${employee.id}" style="margin-left: 10px">
                            <i class="fas fa-trash"></i>
                        </a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>

//modal update information

<div class="modal fade" id="updateModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
     aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Update</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <form action="/employee" method="post">
                    <input type="hidden" name="action" value="update">
                    <input type="hidden" name="id" id="update_id">
                    <div class="form-group">
                        <label for="last_name" class="col-form-label">Last name</label>
                        <input type="text" name="last_name" placeholder="Employee last name" id="last_name">
                    </div>
                    <div class="form-group">
                        <label for="middle_name" class="col-form-label">Middle name</label>
                        <input type="text" name="middle_name" id="middle_name" placeholder="Employee middle name">
                    </div>
                    <div class="form-group">
                        <label for="first_name" class="col-form-label">First name</label>
                        <input type="text" name="first_name" id="first_name" placeholder="Employee first name">
                    </div>
                    <div class="form-group">
                        <label for="position_id" class="col-form-label">Position</label>
                        <select name="position_id" id="position_id">
                            <c:forEach var="position" items="${positionList}">
                                <option value="${position.id}">${position.name}</option>
                            </c:forEach>
                        </select>
                    </div>
                    <div class="form-group">
                        <label for="level_id" class="col-form-label">Level</label>
                        <select name="level_id" id="level_id">
                            <c:forEach var="level" items="${levelList}">
                                <option value="${level.id}">${level.name}</option>
                            </c:forEach>
                        </select>
                    </div>
                    <div class="form-group">
                        <label for="office_id" class="col-form-label">Office</label>
                        <select name="office_id" id="office_id">
                            <c:forEach var="office" items="${officeList}">
                                <option value="${office.id}">${office.name}</option>
                            </c:forEach>
                        </select>
                    </div>
                    <div class="form-group">
                        <label for="birth_day" class="col-form-label">Birthday</label>
                        <input type="date" name="birth_day" id="birth_day" placeholder="Birthday">
                    </div>
                    <div class="form-group">
                        <label for="identify_card" class="col-form-label">Identify card</label>
                        <input type="text" name="identify_card" id="identify_card" placeholder="Identify card">
                    </div>
                    <div class="form-group">
                        <label for="salary" class="col-form-label">Salary</label>
                        <input type="text" name="salary" id="salary" placeholder="Salary">
                    </div>
                    <div class="form-group">
                        <label for="phone_number" class="col-form-label">Phone number</label>
                        <input type="text" name="phone_number" id="phone_number" placeholder="Phone number">
                    </div>
                    <div class="form-group">
                        <label for="email" class="col-form-label">Email</label>
                        <input type="text" name="email" id="email" placeholder="abc@abc.abc">
                    </div>
                    <div class="form-group">
                        <label for="address" class="col-form-label">Address</label>
                        <input type="text" name="address" id="address">
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                        <button class="btn btn-primary" onclick="validate()">Save</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>
// function set ID cho modal
<script>
    function setInfor(id, last_name, middle_name, first_name, position_id, level_id, office_id, birth_day, identify_card, salary, phone_number, email, address) {
        document.getElementById("update_id").value = id;
        document.getElementById("last_name").value = last_name;
        document.getElementById("middle_name").value = middle_name;
        document.getElementById("first_name").value = first_name;
        document.getElementById("position_id").value = position_id;
        document.getElementById("level_id").value = level_id;
        document.getElementById("office_id").value = office_id;
        document.getElementById("birth_day").value = birth_day;
        document.getElementById("identify_card").value = identify_card;
        document.getElementById("salary").value = salary;
        document.getElementById("phone_number").value = phone_number;
        document.getElementById("email").value = email;
        document.getElementById("address").value = address;
    }

    function validate() {
        document.getElementById("last_name") ==
    }
</script>
<script src="jquery/jquery-3.5.1.min.js"></script>
<script src="datatables/js/jquery.dataTables.min.js"></script>
<script src="datatables/js/dataTables.bootstrap4.min.js"></script>
<script>
    $(document).ready(function () {
        $('#tableStudent').dataTable({
            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 5
        });
    });
</script>

</body>
</html>

