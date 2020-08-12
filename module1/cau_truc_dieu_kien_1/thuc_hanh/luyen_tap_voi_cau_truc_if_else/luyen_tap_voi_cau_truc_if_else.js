function fCheckCondition(){
    let paCheck=document.getElementById("fInput").value;
    if (paCheck=="ECMAScript"){
        document.getElementById("result").innerText="Right";
    }
    else {
        document.getElementById("result").innerText="Didn’t know? ECMAScript!";
        if (paCheck == ""){
            document.getElementById("result").innerText="";
        }
    }
}