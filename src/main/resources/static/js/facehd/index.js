$(document).ready(function(){
    $("#heshen").click(function () {
        ajaxRequest("facehd/detectLiveFace",{"url":"http://www.astelaya.cn/assets/imges/2-2.jpg"},function (data) {
            alert(data.Score)
        });
    })
    $("#heshen2").click(function () {
        ajaxRequest("facehd/detectLiveFace",{"url":"http://www.astelaya.cn/assets/imges/fnym.jpg"},function (data) {
            alert(data.Score)
        });
    })
})