function kiemTra() {
    let pNum=parseInt(document.getElementById("firstNum").value);
    if (pNum<0){
        alert(`${pNum} nhỏ hơn 0`);
    }
    else {
        alert(`${pNum} lớn hơn 0`);
    }

}