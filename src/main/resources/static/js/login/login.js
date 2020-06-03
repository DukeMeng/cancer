//判断账户名是否可以使用
function verify_account() {
    var userName = document.getElementById("username").value;
    if(userName == null || userName == ""){
        alert("用户名不能为空！");
    } else {
        $.ajax({
            type: "POST",
            url: 'management/verify_account',
            data: "userName=" + userName,
            dataType: 'text',
            success: function (data) {
                if (data == "false"){
                    alert("该用户不存在！");
                    document.getElementById("username").value = "";
                }
            }
        });
    }
}
//判断密码是否是账户的登陆密码
function verify_pwd() {
    var userName = document.getElementById("username").value;
    var password = document.getElementById("password").value;
    if(password == null || password == ""){
        alert("密码不能为空！");
    }else if(userName == null || userName == ""){
        alert("用户名不能为空！");
    }else {
        $.ajax({
            type: "POST",
            url: 'management/verify_pwd',
            data: "userName=" + userName + "&password=" + password,
            dataType: 'text',
            success: function (data) {
                if (data == "false"){
                    alert("密码错误!");
                    document.getElementById("password").value = "";
                }
            }
        });
    }
}

function login() {
    var username = document.getElementById("username").value;
    var password = document.getElementById("password").value;
    if(password == null || password == ""){
        alert("密码不能为空！");
    }else if(username == null || username == ""){
        alert("用户名不能为空！");
    }else {
        $.ajax({
            type: "POST",
            url: 'management/getIndex',
            data: "username=" + username + "&password=" + password,
            dataType: 'text',
            success: function (data) {
                if (data == "false"){
                    alert("密码错误!");
                    // window.location.href="/";
                } else {
                    window.location.href="index";
                }
            }
        });
    }
}
