jQuery(document).ready(function () {
    //ajax提交
    $("button[ajaxaction]").click(function () {
        var action = $(this).attr("ajaxaction");
        var attrs = fun_attrs($(this).get(0).attributes);
        var parm=new Object();
        for (var index in attrs) {
            var obj = attrs[index];
            var name = obj.name;
            var value = obj.value;
            if (name != 'ajaxaction'&&name != 'class') {
                parm[name]=value;
            }
        }
        var jsonData=JSON.parse(JSON.stringify(parm));
        ajaxRequest(action,jsonData,function (data) {

        });
    })


    //返回按钮设置
    $("button[id='backBT_ID']").click(function () {
        var action = $(this).attr("action");
        if(action){
            var $subform = $("#subFormID");
            if (!$subform.get(0)) {
                layer.alert("需要一个id为subFormID的表单！")
                return false;
            }
            var attrs = fun_attrs($(this).get(0).attributes);
            $subform.empty();
            for (var index in attrs) {
                var obj = attrs[index];
                var name = obj.name;
                var value = obj.value;
                if (name != 'action'&&name != 'class') {
                    $subform.append($("<input type='hidden'>").attr({'name': name, 'value': value}));
                }
            }
            $subform.submit();
        }else{
            //self.location=document.referrer //返回上一页并刷新
            window.history.back();
        }
        return false;
    })

    ///////1.按钮点击初始化
    $("button[action]").click(function () {
        var delstate = $(this).attr("delstate");
        var action = $(this).attr("action");
        var $subform = $("#subFormID");
        if (!$subform.get(0)) {
            layer.alert("需要一个id为subFormID的表单！")
            return false;
        }
        var attrs = fun_attrs($(this).get(0).attributes);
        $subform.empty();
        for (var index in attrs) {
            var obj = attrs[index];
            var name = obj.name;
            var value = obj.value;
            if (name != 'action' && name != 'delstate'&&name != 'class') {
                $subform.append($("<input type='hidden'>").attr({'name': name, 'value': value}));
            }
        }
        if (delstate) {
            layer.confirm('确定要删除吗?', {icon: 3, title: '提示'}, function (index) {
                $subform.attr("action", action);
                $subform.submit();
                layer.close(index);
            });
        } else {
            $subform.attr("action", action);
            $subform.submit();
        }
        return false;
    })
})

function fun_attrs(element) {
    var myArray = new Array()
    for (var index in element) {
        if (!isNaN(index)) {
            var name = element[index].nodeName;
            var value = element[index].value;
            var obj = new Object();
            obj.name = name;
            obj.value = value;
            myArray.push(obj);
        }
    }
    return myArray;
}