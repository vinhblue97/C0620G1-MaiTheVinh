function nhieu_tien() {
    let c = parseFloat(document.getElementById("amount").value);
    let mFrom=document.getElementById("mBefore").value;
    let mTo=document.getElementById("mAfter").value;
    console.log(c);
    console.log(mFrom);
    console.log(mTo);
    let i, mT;
    switch (mFrom) {
        case "vnd" :
            switch (mTo) {
                case "usd":
                    i = c/23000;
                    mT = "$";
                    break;
                case "vnd":
                    i = c;
                    mT = "VNĐ";
                    break;
            }
        case "usd":
            switch (mTo) {
                case "usd":
                    i = c;
                    mT = "$";
                    break;
                case "vnd":
                    i = c*23000;
                    mT = "VNĐ"
                    break;
            }
    }
    document.getElementById("smoney").innerText="Result: "+ i+" "+mT;
}
