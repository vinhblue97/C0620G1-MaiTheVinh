<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 28/9/2020
  Time: 9:07 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Product</title>
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
<form action="/product" method="post">
    <input type="hidden" name="action" value="create">
    <div class="modal-body">
        <div class="form-group">
            <label>Id</label>
            <input type="text" class="form-control" name="product_id" required>
        </div>
        <div class="form-group">
            <label>Name</label>
            <input type="text" class="form-control" name="product_name" required>
        </div>
        <div class="form-group">
            <label>Cost</label>
            <textarea  type="email" class="form-control" name="product_cost" required></textarea>
        </div>
        <div class="form-group">
            <label>Description</label>
            <input type="text" class="form-control" name="product_dresciption" required>
        </div>
        <div class="form-group">
            <label>Producer</label>
            <input type="text" class="form-control" name="product_producer" required>
        </div>
    </div>
    <div class="modal-footer">
        <a href="/product?action=null"><input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel"></a>
        <input type="submit" class="btn btn-info" value="Save">
    </div>
</form>

</body>
</html>
