

//鼠标移开，用户框
function userNameBlur() {
    var userLogin=document.getElementById("userLogin").value;
    var userlg=document.getElementById("userlg");
    if(userLogin==""){
        userlg.innerHTML="请输入用户名！";
    }else{
        userlg.innerHTML="";
        return true;
    }

}
//鼠标移开，密码框
function pwdBlur() {
    var pwdLogin=document.getElementById("pwdLogin").value;
    var pwdlg=document.getElementById("pwdlg");
    if(pwdLogin==""){
        pwdlg.innerHTML="请输入密码！";
    }else {
        pwdlg.innerHTML="";
        return true;
    }
}
//鼠标移开，验证码
function codeBlur() {
    var codeLogin=document.getElementById("codeLogin").value;
    var codelg=document.getElementById("codelg");
    if(codeLogin==""){
        codelg.innerHTML="请输入验证码！";
    }else{
        codelg.innerHTML="";
        return true;
    }
}

//提交form表单
function login() {
    userNameBlur();
    pwdBlur();
    // codeBlur();
    yzcode();
    var userName=userNameBlur();
    var pwd=pwdBlur();
    var yz=yzcode();

    if(userName==true&&pwd==true&&yz==true){
        return true;
    }else{
        return false;
    }
}

//随机获取验证码
function createCode()
{
    var code=document.getElementById("codeyz");
    var len=4; //验证码位数
    var seed = new Array(
        'abcdefghijklmnopqrstuvwxyz',
        'ABCDEFGHIJKLMNOPQRSTUVWXYZ',
        '0123456789'
    );               //创建需要的数据数组
    var idx,i;
    var result = '';   //返回的结果变量
    for (i=0; i<len; i++) //根据指定的长度
    {
        idx = Math.floor(Math.random()*3); //获得随机数据的整数部分-获取一个随机整数
        result += seed[idx].substr(Math.floor(Math.random()*(seed[idx].length)), 1);//根据随机数获取数据中一个值
    }
    code.innerHTML=result; //返回随机结果
}

//验证验证码
function yzcode() {
    var codeLogin = document.getElementById("codeLogin").value;
    var codeyz = document.getElementById("codeyz").innerHTML;
    var codelg = document.getElementById("codelg");
    if (codeLogin == "") {
        codelg.innerText = "请输入验证码！";
    } else {

    if (codeLogin == codeyz) {
        codelg.innerText = "";
        return true;
    } else {
        codelg.innerText = "验证码错误！";
    }
}

}
