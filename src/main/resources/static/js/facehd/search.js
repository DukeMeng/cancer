$(document).ready(function(){
    var groupid="test1group6661";
    $("#heshen").click(function () {
        ajaxRequest("facehd/searchFaces",{"groupid":groupid,"url":"http://www.astelaya.cn/assets/imges/2-2.jpg"},function (data) {
            var persons=data.Results;
            for(var index in persons){
                var candis=persons[index].Candidates;
                for(var obj2 in candis){
                    alert("找到与id:"+candis[obj2].PersonId+"相似的人   得分"+candis[obj2].Score)
                }
            }
        });
    })
    $("#heshen2").click(function () {
        ajaxRequest("facehd/searchFaces",{"groupid":groupid,"url":"http://www.astelaya.cn/assets/imges/fnym.jpg"},function (data) {
            var persons=data.Results;
            for(var index in persons){
                var candis=persons[index].Candidates;
                for(var obj2 in candis){
                    alert("找到与id:"+candis[obj2].PersonId+"相似的人   得分"+candis[obj2].Score)
                }
            }
        });
    })
})