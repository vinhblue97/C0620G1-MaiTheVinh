function displayNumber() {
    let mAmount = document.getElementById("numAmount").value;
    let i = 1, j = 1, a = 2;
    let z;
    while (i <= mAmount) {
        let kiemTra = 0;
        j += 1;
        for (z = 1; z <= j; z++) {
            if (j % z == 0) {
                kiemTra += 1;
            }
        }
        if (kiemTra == 2) {
            document.write(`${j} `);
            i++;
        }
    }
}