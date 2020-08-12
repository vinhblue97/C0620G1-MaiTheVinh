// function fInput(m) {
//     let mGetInput, mresult;
//     switch (m) {
//         case "0": mGetInput = document.getElementById("zero").value;break;
//         case "1": mGetInput = document.getElementById("one").value;break;
//         case "2": mGetInput = document.getElementById("two").value;break;
//         case "3": mGetInput = document.getElementById("three").value;break;
//         case "4": mGetInput = document.getElementById("four").value;break;
//         case "5": mGetInput = document.getElementById("five").value;break;
//         case "6": mGetInput = document.getElementById("six").value;break;
//         case "7": mGetInput = document.getElementById("seven").value;break;
//         case "8": mGetInput = document.getElementById("eight").value;break;
//         case "9": mGetInput = document.getElementById("nine").value;break;
//         case "10": mGetInput = document.getElementById("add").value;break;
//         case "11": mGetInput = document.getElementById("sub").value;break;
//         case "12": mGetInput = document.getElementById("mul").value;break;
//         case "13": mGetInput = document.getElementById("div").value;break;
//         case "14": mGetInput = document.getElementById("dot").value;break;
//         case "15": mGetInput = document.getElementById("open").value;break;
//         case "16": mGetInput = document.getElementById("close").value;break;
//         case "17": document.getElementById("display").value="";
//         case "18": {mresult = eval(document.getElementById("display").value);
//                     document.getElementById("display").value="";
//                     document.getElementById("display").value = mresult; break}
//     }
//      console.log(mGetInput);
//      document.getElementById("display").value += mGetInput;
//
//
//
// }
// function fOutPut() {
//
// }
var i =1;
function fInput() {
    let indexId = event.srcElement.id;
    let mPress="";
    mPress = document.getElementById(indexId).value;
    // console.log(indexId);
    if (indexId=='acc') {
        document.getElementById("display").value += "";
    }
    else if (indexId!='equal')
    {
        if (indexId=='add' && indexId=='sub' && indexId=='mul' && indexId=='div'){
            i=1;
        }
        if (i==2){
            document.getElementById("display").value ="";
            i=1;
        }
        document.getElementById("display").value+=mPress;
    }
    else if (indexId=='equal'){
        i=2;
        document;
        document.getElementById("display").value = eval(document.getElementById("display").value);
    }
}
