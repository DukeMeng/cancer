//判断主账户用户名是否可以使用
function verify_majname() {
    var userName = document.getElementById("account").value;
    if (userName == null || userName == "") {
        alert("用户名不能为空！");
    } else if (userName.length > 15 || userName.length < 5) {
        alert("用户名长度为5--15位,请重新输入！")
    } else {
        $.ajax({
            type: "POST",
            url: 'major/verify_name',
            data: "userName=" + userName,
            dataType: 'text',
            success: function (data) {
                if (data == "true") {
                    alert("该用户可以使用！");
                } else {
                    alert("该用户已存在！");
                    document.getElementById("account").value = "";
                }
            }
        });
    }
}

//判断子账户用户名是否可以使用
function verify_minname() {
    var userName = document.getElementById("account").value;
    if (userName == null || userName == "") {
        alert("用户名不能为空！");
    } else if (userName.length > 15 || userName.length < 5) {
        alert("用户名长度为5--15位,请重新输入！")
    } else {
        $.ajax({
            type: "POST",
            url: 'minor/verify_name',
            data: "userName=" + userName,
            dataType: 'text',
            success: function (data) {
                if (data == "true") {
                    alert("该用户可以使用！");
                } else {
                    alert("该用户已存在！");
                    document.getElementById("account").value = "";
                }
            }
        });
    }
}

//判断医院是否存在
function verify_hospital() {
    var designation = document.getElementById("designation").value;
    var succ = document.getElementById("succ").value;
    if (designation == null || designation == "") {
        alert("医院名称不能为空！");
    } else if (succ == null || succ == "") {
        alert("社会统一信用代码不能为空！");
    } else {
        $.ajax({
            type: "POST",
            url: 'major/verify_hospital',
            data: "designation=" + designation + "&succ=" + succ,
            dataType: 'text',
            success: function (data) {
                if (data == "true") {
                    alert("该医院可以使用！");
                } else {
                    alert("该医院名称或社会统一信用代码已存在，请重新输入！");
                    document.getElementById("designation").value = "";
                    document.getElementById("succ").value = "";
                }
            }
        });
    }

}

