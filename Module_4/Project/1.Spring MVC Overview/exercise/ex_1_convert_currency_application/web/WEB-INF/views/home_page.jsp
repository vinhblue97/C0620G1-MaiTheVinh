<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 13/10/2020
  Time: 3:44 PM
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
</head>
<body>
<div class="container-fluid">
    <form action="/convert" method="post">
        <div class="row">
            <div class="col-lg-6" align="center"><h2 style="color: blue; font-weight: bold">Convert Currency</h2></div>
        </div>
        <div class="row">
            <div class="col-lg-3" align="center"><b>From</b></div>
            <div class="col-lg-3" align="center"><b>To</b></div>
        </div>
        <div class="row" style="margin-top: 10px">
            <div class="col-lg-3" align="center">
                <select name="type_1">
                  <c:choose>
                      <c:when test="${type_1.equals('0')}">
                          <option value="1">VNĐ</option>
                          <option value="2">Dolla Mỹ</option>
                      </c:when>
                      <c:when test="${type_1.equals('1')}">
                          <option value="1" selected="selected">VNĐ</option>
                          <option value="2">Dolla Mỹ</option>
                      </c:when>
                      <c:when test="${type_1.equals('2')}">
                          <option value="1">VNĐ</option>
                          <option value="2" selected="selected">Dolla Mỹ</option>
                      </c:when>
                  </c:choose>
                </select>
            </div>
            <div class="col-lg-3" align="center">
                <select name="type_2">
                    <c:choose>
                        <c:when test="${type_2.equals('0')}">
                            <option value="1">VNĐ</option>
                            <option value="2">Dolla Mỹ</option>
                        </c:when>
                        <c:when test="${type_2.equals('1')}">
                            <option value="1" selected="selected">VNĐ</option>
                            <option value="2">Dolla Mỹ</option>
                        </c:when>
                        <c:when test="${type_2.equals('2')}">
                            <option value="1">VNĐ</option>
                            <option value="2" selected="selected">Dolla Mỹ</option>
                        </c:when>
                    </c:choose>
                </select>
            </div>
        </div>
        <div class="row" style="margin-top: 10px">
            <div class="col-lg-3" align="center">
                <input type="text" name="currency" value="${currency}">
            </div>
            <div class="col-lg-3" align="center">
                <input type="text" id="result" style="color:red" value="${result}">
            </div>
        </div>
        <div class="row">
            <div class="col-lg-6" align="center">
                <button type="submit" style="height: 50px; width:100px"> Convert</button>
            </div>
        </div>
    </form>
</div>
<script>

</script>
</body>
</html>
