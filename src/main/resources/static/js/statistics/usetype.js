$(document).ready(function () {
    ajaxRequest("statistics/usetype_data", {}, function (data) {
        var seriesData = data.data.seriesData;
        var legenddata = new Array();
        for (var i in seriesData) {
            var obj = seriesData[i];
            legenddata.push(obj.name);
        }
        option = {
            title: {
                text: '刷脸用途',
                subtext: '',
                x: 'center'
            },
            tooltip: {
                trigger: 'item',
                formatter: "{a} <br/>{b} : {c} ({d}%)"
            },
            legend: {
                type: 'scroll',
                orient: 'vertical',
                right: 10,
                top: 20,
                bottom: 20,
                data: legenddata
            },
            series: [
                {
                    name: '用途',
                    type: 'pie',
                    radius: '55%',
                    center: ['40%', '50%'],
                    data: seriesData
                }
            ]
        };
        // 基于准备好的dom，初始化echarts实例
        var myChart = echarts.init(document.getElementById('main'), 'walden');
        // 使用刚指定的配置项和数据显示图表。
        myChart.setOption(option);

    })
})