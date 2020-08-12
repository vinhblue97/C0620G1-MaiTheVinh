function hahaYes() {
    alert("<3");

}
function hahaNo() {
    let endGame = document.getElementById("mNo");
    endGame.style.position='relative';
    let browserWidth =window.innerWidth;
    let browserHeight = window.innerHeight
    endGame.style.left = parseInt(Math.floor(Math.random()* (browserWidth-50))) +'px';
    endGame.style.top = parseInt(Math.floor(Math.random()* (browserHeight-50)))+ 'px';
    console.log( endGame.style.left);
    console.log( endGame.style.top);
}