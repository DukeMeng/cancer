$(document).ready(function(){
    ajaxFormInitial($("#subForm"),function (data) {
        console.log(data)
    })
    $("#getMsgID").click(function () {
        var phone=$("input[name='phone']").val();
        ajaxRequest("app/getMsgForAddPerson",{'phone':phone},function (data) {
            console.log(data)
        })
        return false;
    })
})