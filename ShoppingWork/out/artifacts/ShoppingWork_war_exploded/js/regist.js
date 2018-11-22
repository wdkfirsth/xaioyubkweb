

//鼠标移开，昵称
function userNameBlur() {
    var username=document.getElementById("namers").value;
    var ckuser=document.getElementById("ckuser");
    if(username==""){
        ckuser.innerHTML="请输入昵称！";
    }else {
        ckuser.innerHTML="";
        return true;
    }
}
//鼠标移开，邮箱
function emailBlur() {
    var email=document.getElementById("emailrs").value;
    var ckemail=document.getElementById("ckemail");
    if(email==""){
        ckemail.innerHTML="请输入邮箱！";
    }else{
        ckemail.innerHTML="";
        return true;
    }
}

//鼠标移开，密码
function pwdBlur(){
    var pwd=document.getElementById("pwdrs").value;
    var ckpwd1=document.getElementById("ckpwda");
    if(pwd==""){
        ckpwd1.innerHTML="请输入密码！";
    }else{
        ckpwd1.innerHTML=""
        return true;
    }
}

//鼠标移开，确认密码
function ckpwdBlur() {
    var pwd=document.getElementById("pwdrs").value;
    var ckpwdrs=document.getElementById("ckpwdrs").value;
    var ckpwd2=document.getElementById("ckpwdb");
    if(ckpwdrs==""){
        ckpwd2.innerHTML="请确认密码！"
    }else{

        if(pwd!=ckpwdrs){
            ckpwd2.innerHTML="两次密码不一致，请重新输入！";
        }else{
            ckpwd2.innerHTML="";
            return true;
}
}

}

//提交form表单
function regist() {
    userNameBlur();
    emailBlur();
    pwdBlur();
    ckpwdBlur();
    var ckuser=userNameBlur();
    var ckemail=emailBlur();
    var ckpwd=pwdBlur();
    var ckpwds=ckpwdBlur();
    if(ckuser==true&&ckemail==true&&ckpwd==true&&ckpwds==true){
        return true;
    }else{
        return false;
    }

}