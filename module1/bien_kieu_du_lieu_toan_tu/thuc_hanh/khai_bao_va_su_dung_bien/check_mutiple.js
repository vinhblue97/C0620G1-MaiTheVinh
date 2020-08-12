let a = prompt("Nhập số a");
let b = prompt("Nhập số b");
let m=a%b
if (m!=0) {
    document.write(a+"không phải là bội số của"+b)
}
else {
    document.write(a+ "là bội số của" +b)
}