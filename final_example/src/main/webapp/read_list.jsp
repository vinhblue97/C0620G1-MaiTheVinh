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


    </style>
</head>
<body>
<div class="container-fluid">
    <%----------------------------------------------------LOGO ---------------------------------------------------------%>
    <div class="row" id="logo_ten">
        <div class="col-xl-3">
            <img id="logo" src="img/avatar.jpg" class="rounded-circle" alt="Logo">
        </div>
        <div class="col-xl-7">

        </div>
        <div class="col-xl-2" style="margin: auto; font-weight: bold; float: right">
            <div align="center"><a href="#" data-toggle="modal"
                                   data-target="#createModal">
                <button>Add clientSide</button>
            </a></div>
        </div>
    </div>
    <%----------------------------------------------------NavBar ---------------------------------------------------------%>
    <nav class="navbar navbar-expand-lg navbar-light bg-light row">
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <form action="/clientSide" method="post" class="form-inline my-2 my-lg-1">
                <ul class="navbar-nav mr-auto" style="margin-left: 30px">
                    <li class="nav-item active">
                        <label>Type Area</label>
                        <select>
                            <option></option>
                        </select>
                    </li>
                    <li class="nav-item active">
                        <label>Price</label>
                        <input class="form-control mr-sm-2" type="search" placeholder="Enter Price" aria-label="Search"
                               name="find_price">
                    </li>
                </ul>
                <a href="/clientSide">
                    <button>Clear</button>
                </a>
                <div style="margin-left: 400px">
                    <input type="hidden" name="action" value="find">
                    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
                </div>
            </form>
        </div>
    </nav>

    <%----------------------------------------------------TABLE ------------------------------------------------------%>

    <div class="row" style="background: azure">
        <table class="table" id="">
            <thead class="thead-dark">
            <tr>
                <th scope="col"> Area Id</th>
                <th scope="col"> Area</th>
                <th scope="col"> Status</th>
                <th scope="col"> Floors</th>
                <th scope="col"> Office Type</th>
                <th scope="col"> Description</th>
                <th scope="col"> Rent Price</th>
                <th scope="col"> Begin Date</th>
                <th scope="col"> End Date</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="clientSide" items="${clientSideList}">
                <tr>
                    <th>
                        <div>${clientSide.getAreaId()}</div>
                    </th>
                    <td>
                        <div>${clientSide.getArea()}</div>
                    </td>
                    <td>
                        <c:choose>
                            <c:when test="${clientSide.getStatus() =='1'}">
                                <c:out value="Trống"></c:out>
                            </c:when>
                            <c:when test="${clientSide.getStatus() =='2'}">
                                <c:out value="Hạ Tầng"></c:out>
                            </c:when>
                            <c:when test="${clientSide.getStatus() =='3'}">
                                <c:out value="Đầy đủ"></c:out>
                            </c:when>
                        </c:choose>
                    </td>
                    <td>
                        <div>${clientSide.getFloors()}</div>
                    </td>
                    <td>
                        <c:forEach var="officeType" items="${officeTypeList}">
                            <c:if test="${clientSide.getOfficeType().equals(officeType.id)}">
                                <c:out value="${officeType.name}"></c:out>
                            </c:if>
                        </c:forEach>
                    </td>
                    <td>
                        <div>${clientSide.getDescription()}</div>
                    </td>
                    <td>
                        <div>${clientSide.getRentPrice()}</div>
                    </td>
                    <td>
                        <div>${clientSide. getBeginDate()}</div>
                    </td>
                    <td>
                        <div>${clientSide.getEndDate()}</div>
                    </td>
                    <td>
                        <a href="#" onclick="submitIdDelete('${clientSide.id}')" data-toggle="modal"
                           data-target="#deleteModal">
                            <i class="fas fa-trash" style="color: black"></i>
                        </a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
<%--&lt;%&ndash;----------------------------------------form submit delete customer ---------------------------------------------&ndash;%&gt;--%>
<%--<form action="/clientSide" id="_submit">--%>
<%--    <input type="hidden" name="action" value="delete">--%>
<%--    <input id="submitDelete" type="hidden" name="_id">--%>
<%--</form>--%>
<%--&lt;%&ndash;----------------------------------------form modal delete customer ---------------------------------------------&ndash;%&gt;--%>

