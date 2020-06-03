window.onload = function () {  //定时器每秒调用一次myDate()
    address();
    setInterval(function () {
        time();

    }, 1000);
};

function time() {
    var myDate = new Date();
    //时间
    var shijian = myDate.toLocaleTimeString();
    var shijian1 = shijian.substring(0, 2);
    var shijian2 = shijian.substring(2, shijian.length);
    if (shijian1 == '下午') {
        var timelist = shijian2.split(':');
        timelist[0] = Number(timelist[0]) + 12;
        shijian2 = timelist.toString().replace(/,/g, ':')
    }
    $('#shijian').text(shijian2);
}

function address(){
    $.ajax({
        type: 'GET',
        url: 'https://www.tianqiapi.com/api/',
        data: 'version=v1&style=1001&city=',
        dataType: 'JSON',
        error: function () {
            console.log('网络错误');
        },
        success: function (res) {
            uptime = res.update_time.substring(11);
            uptime = uptime.substring(0, uptime.length - 3);
            // console.log( '【' + res.city + '】' + res.data[0].wea + ' ' + res.data[0].tem1 + '/' + res.data[0].tem2 + ',' + uptime + '更新~' );
            console.log(res.city)
            console.log(res.data[0].wea)
            console.log(res.data[0].wea_img)
            console.log(res.data[0].tem)
            console.log(res.data[0].tem1)
            console.log(res.data[0].tem2)
            console.log(res.data[0].hours[0].tem+'温度')
            console.log(res)
            $('#didian').text(res.city);
            $('#tianqi').text(res.data[0].wea);
            $('#wendu').text(res.data[0].tem);

            var myDate = new Date();
            //年月日
            var riqi = myDate.toLocaleDateString();
            riqi = riqi.replace('/', '年');
            riqi = riqi.replace('/', '月');
            riqi = riqi + '日';
            console.log(riqi)
            $('#riqi').text(riqi);
            //时间
            var shijian = myDate.toLocaleTimeString();
            var shijian1 = shijian.substring(0, 2);
            var shijian2 = shijian.substring(2, shijian.length);
            if (shijian1 == '下午') {
                var timelist = shijian2.split(':');
                timelist[0] = Number(timelist[0]) + 12;
                shijian2 = timelist.toString().replace(/,/g, ':')
            }
            $('#shijian').text(shijian2);
            //星期
            var xingqi = myDate.getDay();
            var weekday = ["星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"];
            // console.log(xingqi)
            $("#xingqi").text(weekday[xingqi])

        }
    })
}