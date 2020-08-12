let addResult;
function addition() {
    let num1 = parseFloat(document.getElementById("num1").value);
    let num2 = parseFloat(document.getElementById("num2").value);
    addResult = num1 + num2;
    console.log(num1);
    console.log(num2);
    console.log(addResult);
    console.log(typeof (addResult));
    console.log(typeof (num1));
    console.log(typeof (num2));
    document.getElementById("result").innerText="Result Addition :"+ addResult;
}
function subtraction() {
    let num1 = parseFloat(document.getElementById("num1").value);
    let num2 = parseFloat(document.getElementById("num2").value);
    addResult = num1 - num2;
    document.getElementById("result").innerText="Result Subtraction :"+ addResult;

}
function mutiplication() {
    let num1 = parseFloat(document.getElementById("num1").value);
    let num2 = parseFloat(document.getElementById("num2").value);
    addResult = num1*num2;
    document.getElementById("result").innerText="Result Mutiplication :" +addResult;

}
function division() {
    let num1 = parseFloat(document.getElementById("num1").value);
    let num2 = parseFloat(document.getElementById("num2").value);
    addResult = num1/num2;
    document.getElementById("result").innerText="Result Division :" +addResult;

}