<%--<div class="modal fade" id="deleteModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"--%>
<%--     aria-hidden="true">--%>
<%--    <div class="modal-dialog" role="document">--%>
<%--        <div class="modal-content">--%>
<%--            <div class="modal-header">--%>
<%--                <h5 class="modal-title" id="exampleModalLabel">Confirm Delete</h5>--%>
<%--                <button type="button" class="close" data-dismiss="modal" aria-label="Close">--%>
<%--                    <span aria-hidden="true">&times;</span>--%>
<%--                </button>--%>
<%--            </div>--%>
<%--            <div class="modal-body" style="color: #2632ff" id="deleteInfor">--%>
<%--                Are you sure to delete this customer?--%>
<%--            </div>--%>
<%--            <div class="modal-footer">--%>
<%--                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>--%>
<%--                <button type="button" class="btn btn-primary" onclick="submitDelete();">Save changes</button>--%>
<%--            </div>--%>
<%--        </div>--%>
<%--    </div>--%>
<%--</div>--%>
<%--&lt;%&ndash;-------------------------------------------CREATE MODAL----------------------------------------------------------&ndash;%&gt;--%>
<%--<div class="modal fade" id="createModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"--%>
<%--     aria-hidden="true">--%>
<%--    <div class="modal-dialog" role="document">--%>
<%--        <div class="modal-content">--%>
<%--            <div class="modal-header">--%>
<%--                <h5 class="modal-title" id="exampleModalLabel">Add Area</h5>--%>
<%--                <button type="button" class="close" data-dismiss="modal" aria-label="Close">--%>
<%--                    <span aria-hidden="true">&times;</span>--%>
<%--                </button>--%>
<%--            </div>--%>
<%--            <div class="modal-body">--%>
<%--                <form action="/clientSide" method="post">--%>
<%--                    <input type="hidden" name="action" value="create">--%>
<%--                    <div class="form-group">--%>
<%--                        <label for="area_id" class="col-form-label">Area Id</label>--%>
<%--                        <input type="text" name="area_id" id="area_id">--%>
<%--                        <p><small id="validateName"></small></p>--%>
<%--                    </div>--%>
<%--                    <div class="form-group">--%>
<%--                        <label for="area" class="col-form-label">Area</label>--%>
<%--                        <input type="text" name="area" id="area">--%>
<%--                        <p><small id="validatePrice"></small></p>--%>
<%--                    </div>--%>
<%--                    <div class="form-group">--%>
<%--                        <label class="col-form-label">Status</label>--%>
<%--                        <select name="status" id="status">--%>
<%--                            <option>Trống</option>--%>
<%--                            <option>Hạ Tầng</option>--%>
<%--                            <option>Đầy đủ</option>--%>
<%--                        </select>--%>
<%--                        <p><small id="validateQuantity"></small></p>--%>
<%--                    </div>--%>
<%--                    <div class="form-group">--%>
<%--                        <label for="floors" class="col-form-label">Floors</label>--%>
<%--                        <input type="text" name="floors" id="floors">--%>
<%--                    </div>--%>
<%--                    <div class="form-group">--%>
<%--                        <label for="office_type_id" class="col-form-label">Office Type</label>--%>
<%--                        <select name="office_type_id" id="office_type_id">--%>
<%--                            <c:forEach var="officeType" items="${officeTypeList}">--%>
<%--                                <option value="${officeType.id}">${officeType.name}</option>--%>
<%--                            </c:forEach>--%>
<%--                        </select>--%>
<%--                    </div>--%>
<%--                    <div class="form-group">--%>
<%--                        <label for="price" class="col-form-label">Rent price</label>--%>
<%--                        <input type="text" name="price" id="price">--%>
<%--                    </div>--%>
<%--                    <div class="form-group">--%>
<%--                        <label for="begin_date" class="col-form-label">Begin date</label>--%>
<%--                        <input type="text" name="begin_date" id="begin_date">--%>
<%--                    </div>--%>
<%--                    <div class="form-group">--%>
<%--                        <label for="end_date" class="col-form-label">End date</label>--%>
<%--                        <input type="text" name="end_date" id="end_date">--%>
<%--                    </div>--%>
<%--                    <input type="hidden" id="submit_action">--%>
<%--                </form>--%>
<%--                <div class="modal-footer">--%>
<%--                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>--%>
<%--                    <button class="btn btn-primary" onclick="validate();">Create</button>--%>
<%--                </div>--%>
<%--            </div>--%>
<%--        </div>--%>
<%--    </div>--%>
<%--</div>--%>
<%--&lt;%&ndash;------------------------------------------bootstrap phân trang--------------------------------------------------&ndash;%&gt;--%>
<%--&lt;%&ndash;<script src="jquery/jquery-3.5.1.min.js"></script>&ndash;%&gt;--%>
<%--<script src="datatables/js/jquery.dataTables.min.js"></script>--%>
<%--<script src="datatables/js/dataTables.bootstrap4.min.js"></script>--%>
<%--<script>--%>
<%--    // hàm phân trang--%>
<%--    $(document).ready(function () {--%>
<%--        $('#tableStudent').dataTable({--%>
<%--            "dom": 'lrtip',--%>
<%--            "lengthChange": false,--%>
<%--            "pageLength": 5--%>
<%--        });--%>
<%--    });--%>

<%--    // Function submit delete--%>
<%--    function submitIdDelete(id) {--%>
<%--        document.getElementById("submitDelete").value = id;--%>
<%--    }--%>

<%--    function submitDelete() {--%>
<%--        document.getElementById("_submit").submit();--%>
<%--    }--%>

<%--    //Function validate--%>
<%--    function validate() {--%>
<%--        var validateQuantityRegex = "/"--%>
<%--        validateName = document.getElementById("_name");--%>
<%--        validatePrice = document.getElementById("price");--%>
<%--        validateQuantity = document.getElementById("quantity");--%>
<%--        if (validateName.value === '') {--%>
<%--            document.getElementById("validateName").innerText = "Enter clientSide name please";--%>
<%--        } else {--%>
<%--            document.getElementById("validateName").innerText = '';--%>
<%--        }--%>
<%--        if (validatePrice.value === '') {--%>
<%--            document.getElementById("validatePrice").innerText = "Enter clientSide price please";--%>
<%--        } else if (parseFloat(validatePrice.value) < 10000000) {--%>
<%--            document.getElementById("validatePrice").innerText = '';--%>
<%--            document.getElementById("validatePrice").innerText = "Price at least 10.000.000";--%>
<%--        } else {--%>
<%--            document.getElementById("validatePrice").innerText = '';--%>
<%--        }--%>
<%--        if (validateQuantity.value === '') {--%>
<%--            document.getElementById("validateQuantity").innerText = "Enter clientSide quantity please";--%>
<%--        } else if (parseFloat(validateQuantity.value) < 0) {--%>
<%--            document.getElementById("validateQuantity").innerText = '';--%>
<%--            document.getElementById("validateQuantity").innerText = "Quantity > 0";--%>
<%--        } else {--%>
<%--            document.getElementById("validateQuantity").innerText = '';--%>
<%--        }--%>
<%--        document.getElementById("submit_action").submit();--%>
<%--    }--%>
<%--</script>--%>
</body>
</html>
