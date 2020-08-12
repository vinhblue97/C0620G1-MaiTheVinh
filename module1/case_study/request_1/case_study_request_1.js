function fResult() {
    let voucher = document.getElementById("mVoucher").value;
    let mSpecieService = document.getElementsByClassName("specieService").value;
    let numDate = document.getElementById("mRentOates").value;
    let cash, speservice, numdate;
    document.write("Thông tin khách hàng:");
    document.write("<br/>");
    document.write("Họ và tên: "+ document.getElementById('mName').value);
    console.log(document.getElementById("mName").value);
    document.write("<br/>");
    document.write("CMND: "+document.getElementById("mCMNS").value);
    document.write("<br/>");
    document.write("Ngày sinh: "+document.getElementById("mDateBorn").value);
    document.write("<br/>");
    document.write("Email: "+document.getElementById("mEmail").value);
    document.write("<br/>");
    document.write("Địa chỉ: "+document.getElementById("mAddress").value);
    document.write("<br/>");
    document.write("Loại Customer: "+document.getElementById("mSpecies").value);
    document.write("<br/>");
    document.write("Số người đi cùng: "+document.getElementById("mNumDer").value);
    document.write("<br/>");
    document.write("Giảm giá: "+voucher);
    document.write("<br/>");
    document.write("Số ngày thuê: "+ numDate);
    document.write("<br/>");
    document.write("Loại dịch vụ: "+mSpecieService);
    document.write("<br/>");
    document.write("Loại phòng thuê: "+document.getElementsByClassName("specieRoom").value);
}
function fAddInformation() {
    let name = prompt("Nhập tên khách hàng");
    let cmnd = prompt("Nhập số chứng minh nhân dân");
    let dateBorn = prompt("Nhập ngày sinh");
    let email = prompt("Nhập email");
    let address = prompt("Nhập địa chỉ");
    let customerType = prompt("Nhập loại khách hàng");
    let customerAmount = prompt("Số người đi kèm");
    let voucher = prompt("Giảm giá");
    let rentDays = prompt("Số ngày thuê");
    let serviceType = prompt("Loại dịch vụ (Villa, House,Room");
    let roomType = prompt("Loại phòng thuê");
    let pay;
    if (serviceType=="Villa" || serviceType=="villa")
    {
        pay = 500*rentDays*(1-voucher/100);
    }
    if (serviceType=="House" || serviceType=="house")
    {
        pay = 300*rentDays*(1-voucher/100);
    }
    if (serviceType=="Room" || serviceType=="room")
    {
        pay = 100*rentDays*(1-voucher/100);
    }
    alert(
        "Tên khách hàng: "+ name+'\n'+
        "Chứng minh nhân dân: "+ cmnd+'\n'+
        "Ngày sinh: "+dateBorn+'\n'+
        "Email: "+email+'\n'+
        "Địa chỉ: "+address+'\n'+
        "Loại khách hàng: "+customerType+'\n'+
        "Số người đi kèm:"+customerAmount+'\n'+
        "Giảm giá: "+voucher+'\n'+
        "Số ngày thuê"+rentDays+'\n'+
        "Loại dịch vụ: "+serviceType+'\n'+
        "Loại phòng thuê: "+roomType+'\n'+
        "Tổng giá: "+~~pay+"$"
    )
}