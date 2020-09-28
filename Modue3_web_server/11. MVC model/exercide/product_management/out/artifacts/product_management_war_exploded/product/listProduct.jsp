<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 28/9/2020
  Time: 9:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>List Product</title>
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
</head>
<body>

<div class="container-fluid">
    <div class="row">
        <div class="col-lg-9">
        </div>
        <div class="col-lg-3" align="right">
            <form action="/product" class="form-inline my-2 my-lg-0" style="padding: 5px 0px">
                <input type="hidden" name="action" value="search">
                <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search" name="search">
                <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
            </form>
        </div>
    </div>
    <div class="row">
        <table class="table table-striped">
            <thead>
            <tr align="center">
                <th scope="col">id</th>
                <th scope="col">Name</th>
                <th scope="col">Cost</th>
                <th scope="col">Description</th>
                <th scope="col">Producer</th>
                <th scope="col">Edit</th>
                <th scope="col">Delete</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="product" items="${productList}">
                <tr>
                    <th scope="row"><c:out value="${product.id}"></c:out></th>
                    <td><c:out value="${product.name}"></c:out></td>
                    <td><c:out value="${product.cost}"></c:out></td>
                    <td><c:out value="${product.description}"></c:out></td>
                    <td><c:out value="${product.producer}"></c:out></td>
                    <td><a href="/product?action=update&id=${product.id}">
                        <button>Update</button>
                    </a></td>
                    <td><a href="/product?action=delete&id=${product.id}">
                        <button>Delete</button>
                    </a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
    <div class="row">
        <a href="/product?action=create">
            <button>Create</button>
        </a>
    </div>
</div>
</body>
</html>
