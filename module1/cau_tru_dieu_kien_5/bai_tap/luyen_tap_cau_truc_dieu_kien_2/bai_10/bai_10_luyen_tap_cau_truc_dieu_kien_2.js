function kiemtra() {
    let pDienDau = parseFloat(document.getElementById("dienDau").value);
    let pDienCuoi = parseFloat(document.getElementById("dienCuoi").value);
    let tongDien = pDienCuoi - pDienDau;
    let tienDien;
    if (tongDien<=50){
        tienDien = 1678*tongDien;
    }
    else if (tongDien<=100){
        tienDien = 1734*(tongDien-50)+1678*50;
    }
    else if (tongDien<=200){
        tienDien = (1678+1734)*50+2014*(tongDien-100);
    }
    else if (tongDien<=300){
        tienDien = (1678+1734)*50+2014*100+2536*(tongDien-200);
    }
    else if (tongDien<=400){
        tienDien = (1678+1734)*50+(2014+2536)*100+2834*(tongDien-300);
    }
    else {
        tienDien = (1678+1734)*50+(2014+2536+2834)*100+2927*(tongDien-400)
    }
    alert(` Tiền điện phải nộp là ${tienDien}`);
}
