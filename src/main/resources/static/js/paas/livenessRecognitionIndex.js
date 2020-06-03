$(document).ready(function () {
    ajaxFormInitial($("#subform"), function (data) {
        data = $.parseJSON(data);
        layer.alert(data.Description + "    相似度：" + data.Sim)
    })
    let video = document.getElementById('video');
    function success(stream) {
        let recorder = new window.MediaRecorder(stream);
        recorder.ondataavailable=function(e){
            let allChunks = [];
            allChunks.push(
                e.data
            );
            let fullBlob = new Blob(allChunks,{type: 'video/mp4'});
            var formData = new FormData();
            formData.append('video', fullBlob);
            formData.append('idcard', $("input[name='idcard']").val());
            formData.append('name', $("input[name='name']").val());
            var loadIndex;
            $.ajax({
                type: "POST",
                url: "paas/livenessRecognition",
                data: formData,
                processData:false,   //  告诉jquery不要处理发送的数据
                contentType:false,    // 告诉jquery不要设置content-Type请求头
                success:function(res){
                    var data = $.parseJSON(res);
                    layer.alert(data.Description);
                },
                beforeSend: function (xhr) {
                    loadIndex = layer.load(0, {
                        shade: [0.8, '#fff']
                    })
                },
                complete: function () {
                    layer.close(loadIndex);
                }
            });
        }
        $("#startBTID").click(function () {
            recorder.start();
            return false;
        })
        $("#endBTID").click(function () {
            recorder.stop();
            return false;
        })
        video.srcObject = stream;
        video.play();
    }

    function error(error) {
        console.log('访问用户媒体设备失败${error.name}, ${error.message}');
    }

    if (navigator.mediaDevices.getUserMedia || navigator.getUserMedia || navigator.webkitGetUserMedia || navigator.mozGetUserMedia) {
        //调用用户媒体设备, 访问摄像头
        getUserMedia({video: {width: 480, height: 320},audio:true}, success, error);
    } else {
        alert('不支持访问用户媒体');
    }

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