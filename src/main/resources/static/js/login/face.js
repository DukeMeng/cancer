//判断主账户用户名是否可以使用
function verify_face() {
    //获取到转化为base64的图片地址
    console.log(convertCanvasToImage(can).src);
    // alert(convertCanvasToImage(can).src)
    var data = convertCanvasToImage(can).src;
    alert(data)
    $.ajax({
        type: "POST",
        url: 'afr/getParam',
        data: "data=" + data,
        dataType: 'text',
        success: function (data) {
            alert(data);
            document.getElementById("meng-card").style.display = "none"
        }
    });
}