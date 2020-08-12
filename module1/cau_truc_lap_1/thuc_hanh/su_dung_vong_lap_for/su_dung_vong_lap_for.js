function theNumberFive() {
    let i;
    for (i = 0; i < 5; i++) {
        document.write("The Number is N" + " <br/>");
    }
}

function calculateSum() {
    let inputNum = parseInt(document.getElementById("inputNumber").value);
    let pSum = 0;
    for (let i = 1; i <= inputNum; i++) {
        pSum += i;
    }
    document.write("Kết quả: " + pSum);
}