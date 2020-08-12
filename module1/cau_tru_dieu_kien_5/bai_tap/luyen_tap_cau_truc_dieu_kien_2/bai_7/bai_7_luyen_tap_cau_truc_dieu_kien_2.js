function timNghiem() {
    let pA = parseFloat(document.getElementById("a").value);
    let pB = parseFloat(document.getElementById("b").value);
    let pC = parseFloat(document.getElementById("c").value);
    let delta;
    delta = Math.pow(pB,2)-4*pA*pC;
    if (delta > 0){
        alert(` Phương trình ${pA}x^2 + ${pB}x + ${pC} = 0 có 2 nghiệm phân biệt: x1 = ${(-pB+Math.sqrt(delta))/2/pA} và x2 =${(-pB-Math.sqrt(delta))/2/pA}`);
    }
    else if (delta == 0) {
        alert(` Phương trình ${pA}x^2 + ${pB}x + ${pC} = 0 có nghiệm kép x1 = x2 = ${-pB/2/pA}`);
    }
    else {
        alert(` Phương trình ${pA}x^2 + ${pB}x + ${pC} = 0 vô nghiệm`);
    }
}
