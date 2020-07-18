// Get DOM Elements
window.onload = function () {
    var modal1 = document.getElementsByClassName('modal1')[0];
    var modal2 = document.getElementsByClassName('modal2')[0];

    var modalBtn1 = document.getElementById('modal-btn1');
    var modalBtn2 = document.getElementById('modal-btn2');

    // var closeBtn1 = document.getElementsByClassName('close1')[0];
    // var closeBtn2 = document.getElementsByClassName('close2')[0];


// Events
    modalBtn1.onclick = function () {
        modal1.style.display = 'block';
    };
    // closeBtn1.onclick = function () {
    //     modal1.style.display = 'none';
    // };
    window.onclick = function (e) {
        if (e.target === modal1||e.target === modal2|| e.target === modal3) {
            modal1.style.display = 'none';
            modal2.style.display = 'none';
            modal3.style.display = 'none';
        }

    };
     modalBtn2.onclick = function () {
        modal2.style.display = 'block';
    };
    // closeBtn2.onclick = function () {
    //     modal2.style.display = 'none';
    // };

    // window.onclick = function (e) {
    //     if (e.target === modal2) {
    //         modal2.style.display = 'none';
    //     }
    //
    // };

// Open
//     function openModal() {
//
//     }

// Close
//     function closeModal() {
//         modal.style.display = 'none';
//     }

// Close If Outside Click
//     function outsideClick(e) {
//         if (e.target == modal) {
//             modal.style.display = 'none';
//         }
//     }
}