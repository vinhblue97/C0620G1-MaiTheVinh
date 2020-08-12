function timNghiem() {
    let pA = parseFloat(document.getElementById("a").value);
    let pB = parseFloat(document.getElementById("b").value);
    if (pA == 0) {
        if (pB == 0) {
            alert(`Phương trình ${pA}x+${pB}= 0 vô số nghiệm`);
        } else {
            alert(`Phương trình ${pA}x+${pB}= 0 vô nghiệm`);
        }

    } else {
        if (pB == 0) {
            alert(`Phương trình ${pA}x+${pB}= 0 có 1 nghiệm x = 0`);
        } else {
            alert(`Phương trình ${pA}x+${pB}= 0 có 1 nghiệm x = ${-pB / pA}`);
        }
    }
}
