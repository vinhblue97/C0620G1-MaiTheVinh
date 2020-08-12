var imObj=0;
function init(){
    imObj = document.getElementById("yellowBall");
    imObj.style.position='relative';
    imObj.style.left='0px';
}

function moveRight() {
    imObj.style.left=parseInt(imObj.style.left) +10 +'px';
}
window.load=init();

function reset() {
    document.getElementById("yellowBall").style.position='0px';
}