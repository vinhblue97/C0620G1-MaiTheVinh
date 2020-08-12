var imageIndex, mCheck;
function setGame() {
    let images1 = ["11.png", "21.png", "31.png"];
    let images2 = ["12.png", "22.png", "32.png"];
    let images3 = ["13.png", "23.png", "33.png"];
    let imageIndex1;
    let imageIndex2;
    let imageIndex3;
    do {
        imageIndex1 = Math.floor(Math.random() * 10 - 7);
    } while (imageIndex1 < 0);
    do {
        imageIndex2 = Math.floor(Math.random() * 10 - 7);
        ;
    } while (imageIndex2 < 0);
    do {
        imageIndex3 = Math.floor(Math.random() * 10 - 7);
        ;
    } while (imageIndex3 < 0);
    document.getElementById("image1").src = images1[imageIndex1];
    document.getElementById("image2").src = images2[imageIndex2];
    document.getElementById("image3").src = images3[imageIndex3];
}

function chuyenHinh(index) {
    let images1 = ["11.png", "21.png", "31.png"];
    let images2 = ["12.png", "22.png", "32.png"];
    let images3 = ["13.png", "23.png", "33.png"];
    let i = 1;
    switch (index) {
        case 1:
            images1 = ["11.png", "21.png", "31.png"];
            do {
                imageIndex = Math.floor(Math.random() * 3);
                if (mCheck!=imageIndex){
                    i = 1;
                }
                if (mCheck == imageIndex) {
                    i = 2;
                }
                if (i == 1) {
                    mCheck = imageIndex;
                }
            }
            while (imageIndex == mCheck && i == 2) ;
            console.log("mCheck=" + mCheck)
            console.log("imageIndex: " + imageIndex);
            document.getElementById("image1").src = images1[imageIndex];
            break;
        case 2:
            images2 = ["12.png", "22.png", "32.png"];
            do {
                imageIndex = Math.floor(Math.random() * 3);
                if (mCheck!=imageIndex){
                    i = 1;
                }
                if (mCheck == imageIndex) {
                    i = 2;
                }
                if (i == 1) {
                    mCheck = imageIndex;
                }
            }
            while (imageIndex == mCheck && i == 2) ;
            document.getElementById("image2").src = images2[imageIndex];
            break;
        case 3:
            images3 = ["13.png", "23.png", "33.png"];
            do {
                imageIndex = Math.floor(Math.random() * 3);
                if (mCheck!=imageIndex){
                    i = 1;
                }
                if (mCheck == imageIndex) {
                    i = 2;
                }
                if (i == 1) {
                    mCheck = imageIndex;
                }
            }
            while (imageIndex == mCheck && i == 2) ;
            document.getElementById("image3").src = images3[imageIndex];
            break;
    }
}

window.load = setGame();