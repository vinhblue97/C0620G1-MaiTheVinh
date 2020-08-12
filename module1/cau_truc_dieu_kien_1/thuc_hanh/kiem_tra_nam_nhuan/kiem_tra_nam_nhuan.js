function fCheckYear() {
    let pYear = parseInt(document.getElementById("mYear").value);
    console.log(~~(pYear/100));
    console.log(typeof (pYear));

    if (pYear > 0) {
        if (pYear % 4 == 0 && (~~(pYear/100))%4==0) {
            document.getElementById("result").innerText = "Năm " + pYear + " là năm nhuận";
        } else {
            document.getElementById("result").innerText = "Năm " + pYear + " không phải năm nhuận";
        }
    } else {
        alert("Nhập năm lại cho chuẩn dã kìa");
        document.getElementById("result").innerText = "";
    }
    // else (pYear == null){
    //     document.getElementById("result").innerText = "";
    // }
}
