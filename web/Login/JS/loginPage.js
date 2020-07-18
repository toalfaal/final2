
window.onload=function () {


    var modal3 = document.getElementsByClassName('modal3')[0];
    var modalBtn3 = document.getElementById('modal-btn3');
    // var closeBtn3 = document.getElementsByClassName('close3')[0];

    var modal4 = document.getElementsByClassName('modal4')[0];
    var modalBtn4 = document.getElementById('modal-btn4');
    // var closeBtn4 = document.getElementsByClassName('close4')[0];

    modalBtn3.onclick = function () {
        modal3.style.display = 'block';
    };
    // closeBtn3.onclick = function () {
    //     modal3.style.display = 'none';
    // };
// function outsideClick(e) {
//         if (e.target == modal3) {
//             modal3.style.display = 'none';
//          }
//      };


    modalBtn4.onclick = function () {
        modal4.style.display = 'block';
        modal3.style.display = 'none';
    };
    // closeBtn4.onclick = function () {
    //     modal4.style.display = 'none';
    // };
    window.onclick = function (e) {
        if (e.target === modal3|| e.target === modal4) {
            modal3.style.display = 'none';
            modal4.style.display = 'none';
        }

    }
}