$(document).ready(function(){
    ajaxFormInitial($("#subform"),function (data) {
        data=$.parseJSON(data);
       layer.alert(data.Description+"    相似度："+data.Sim)
    })
})