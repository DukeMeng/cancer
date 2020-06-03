$(document).ready(function () {
    ajaxRequest("statistics/addperson_data", {}, function (data) {
        var categoryData = data.data.categoryData;
        var seriesData = data.data.seriesData;
        option = {
            title: {
                text: '人员新增',
                subtext: '',
                x: 'center'
            },
            tooltip: {
                trigger: 'axis'
            },
            xAxis: {
                type: 'category',
                data: categoryData
            },
            yAxis: {
                type: 'value'
            },
            series: [{
                data: seriesData,
                type: 'line',
                markPoint: {
                    data: [{
                        type: 'max',
                        name: '最大值'
                    },
                        {
                            type: 'min',
                            name: '最小值'
                        }
                    ]
                },
                markLine: {
                    data: [{
                        type: 'average',
                        name: '平均值',

                    }]
                }
            }]
        };
        // 基于准备好的dom，初始化echarts实例
        var myChart = echarts.init(document.getElementById('main'), 'walden');
        // 使用刚指定的配置项和数据显示图表。
        myChart.setOption(option);
    })
})