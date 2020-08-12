function fCalculateArea() {
    let pKe1=parseFloat(document.getElementById("ke1").value);
    let pKe2=parseFloat(document.getElementById("ke2").value);
    let pArea;
    pArea = pKe1*pKe2/2;
    alert(`Hình tam giác có chiều dài 2 cạnh kề lần lượt là ${pKe1} và  ${pKe2} thì có diện tích là ${pArea}`);

}