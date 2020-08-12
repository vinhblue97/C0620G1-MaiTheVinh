function calculateMonth() {
    let numMonth = parseInt(document.getElementById("numberMonth").value);
    switch(numMonth){
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12: document.getElementById("annouce").innerHTML=`Tháng ${numMonth} có 31 ngày`; break;
        case 4:
        case 6:
        case 9:
        case 11: document.getElementById("annouce").innerHTML=` Tháng ${numMonth} có 30 ngày`; break;
        case 2: document.getElementById("annouce").innerHTML=` Tháng ${numMonth} có 28 ngày hoặc 29 ngày`; break;
        default: document.getElementById("annouce").innerHTML=`Tháng ${numMonth} không tồn tại`;
    }
}