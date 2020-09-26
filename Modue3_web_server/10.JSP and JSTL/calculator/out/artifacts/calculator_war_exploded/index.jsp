<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 25/9/2020
  Time: 3:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>[Bài tập] Ứng dụng Calculator</title>
    <style>
        #form{
            width: 600px;
            height: 200px;
        }
    </style>
</head>
<body>
<h2 align="center">Simple Calculator</h2>
<div align="center" style="width: 100%">
<div id="form" >
    <form action="/calculator">
        <fieldset>
            <legend>Caculator</legend>
            <label style="float: left"> First operand</label>
            <input id = "first_operand" type="text" value= " " name="first_operand" onchange="validate(this.value)"><br>
            <label style="float: left">Operator</label>
            <select name="select">
                <option>Addition</option>
                <option>Subtraction</option>
                <option>Multiplication</option>
                <option>Division</option>
            </select><br>
            <label style="float: left">Second operand</label>
            <input id="second_operand" type="text" value= " " name="second_operand" onchange="validate(this.value)"><br>
            <input type="submit" value="Calculate" align="center" onsubmit="calculate();">
        </fieldset>
    </form>
</div>
</div>
<script>
    announe();
    function announe() {
        if(${announce ==" "}){
            alert("Please enter input")
        }
    }
    function validate(value) {
        let regex = new RegExp("^\\s[0-9]*$");
        console.log(document.getElementById("first_operand").value);
        console.log(document.getElementById("second_operand").value);
        if (!regex.test(value+"")){
            alert("Please enter the number")
            document.getElementById("first_operand").value = " ";
            document.getElementById("second_operand").value = " ";
        }
    }

    function calculate() {
        let num1 = document.getElementById("first_operand");
        let num2 = document.getElementById("second_operand");
        if(num1===" "||num2===" "){
            alert("Please enter number");
        }

    }
</script>
</body>
</html>
