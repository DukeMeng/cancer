// var token = $("meta[name='_csrf']").attr("content");
// var header = $("meta[name='_csrf_header']").attr("content");
// $(document).ajaxSend(function(e, xhr, options) {
//     xhr.setRequestHeader(header, token);
// });
var loadIndex;
var openLayerWindowID;
$(document).on('pjax:beforeSend', function () {
    NProgress.start();
})
$(document).on('pjax:send', function () {
    NProgress.set(0.3);
    loadIndex = layer.load(0, {
        shade: [0.8, '#fff']
    });
})
$(document).on('pjax:complete', function (xhr, textStatus) {
    NProgress.set(0.6);
    layer.close(loadIndex);
})
$(document).on('pjax:end', function () {
    NProgress.done();
})
$(document).on('pjax:error', function (xhr, textStatus, errorThrown) {
    NProgress.done();
    if (textStatus.status == 404) {
        layer.alert("无此页面！");
    } else if (textStatus.status == 0) {
        layer.alert("服务器已关闭！");
    } else {
        layer.alert("服务器错误！ 错误码：" + textStatus.status);
    }
})
//post方式这里不生效
$(document).on('pjax:timeout', function (event) {
    // Prevent default timeout redirection behavior
    NProgress.done();
    layer.alert("请求超时！");
    event.preventDefault();
})

/////////////////////////////////////////////////////
function pajaxRequest(url, continerID, pushstate, pushdata) {
    var push = true;
    if (!pushstate) {
        push = pushstate;
    }
    var data = {};
    if (pushdata) {
        data = pushdata;
    }
    //post不用设置超时时间
    $.pjax({url: url, container: continerID, type: "post", push: push, data: data, async: true})
}

////////
function ajaxRequest(url, requestData, handlerFunction, datatype, nozhezhao) {
    var dataType = "json";
    if (datatype) {
        dataType = datatype;
    }
    $.ajax({
        url: url,
        data: requestData,
        type: "post",
        async: true,
        dataType: dataType,
        success: handlerFunction,
        beforeSend: function (xhr) {
            if (!nozhezhao) {
                loadIndex = layer.load(0, {
                    shade: [0.8, '#fff']
                });
            }
        },
        complete: function () {
            if (!nozhezhao) {
                layer.close(loadIndex);
            }
        },
        error: function (xhr, textStatus, errorThrown) {
            if ("timeout" == textStatus) {
                layer.alert("请求超时错误！");
            } else if ("notmodified" == textStatus) {
                layer.alert("未定义错误！");
            } else if ("parsererror" == textStatus) {
                layer.alert("解析错误！");
            } else if ("error" == textStatus) {
                layer.alert("服务器错误！");
            } else {
                layer.alert("不知道什么错反正出错了");
            }
        }
    })
}

//////
function initPajaxRequestForClick(continerID) {
    var $click = $("[pajax-data]");
    $click.click(function () {
        var href = $(this).attr("href");
        var del = $(this).attr("del");
        if (href) {
            if (del) {
                layer.confirm('请谨慎操作！', {icon: 3, title: '删除条目'}, function (index) {
                    //do something
                    pajaxRequest(href, continerID);
                    layer.close(index);
                });
            } else {
                pajaxRequest(href, continerID);
            }
        } else {
            layer.alert("缺少请求地址！");
        }
    });
}

////
function initPajaxFormRequestForClick(continerID) {
    var $form = $("[pajax-form]");
    //$.pjax.submit(event, '#pjax-container')
    $form.submit(function (event) {
        var action = $(this).attr("action");
        if (action) {
            $.pjax.submit(event, continerID)
        } else {
            layer.alert("表单没有提交路径！");
        }
        return false;
    })
}

///////////
function ajaxFormInitial($form, successFun, beforeFun) {
    $form.on('submit', function (e) {
        e.preventDefault(); // prevent native submit
        if (beforeFun) {
            beforeFun();
        }
        $(this).ajaxSubmit({
            // headers: {"X-PJAX": true},
            beforeSubmit: function () {
                loadIndex = layer.load(0, {
                    shade: [0.8, '#fff']
                });
            },
            success: function (data, status) {
                layer.close(loadIndex);
                layer.close(openLayerWindowID);
                successFun(data, status);
            },
            error: function () {
                layer.close(loadIndex);
                layer.alert("请求出错！")
            }
        })
        return false;
    });
}

