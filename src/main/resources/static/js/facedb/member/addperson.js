$(document).ready(function () {
    let video = document.getElementById('video');
    let canvas = document.getElementById('canvas');
    let context = canvas.getContext('2d');
    let vwidth=320;
    let vheight=240;
    function success(stream) {
        //兼容webkit核心浏览器
        let CompatibleURL = window.URL || window.webkitURL;
        //将视频流设置为video元素的源
        // console.log(stream);

        //video.src = CompatibleURL.createObjectURL(stream);
        video.srcObject = stream;
        video.play();
    }

    function error(error) {
        console.log('访问用户媒体设备失败${error.name}, ${error.message}');
    }

    if (navigator.mediaDevices.getUserMedia || navigator.getUserMedia || navigator.webkitGetUserMedia || navigator.mozGetUserMedia) {
        //调用用户媒体设备, 访问摄像头
        getUserMedia({video: {width: vwidth, height: vheight}}, success, error);
    } else {
        alert('不支持访问用户媒体');
    }
    $("#capture").click(function () {
        context.drawImage(video, 0, 0, vwidth, vheight);
        var imgdata = canvas.toDataURL();
        var updata = imgdata.substring(imgdata.indexOf(",") + 1, imgdata.length - 1);
        $("input[name='Image']").val(updata);
        // $("#subBTID").click();
        return false;
    })
    ////
    $('#up').on('change',function(){
        var file = this.files[0];
        let reader = new FileReader()
        reader.readAsDataURL(file) //读取文件并将文件以URL的形式保存在resulr属性中 base64格式
        reader.onload = function(e) { // 文件读取完成时触发
            let result = e.target.result // base64格式图片地址
            var image = new Image()
            image.src = result // 设置image的地址为base64的地址
            image.onload = function(){
                var canvas = document.querySelector("#canvas");
                var context = canvas.getContext("2d");
                canvas.width = image.width; // 设置canvas的画布宽度为图片宽度
                canvas.height = image.height;
                context.drawImage(image, 0, 0, image.width, image.height) // 在canvas上绘制图片
                let dataUrl = canvas.toDataURL('image/jpeg', 0.92) // 0.92为压缩比，可根据需要设置，设置过小会影响图片质量
                                                                   // dataUrl 为压缩后的图片资源，可将其上传到服务器
                let canvasData=canvas.toDataURL();
                var updata = canvasData.substring(canvasData.indexOf(",") + 1, canvasData.length - 1);
                $("input[name='Image']").val(updata);//这里只是放一个值，没有实际用处，后台会重新出来base64根据文件流
            }
        }
    })
})

//访问用户媒体设备的兼容方法
function getUserMedia(constraints, success, error) {
    if (navigator.mediaDevices.getUserMedia) {
        //最新的标准API
        navigator.mediaDevices.getUserMedia(constraints).then(success).catch(error);
    } else if (navigator.webkitGetUserMedia) {
        //webkit核心浏览器
        navigator.webkitGetUserMedia(constraints, success, error)
    } else if (navigator.mozGetUserMedia) {
        //firfox浏览器
        navigator.mozGetUserMedia(constraints, success, error);
    } else if (navigator.getUserMedia) {
        //旧版API
        navigator.getUserMedia(constraints, success, error);
    }
}

