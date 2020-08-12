function kiemtra() {
    let pLuong = parseFloat(document.getElementById("mLuong").value);
    let pVat;
    if (pLuong>=5){
        pVat=pLuong*5/100;
    }
    else if (pLuong<=10){
        pVat=pLuong*10/100;
    }
    else if (pLuong<=18){
        pVat=pLuong*15/100;
    }
    else if (pLuong<=32){
        pVat=pLuong*20/100;
    }
    else if (pLuong<=52){
        pVat=pLuong*25/100;
    }
    else if (pLuong<=80){
        pVat=pLuong*30/100;
    }
    else {
        pVat=pLuong*35/100;
    }

    alert(` Tiền thuế phải nộp là ${pVat*1000000} VND`);
}
