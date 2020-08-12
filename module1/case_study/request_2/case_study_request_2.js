function fAddInformation() {
    let name
    do {
        name = prompt("Nhập tên khách hàng");
    } while (name == "");
    let cmnd
    do {
        cmnd = prompt("Nhập số chứng minh nhân dân");
    } while (cmnd == "");
    let dateBorn
    do {
        dateBorn = prompt("Nhập ngày sinh");
    } while (dateBorn == "");
    let email
    do {
        email = prompt("Nhập email");
    } while (email == "");
    let address
    do {
        address = prompt("Nhập địa chỉ");
    } while (address == "")
    let customerType;
    let a, b, c;
    do {
        a = prompt("Nhập loại khách hàng\n" +
            "1.Diamond\n " +
            "2.Platinum\n " +
            "3.Gold\n " +
            "4.Silver\n" +
            "5.Member");
        switch (a) {
            case "1":
                customerType = "Diamond";
                break;
            case "2":
                customerType = "Platium";
                break;
            case "3":
                customerType = "Gold";
                break;
            case "4":
                customerType = "Silver";
                break;
            case "5":
                customerType = "Member";
                break;
            default: {
                a = '0';
                alert("FAILED");
                break;
            }
        }
    } while (parseInt(a) < 1 || parseInt(a) > 5 || a.length > 1);
    let customerAmount
    do {
        customerAmount = prompt("Số người đi kèm");
    } while (customerAmount == "");
    let voucher
    do {
        voucher = prompt("Giảm giá (0% - 100%");
    } while (voucher < 0 || voucher > 100 || voucher == "");
    let rentDays
    do {
        rentDays = prompt("Số ngày thuê");
    } while (rentDays == "");
    let serviceType;
    do {
        a = prompt("Loại dịch vụ: \n" +
            "1.Villa\n" +
            "2.House\n" +
            "3. Room");
        switch (a) {
            case "1":
                serviceType = "Villa";
                break;
            case "2":
                serviceType = "House";
                break;
            case "3":
                serviceType = "Room";
                break;
            default: {
                a = '0';
                alert("FAILED");
                break;
            }
        }
    } while (parseInt(a) < 1 || parseInt(a) > 3)
    let roomType;
    do {
        a = prompt("Loại phòng thuê:\n" +
            "1.VIP\n" +
            "2.Business\n" +
            "3.Normal");
        switch (a) {
            case "1":
                roomType = "VIP";
                break;
            case "2":
                roomType = "Business";
                break;
            case "3":
                roomType = "Normal";
                break;
            default:
                a = '0';
                alert("FAILED");
                break;
        }
    } while (parseInt(a) < 1 || parseInt(a) > 3);
    let pay;
    if (serviceType == "Villa") {
        pay = 500 * rentDays * (1 - voucher / 100);
    }
    if (serviceType == "House") {
        pay = 300 * rentDays * (1 - voucher / 100);
    }
    if (serviceType == "Room") {
        pay = 100 * rentDays * (1 - voucher / 100);
    }
    switch (address) {
        case "Đà Nẵng":
            pay -= 20;
            break;
        case "Huế":
            pay -= 10;
            break;
        case "Quảng Nam":
            pay -= 5;
            break;
    }
    if (rentDays >= 2 && rentDays <= 4) {
        pay -= 10;
    } else if (rentDays >= 5 && rentDays <= 7) {
        pay -= 20;
    } else if (rentDays > 7) {
        pay -= 30;
    }
    switch (customerType) {
        case "Diamond":
            pay -= 15;
            break;
        case "Platium":
            pay -= 10;
            break;
        case "Gold":
            pay -= 5;
            break;
        case "Silver":
            pay -= 2;
            break;
    }
    let currentYear = new Date().getFullYear();
    let birthDay = new Date(dateBorn).getFullYear();
    let ageCustomer = currentYear - birthDay;
    if (ageCustomer >= 20 && ageCustomer <= 30) {
        pay -= 2;
    } else if (ageCustomer > 30) {
        pay -= 1;
    }
    console.log(currentYear);
    do {
        c = prompt("Option:\n" +
            "1.Hiển thị thông tin\n" +
            "2.Chỉnh sửa thông tin\n" +
            "3.Hiển thị giá tiền\n" +
            "4. Thoát");
        switch (c) {
            case "1":
                alert(
                    "Tên khách hàng: " + name + '\n' +
                    "Chứng minh nhân dân: " + cmnd + '\n' +
                    "Ngày sinh: " + dateBorn + '\n' +
                    "Email: " + email + '\n' +
                    "Địa chỉ: " + address + '\n' +
                    "Loại khách hàng: " + customerType + '\n' +
                    "Số người đi kèm:" + customerAmount + '\n' +
                    "Giảm giá: " + voucher + '\n' +
                    "Số ngày thuê: " + rentDays + '\n' +
                    "Loại dịch vụ: " + serviceType + '\n' +
                    "Loại phòng thuê: " + roomType);
                c = 0;
                ;
                break;
            case "2":
                do {
                    b = prompt("Chỉnh sửa thông tin nào?\n" +
                        "1.Họ và tên\n" +
                        "2.Số CMND\n" +
                        "3.Ngày sinh\n" +
                        "4.Email\n" +
                        "5.Địa chỉ\n" +
                        "6.Loại khách hàng\n" +
                        "7.Mã giảm giá\n" +
                        "8.Số người đi kèm\n" +
                        "9.Số ngày thuê\n" +
                        "10.Loại dịch vụ\n" +
                        "11.Loại phòng thuê\n" +
                        "12.Không chỉnh sửa gì thêm")
                    switch (b) {
                        case "1":
                            name = prompt("Chỉnh sửa lại tên:");
                            c = 0;
                            console.log(c);
                            break;
                        case "2":
                            cmnd = prompt("Chỉnh sửa cmnd");
                            c = 0;
                            break;
                        case "3":
                            dateBorn = prompt("Chỉnh sửa ngày sinh");
                            c = 0;
                            break;
                        case "4":
                            email = prompt("Chỉnh sửa email");
                            c = 0;
                            break;
                        case "5":
                            address = prompt("Chỉnh sửa địa chỉ");
                            c = 0;
                            break;
                        case "6":
                            do {
                                a = prompt("Nhập loại khách hàng\n" +
                                    "1.Diamond\n " +
                                    "2.Platinum\n " +
                                    "3.Gold\n " +
                                    "4.Silver\n" +
                                    "5.Member");
                                switch (a) {
                                    case "1":
                                        customerType = "Diamond";
                                        break;
                                    case "2":
                                        customerType = "Platium";
                                        break;
                                    case "3":
                                        customerType = "Gold";
                                        break;
                                    case "4":
                                        customerType = "Silver";
                                        break;
                                    case "5":
                                        customerType = "Member";
                                        break;
                                    default: {
                                        a = '0';
                                        alert("FAILED");
                                    }
                                }
                            } while (parseInt(a) < 1 || parseInt(a) > 5)
                        case "7":
                            do {
                                voucher = prompt("Chỉnh sửa mã giảm giá");
                            } while (vouncher < 0 || voucher > 100);
                            c = 0;
                            break;
                        case "8":
                            customerAmount = prompt("Chỉnh sửa số người đi kèm");
                            c = 0;
                            break;
                        case "9":
                            rentDays = prompt("Chỉnh sửa số ngày thuê");
                            c = 0;
                            break;
                        case "10":
                            do {
                                a = prompt("Loại dịch vụ: \n" +
                                    "1.Villa\n" +
                                    "2.House\n" +
                                    "3. Room");
                                switch (a) {
                                    case "1":
                                        serviceType = "Villa";
                                        break;
                                    case "2":
                                        serviceType = "House";
                                        break;
                                    case "3":
                                        serviceType = "Room";
                                        break;
                                    default: {
                                        a = '0';
                                        alert("FAILED");
                                    }
                                }
                            } while (parseInt(a) < 1 || parseInt(a) > 3);
                            c = 0;
                            break;
                        case "11":
                            do {
                                a = prompt("Loại phòng thuê:\n" +
                                    "1.VIP\n" +
                                    "2.Business\n" +
                                    "3.Normal");
                                switch (a) {
                                    case "1":
                                        roomType = "VIP";
                                        break;
                                    case "2":
                                        roomType = "Business";
                                        break;
                                    case "3":
                                        roomType = "Normal";
                                        break;
                                    default:
                                        a = '0';
                                        alert("FAILED");
                                }

                            } while (parseInt(a) < 1 || parseInt(a) > 3);
                            c = 0;
                            break;
                        case "12":
                            console.log(c);
                            c = 0;
                            break;
                        default:
                            b = 0;
                    }
                } while (b < 1 || b > 12);
                break;
            case "3":
                if (serviceType == "Villa") {
                    pay = 500 * rentDays * (1 - voucher / 100);
                }
                if (serviceType == "House") {
                    pay = 300 * rentDays * (1 - voucher / 100);
                }
                if (serviceType == "Room") {
                    pay = 100 * rentDays * (1 - voucher / 100);
                }
                switch (address) {
                    case "Đà Nẵng":
                        pay -= 20;
                        break;
                    case "Huế":
                        pay -= 10;
                        break;
                    case "Quảng Nam":
                        pay -= 5;
                        break;
                }
                if (rentDays >= 2 && rentDays <= 4) {
                    pay -= 10;
                } else if (rentDays >= 5 && rentDays <= 7) {
                    pay -= 20;
                } else if (rentDays > 7) {
                    pay -= 30;
                }
                switch (customerType) {
                    case "Diamond":
                        pay -= 15;
                        break;
                    case "Platium":
                        pay -= 10;
                        break;
                    case "Gold":
                        pay -= 5;
                        break;
                    case "Silver":
                        pay -= 2;
                        break;
                }
                let currentYear = new Date().getFullYear();
                let birthDay = new Date(dateBorn).getFullYear();
                let ageCustomer = currentYear - birthDay;
                if (ageCustomer >= 20 && ageCustomer <= 30 && address=="Đà Nẵng") {
                    pay -= 2;
                }
                if (ageCustomer > 30 && address=="Đà Nẵng" ) {
                    pay -= 1;
                }
                alert("Tổng giá tiền:  " + ~~pay + "$");
                c = 0;
                break;
            case "4":
                break;
            default:
                c = 0;
        }
    } while (parseInt(c) < 1 || parseInt(c) > 4);
}


