function fConvert() {
    let pMet=parseFloat(document.getElementById("mMet").value);
    let ft;
    ft = pMet*3.2808;
    alert(`${pMet} m = ${ft} feet`);

}