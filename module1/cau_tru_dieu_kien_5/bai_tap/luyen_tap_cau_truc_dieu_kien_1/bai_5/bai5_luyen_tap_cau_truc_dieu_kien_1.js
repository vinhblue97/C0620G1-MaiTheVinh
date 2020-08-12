function kiemTra() {
    let pFifteenScore = parseFloat(document.getElementById("fifteenScore").value);
    let pHalfScore = parseFloat(document.getElementById("halfScore").value);
    let pEndScore = parseFloat(document.getElementById("endScore").value);
    let avarageScore = pFifteenScore * 0.2 + pHalfScore * 0.2 + pEndScore * 0.6;
    if (avarageScore < 4) {
        alert("Xếp loại F");
    } else if (avarageScore < 6) {
        alert("Xếp loại D");
    } else if (avarageScore < 7) {
        alert("Xếp loại C");
    } else if (avarageScore < 8.5) {
        alert("Xếp loại B");
    } else {
        alert("Xếp loại D");
    }


}