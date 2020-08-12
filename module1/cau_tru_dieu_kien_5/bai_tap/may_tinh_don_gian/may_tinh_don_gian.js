function calculator(m) {
    if(m!="="){
        document.getElementById("display").value+=m;
    }
    else{
        document.getElementById("display").value = eval(document.getElementById("display").value);
    }
}