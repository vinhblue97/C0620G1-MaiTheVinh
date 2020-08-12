function fCheck(index) {
    let pGood = document.getElementById("mGood");
    let pFast = document.getElementById("mFast");
    let pCheap = document.getElementById("mCheap");
    let check = pFast.checked && pCheap.checked&&pGood.checked;
    switch (index) {
        case 1:
            if (check) {
                pFast.checked = false;
                console.log("fast "+pFast.checked);
            }
            break;
        case 2:
            if (check) {
                pCheap.checked= false;
                console.log("cheap "+pCheap.checked);
            }
            break;
        case 3:
            if (check) {
                pGood.checked= false;
                console.log("good "+pGood.checked);
            }
            break;
    }

}