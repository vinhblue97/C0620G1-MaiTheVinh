function fCalculateArea() {
    let pEdge=parseFloat(document.getElementById("mEdge").value);
    let pArea;
    pArea = Math.pow(pEdge,2);
    alert(`Hình vuông có cạnh ${pEdge} thì có diện tích là ${pArea}`);

}