function loadScript(url, callback) {

    var script = document.createElement("script");

    script.type = "text/javascript";

    if (typeof (callback) != "undefined") {

        if (script.readyState) {

            script.onreadystatechange = function () {

                if (script.readyState == "loaded" || script.readyState == "complete") {

                    script.onreadystatechange = null;

                    callback();

                }

            };

        } else {

            script.onload = function () {

                callback();

            };

        }

    }
    ;

    script.src = url;

    document.body.appendChild(script);

}

//统一社会信用代码
function CheckSocialCreditCode(Code) {
    var patrn = /^[0-9A-Z]+$/;
    //18位校验及大写校验
    if ((Code.length != 18) || (patrn.test(Code) == false)) {
        return false;
    } else {
        var Ancode;//统一社会信用代码的每一个值
        var Ancodevalue;//统一社会信用代码每一个值的权重
        var total = 0;
        var weightedfactors = [1, 3, 9, 27, 19, 26, 16, 17, 20, 29, 25, 13, 8, 24, 10, 30, 28];//加权因子
        var str = '0123456789ABCDEFGHJKLMNPQRTUWXY';
        //不用I、O、S、V、Z
        for (var i = 0; i < Code.length - 1; i++) {
            Ancode = Code.substring(i, i + 1);
            Ancodevalue = str.indexOf(Ancode);
            total = total + Ancodevalue * weightedfactors[i];
            //权重与加权因子相乘之和
        }
        var logiccheckcode = 31 - total % 31;

        if (logiccheckcode == 31) {
            logiccheckcode = 0;
        }
        var Str = "0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F,G,H,J,K,L,M,N,P,Q,R,T,U,W,X,Y";
        var Array_Str = Str.split(',');
        logiccheckcode = Array_Str[logiccheckcode];

        var checkcode = Code.substring(17, 18);
        if (logiccheckcode != checkcode) {
            return false;
        }
        return true;
    }
}

//身份证验证
// 正则表达式：
var idcardReg = /^[1-9]\d{7}((0\d)|(1[0-2]))(([0|1|2]\d)|3[0-1])\d{3}$|^[1-9]\d{5}[1-9]\d{3}((0\d)|(1[0-2]))(([0|1|2]\d)|3[0-1])\d{3}([0-9]|X)$/;

function CheckIDCardCode(Code) {
    return idcardReg.test(Code);
}

//手机号验证
var myreg = /^[1][3,4,5,7,8][0-9]{9}$/;

function isPoneAvailable(str) {
    if (!myreg.test(str)) {
        return false;
    } else {
        return true;
    }
}

var guhuaReg = /^(0[0-9]{2,3}\-)([2-9][0-9]{6,7})+(\-[0-9]{1,4})?$/;

//固话验证
function isguhuaAvailable(str) {
    if (!guhuaReg.test(str)) {
        return false;
    } else {
        return true;
    }
}

//密码验证
var passZZ = /^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{8,16}$/;

function passwordCheck(str) {
    if (!passZZ.test(str)) {
        return false;
    } else {
        return true;
    }
}

$("#historybackID").click(function () {
    history.back(-1);
    return false;
});

function amplificationImg(url) {
    $("#displayImg").attr("src", url);
    var height = $("#displayImg").height();//拿的图片原来宽高，建议自定义宽高
    var width = $("#displayImg").width();
    var clientWidth = document.body.clientWidth;
    var clientHeight = document.body.clientHeight;
    if (height > clientHeight) {
        height = clientHeight;
    }
    if (width > clientWidth) {
        height = clientWidth;
    }
    layer.open({
        type: 1,
        title: false,
        closeBtn: 0,
        shadeClose: true,
        area: [width + 'px', height + 'px'], //宽高
        content: "<img src=" + url + " />"
    });
}

function framopen(title, width, height, url) {
    layer.open({
        type: 2,
        title: title,
        shadeClose: true,
        shade: 0.8,
        area: [width, height],
        content: url //iframe的url
    });
}

