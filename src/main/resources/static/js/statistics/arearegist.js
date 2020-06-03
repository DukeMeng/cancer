$(document).ready(function () {
    var firstDisArea = '中国';
    var firstmapdata = [];

    var history = [];

    //地图容器
    var chart = echarts.init(document.getElementById('main'));

    var option = {
        backgroundColor: '#000',
        title: {
            text: '区域注册情况',
            subtext: '',
            left: 'center',
            textStyle: {
                color: '#fff',
                fontSize: 16,
                fontWeight: 'normal',
                fontFamily: "Microsoft YaHei"
            },
            subtextStyle: {
                color: '#ccc',
                fontSize: 13,
                fontWeight: 'normal',
                fontFamily: "Microsoft YaHei"
            }
        },
        tooltip: {
            trigger: 'item',
            formatter: '{b}'
        },
        toolbox: {
            show: true,
            orient: 'vertical',
            left: 'right',
            top: 'center',
            feature: {
                dataView: {show: false},
                restore: {show: false},
                saveAsImage: {show: false}
            },
            iconStyle: {
                normal: {
                    color: '#fff'
                }
            }
        },
        animationDuration: 1000,
        animationEasing: 'cubicOut',
        animationDurationUpdate: 1000
    };


    function renderMap(map, data, effectScatterData) {
        option.title.subtext = map;//小标题
        option.geo = { // 地图配置
            show: true,
            map: map,
            label: {
                normal: {
                    show: false
                },
                emphasis: {
                    show: false
                }
            },
            roam: false,
            itemStyle: {
                normal: {
                    areaColor: '#47D1FF',
                    borderColor: '#3B5077'
                },
                emphasis: {
                    areaColor: '#2B91B7'
                }
            },
            zoom: 1
        };
        option.series = [
            { // 散点配置
                name: '数量',
                type: 'effectScatter',
                coordinateSystem: 'geo',
                data: effectScatterData,
                symbolSize: function (val) {
                    return val[2];
                },
                showEffectOn: 'emphasis',
                rippleEffect: {
                    brushType: 'stroke'
                },
                hoverAnimation: true,
                label: {
                    normal: {
                        formatter: '{b}',
                        position: 'right',
                        show: false
                    },
                    emphasis: {
                        show: true
                    }
                },
                itemStyle: {
                    normal: {
                        color: '#ff8003'
                    }
                }
            },
            {
                name: map,
                type: 'map',
                mapType: map,
                roam: false,
                nameMap: {
                    'china': '中国'
                },
                label: {
                    normal: {
                        show: true,
                        textStyle: {
                            color: '#999',
                            fontSize: 13
                        }
                    },
                    emphasis: {
                        show: true,
                        textStyle: {
                            color: '#fff',
                            fontSize: 13
                        }
                    }
                },
                itemStyle: {
                    normal: {
                        areaColor: '#323c48',
                        borderColor: 'dodgerblue'
                    },
                    emphasis: {
                        areaColor: 'darkorange'
                    }
                },
                data: data
            }
        ];
        //渲染地图
        chart.setOption(option);
    }
    initChina();
    function initChina() {
        ajaxRequest("statistics/arearegist_data",{"range":"sheng"},function (serverdata) {
            console.log(serverdata.data)
            $.getJSON("js/map/china.json", function (data) {
                var sheng = [];
                var ss=[];
                for (var i = 0; i < data.features.length; i++) {
                    var diming = data.features[i].properties.name;
                    var location = data.features[i].properties.cp;
                    var id=data.features[i].id;
                    sheng.push({
                        name: diming
                    });
                    for(var x=0;x<serverdata.data.length;x++){
                        var obj=serverdata.data[x];
                        if(obj.ereaCode==id){
                            ss.push({
                                 name:diming,
                                value:location.concat(obj.personNum/100)
                            })
                        }
                    }
                }
                firstmapdata = sheng;
                //注册地图
                echarts.registerMap(firstDisArea, data);
                //绘制地图
                renderMap(firstDisArea, sheng,ss);
            })
        })
    }
    /**
     * 初始化省信息
     * @param shengName
     * @returns {boolean}
     */
    function initProvince(shengName) {
        if (shengName in provinces) {
            //如果点击的是34个省、市、自治区，绘制选中地区的二级地图
            $.getJSON('js/map/province/' + provinces[shengName] + '.json', function (data) {
                var d = [];
                for (var i = 0; i < data.features.length; i++) {
                    var diming = data.features[i].properties.name;
                    d.push({
                        name: diming
                    })
                }
                echarts.registerMap(shengName, data);
                renderMap(shengName, d);
                return true;
            });
        }
        return false;
    }

    /**
     * 初始化市地图
     */
    function initCity(shengName, shiName) {
        //如果是【直辖市/特别行政区】只有二级下钻
        if (special.indexOf(shengName) >= 0) {
            renderMap(firstDisArea, firstmapdata);
            return true;
        } else {
            //显示县级地图
            $.getJSON('js/map/city/' + cityMap[shiName] + '.json', function (data) {
                var d = [];
                for (var i = 0; i < data.features.length; i++) {
                    var diming = data.features[i].properties.name;
                    d.push({
                        name: diming
                    })
                }
                echarts.registerMap(shiName, data);
                renderMap(shiName, d);
                return true;
            });
        }
        return false;
    }


    chart.on('click', function (params) {
        var seriesName = params.seriesName;//系列名称
        var name = params.name;//数据名，类目名
        if (name in provinces) {
            initProvince(name);
        } else if (seriesName in provinces) {
            initCity(seriesName, name);
        } else {
            renderMap(firstDisArea, firstmapdata);
        }
    });


})






