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
                    <th scope="col">Identify card</th>
                    <th scope="col">Name</th>
                    <th scope="col">Birth Day</th>
                    <th scope="col">Gender</th>
                    <th scope="col">Phone</th>
                    <th scope="col">Email</th>
                    <th scope="col">Type</th>
                    <th scope="col">Address</th>
                    <th scope="col">Action</th>

                </tr>
                </thead>
                <tbody>
                <c:forEach var="customer" items="${customerList}">
                    <tr>
                        <td><c:out value=" ${customer.index_counter}"></c:out></td>
                        <th><c:out value=" ${customer.id}"></c:out></th>
                        <td><c:out value=" ${customer.identify_card}"></c:out></td>
                        <td><c:out value=" ${customer.name}"></c:out></td>
                        <td><c:out value="${customer.birthDay}"></c:out></td>
                        <td>
                            <c:choose>
                                <c:when test="${Integer.valueOf(customer.gender)==0}">
                                    <c:out value="Female"></c:out>
                                </c:when>
                                <c:when test="${Integer.valueOf(customer.gender)==1}">
                                    <c:out value="Male"></c:out>
                                </c:when>
                                <c:otherwise>
                                    <c:out value="Apache Helicopter"></c:out>
                                </c:otherwise>
                            </c:choose>
                        </td>
                            <td><c:out value=" ${customer.phone_number}"></c:out></td>
                        <td><c:out value=" ${customer.email}"></c:out></td>
                        <td>
                            <c:forEach var="typeOfCustomer" items="${typeOfCustomerList}">
                                <c:if test="${customer.type_of_customer_id.equals(typeOfCustomer.id)}">
                                    <c:out value="${typeOfCustomer.name}"></c:out>
                                </c:if>
                            </c:forEach>
                        </td>
                        <td><c:out value=" ${customer.address}"></c:out></td>
                        <td>
                                <%--icon edit information--%>
                            <a href="/customer?action=edit&id=${customer.id}">
                                <i class="fas fa-edit"></i>
                            </a>
                                <%-- icon delete information--%>
                            <a href="#" style="margin-left: 10px"
                               onclick="submitIdDelete('${customer.id}');"
                               data-toggle="modal" data-target="#deleteModal">
                                <i class="fas fa-trash"></i>
                            </a></td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>

<%-- form submit delete customer--%>
<form action="/customer" id="submit">
    <input type="hidden" name="action" value="delete">
    <input id="submitDelete" type="hidden" name="id">
</form>
<%-- form modal delete customer--%>
<div class="modal fade" id="deleteModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
     aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
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
