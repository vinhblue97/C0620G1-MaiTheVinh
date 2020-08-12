function fCheck() {
    let pNum=parseInt(document.getElementById("mAge").value);
    if (pNum < 120 && pNum > 0){
        alert(`${pNum} là tuổi của 1 người`);
    }
    else {
        alert(`${pNum} không phải là tuổi của 1 người`);
    }
}