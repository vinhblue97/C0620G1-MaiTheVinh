function fCheck() {
    let a = parseInt(document.getElementById("numA").value);
    let b = parseInt(document.getElementById("numB").value);
    if (a%b==0){
        alert(`${a} chia hết cho ${b}`);
    }
    else alert(`${a} không chia hết cho ${b}`);

}