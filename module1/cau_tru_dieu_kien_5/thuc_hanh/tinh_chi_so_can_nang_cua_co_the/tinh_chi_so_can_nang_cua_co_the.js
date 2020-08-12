function a() {
    let mWeight=parseFloat(document.getElementById("yourWeight").value);
    let mHeight=parseFloat(document.getElementById("yourHeight").value);
    let bmi = mWeight/mHeight;
    if (bmi<18.5) {
        document.getElementById("annouce").innerHTML="Underweight";
    }
    else if (bmi<25.0){
        document.getElementById("annouce").innerHTML="Normal";
    }
    else if (bmi<30.0){
        document.getElementById("annouce").innerHTML="Overweight";
    }
    else {
        document.getElementById("annouce").innerHTML="Obese";
    }
}