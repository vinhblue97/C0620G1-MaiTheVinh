function kiemtra() {
    let pA = parseFloat(document.getElementById("canhA").value);
    let pB = parseFloat(document.getElementById("canhB").value);
    let pC = parseFloat(document.getElementById("canhC").value);
    if (pA > 0 && pB > 0 && pC > 0) {
        if (pA + pB > pC && pB + pC > pA && pA + pC > pB) {
            alert(`Hình có các cạnh a = ${pA}, b = ${pB}, c = ${pC} là một tam giác `);
        } else {
            alert(`Hình có các cạnh a = ${pA}, b = ${pB}, c = ${pC} không phải là một tam giác `);
        }
    } else lert(`Hình có các cạnh a = ${pA}, b = ${pB}, c = ${pC} không phải là một tam giác `);

}
