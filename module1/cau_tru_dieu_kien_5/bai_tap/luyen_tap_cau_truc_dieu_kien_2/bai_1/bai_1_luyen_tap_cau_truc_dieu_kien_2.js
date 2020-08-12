function fConvert() {
    let pC=parseFloat(document.getElementById("temp").value);
    let pF;
    pF = pC*9/5+32;
    alert(`${pC} độ C = ${pF} độ F`);

}