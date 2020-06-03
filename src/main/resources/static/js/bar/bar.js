$(function () {
    if (localStorage.getItem('type') == null){
        localStorage.setItem('type',$("#type").val());
    }
    var type = localStorage.getItem('type')
    if (type == 0) {
        $('#verify').css('display','none')
        $('#verify1').css('display','none')
        $('#verify2').css('display','none')
        $('#verify3').css('display','none')
        $('#verify4').css('display','block')
        $('#verify5').css('display','none')
    }
})