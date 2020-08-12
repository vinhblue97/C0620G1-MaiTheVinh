function kiemTra() {
    let pFirstNum = parseInt(document.getElementById("firstNum").value);
    let pSecondNum = parseInt(document.getElementById("secondNum").value);
    let pThirdNum = parseInt(document.getElementById("thirdNum").value);
    if (pFirstNum > pSecondNum) {
        if (pFirstNum > pThirdNum) {
            alert(`${pFirstNum} là số lớn nhất`);
        } else {
            alert(`${pThirdNum} là số lớn nhất`);
        }
    } else if (pSecondNum > pThirdNum) {
        alert(`${pSecondNum} là số lớn nhất`);
    } else alert(`${pThirdNum} là số lớn nhất`);

}