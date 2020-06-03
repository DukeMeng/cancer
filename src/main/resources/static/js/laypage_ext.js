jQuery(document).ready(function () {
    var laypage = layui.laypage;
    var $pageNum = $("#page_pageNumID");
    var $pageSize = $("#page_pageSizeID");
    var pageNum = $pageNum.val();
    var pageSize = $pageSize.val();
//执行一个laypage实例
    laypage.render({
        elem: 'pageDIV' //注意，这里的 test1 是 ID，不用加 # 号
        , count: $("#page_totalID").val(), //数据总数，从服务端得到
        curr: pageNum,
        limit: pageSize,
        jump: function (obj, first) {
            //obj包含了当前分页的所有参数，比如：
            //console.log(obj.curr); //得到当前页，以便向服务端请求对应页的数据。
            // console.log(obj.limit); //得到每页显示的条数
            //首次不执行
            if (!first) {
                //do something
                $pageNum.val(obj.curr);//修改要跳转的页码
                $pageSize.val(obj.limit);
                $("#subForm").submit();
            }
        }
    });
});