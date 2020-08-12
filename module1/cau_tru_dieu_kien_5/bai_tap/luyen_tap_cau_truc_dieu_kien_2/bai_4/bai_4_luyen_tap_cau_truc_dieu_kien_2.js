function fCalculateArea() {
    let pDai=parseFloat(document.getElementById("dai").value);
    let pRong=parseFloat(document.getElementById("rong").value);
    let pArea;
    pArea = pDai*pRong;
    alert(`Hình chữ nhật có chiều dài = ${pDai} và chiều rộng = ${pRong} thì có diện tích là ${pArea}`);

}