
<%--
  Created by IntelliJ IDEA.
  User: ThinkPad
  Date: 2018/11/29
  Time: 21:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>生活娱乐网—登录</title>

</head>
<style type="text/css">
    a:hover{
        color: red;
    }
    a{
        color: black;
    }

    .fixednav {
        position: fixed;
        top: 0px;
        right: 0px;
        width: 100%;
        z-index: 999;
    }

    .mini_login{
        display:none;
        position:absolute;
        z-index:2;
        background:white;
    }
    .mini_login .item{
        width:400px;
        margin:0 auto;
        height:48px;
        line-height:48px;
        padding:0 20px;
    }
    /* 登录窗第一行*/
    .mini_login .firstLine{
        color:#666;
        background:#f7f7f7;
        font-size:18px;
        font-weight:bold;
        cursor:move;
    }
    .mini_login .item .login_close{
        display:inline-block;
        float:right;
        cursor:pointer;
    }


    /* 登录按钮 */
    .mini_login .item a.btn_login{
        display:block;
        margin:10px 10% 0;
        height:30px;
        line-height:30px;
        width:80%;
        background:#4490F7;
        color:white;
        font-size:16px;
        font-weight:bold;
        text-align:center;
    }
    /* 遮罩层样式 */
    .cover{
        display:none;
        width:100%;
        height:100%;
        position:fixed;
        top:0;
        left:0;
        z-index:1;
        background-color:#000;
        opacity:0.3;
    }
</style>
<body>
  <div >
         <div class="mini_login" id="mini_login">
             <!-- 表单 -->
             <div class="item firstLine" id="firstLine">
                 <span class="login_title" style="cursor: pointer;color: blue" onclick="loginAction()" id="logindisplay">登录</span>
                 <span class="login_title" style="cursor: pointer" onclick="registerAction()" id="registerdisplay">注册</span>
                 <span class="login_close" id="close_minilogin" >X</span>

             </div>
             <div id="loginStyle" style="background-color: #e3e3e3">
                 <div style="width: 95%;margin: auto;height: 280px;border: 1px solid #e3e3e3" id="account1">
                     <form  method="post"  id="loginform" >
                         <table style="width: 90%;height:200px;margin-top: 40px;text-align: center;margin-left: 30px;line-height: 35px">
                             <tr >
                                 <td ><input type="tel" placeholder="账号" value="${user.userTelephone}" size="15" name="userTelephone" property="userTelephone" >  </td>

                             </tr>
                             <tr >
                                 <td ><input type="password" placeholder="密码" value="" size="15" name="userPassword" property="userPassword"> </td>

                             </tr>
                             <tr style="margin: auto;">
                                 <td colspan="2" ><input type="button" value="登录" style="width: 20%" onclick="login()"></td>
                             </tr>
                             <tr>
                                 <td>
                                     <div id="misserror1" style="display: none;color: red;"></div>
                                 </td>
                             </tr>
                         </table>
                     </form>

                 </div>
              <%--   <div style="width: 95%;margin: auto;height: 280px;border: 1px solid white;display: none" id="message1">
                     <form action="#"  >
                         <table style="width: 90%;height:200px;margin-top: 40px;margin-left: 30px;line-height: 35px;text-align: center;"  >
                             <tr    >
                                 <td colspan="2"><input type="tel" size="20px" placeholder="电话号"></td>
                             </tr>
                             <tr  >
                                 <td style="" align="right"><input type="text" size="7" placeholder="验证码"> </td>
                                 <td ><div style="background-color: #f0ad4e;height: 42px;width: 90px;" onclick="AccounTime()"><font size="4" >获取验证码</font></div></td>
                             </tr>
                             <tr style="text-align: center" >
                                 <td colspan="2"><input type="submit" style="width: 20%" value="确定"> </td>

                             </tr>
                         </table>
                     </form>
                 </div>--%>
                 <div style="width: 100%;height: 61px;">
                     <div style="width: 200px;height: 61px;text-align: center;line-height: 57px;background-color: #dbdbdb;margin:auto" id="AccountLogin"  >
                         <font size="4" style="margin-top: 10px">账号登录</font>
                     </div>
                    <%-- <div style="width: 200px;height: 61px;display: inline;float: left;text-align: center;line-height: 57px;cursor: pointer" id="MessageLogin" onclick="messageLogin()" >
                         <font size="4">短信登录</font>
                     </div>--%>
                 </div>
             </div>
             <div id="registerStyle" style="display: none">
                 <div style="width: 95%;margin: auto;height: 280px;border: 1px solid white" id="account2">
                     <form  method="post"   id="registerform">
                         <table style="width: 90%;height:200px;margin-top: 40px;text-align: center;margin-left: 30px;line-height: 35px">
                             <tr >
                                 <td ><input type="text" placeholder="昵称" value="" size="15" name="userName" > </td>
                                 <td><input type="hidden" ></td>
                             </tr>
                             <tr >
                                 <td ><input type="tel" placeholder="电话号" value="" size="15" name="userTelephone" > </td>
                                 <td><input type="hidden" ></td>
                             </tr>
                             <tr >
                                 <td ><input type="password" placeholder="密码" value="" size="15" name="userPassword" > </td>
                                 <td><input type="hidden" ></td>
                             </tr>
                             <tr style="margin: auto;">
                                 <td ><input type="button" value="注册" style="width: 20%" onclick="register()"></td>
                             </tr>
                             <tr>
                                 <td>
                                     <div id="misserror2" style="display: none;color: red;"></div>
                                 </td>
                             </tr>
                         </table>
                     </form>

                 </div>
              <%--   <div style="width: 95%;margin: auto;height: 280px;border: 1px solid white;display: none" id="messageRegister">
                     <form action="#"  >
                         <table style="width: 90%;height:200px;margin-top: 40px;margin-left: 30px;line-height: 35px;text-align: center;"  >
                             <tr    >
                                 <td colspan="2"><input type="tel" size="20px" placeholder="电话号"></td>
                             </tr>
                             <tr  >
                                 <td style="" align="right"><input type="text" size="7" placeholder="验证码"> </td>
                                 <td ><div style="background-color: #f0ad4e;height: 42px;width: 90px;" onclick="AccounTime()"><font size="4" >获取验证码</font></div></td>
                             </tr>
                             <tr style="text-align: center" >
                                 <td colspan="2"><input type="submit" style="width: 20%" value="确定"> </td>

                             </tr>
                         </table>
                     </form>
                 </div>--%>
                 <div style="width: 100%;height: 61px;">
                     <div style="width: 200px;height: 61px;text-align: center;line-height: 57px;background-color: #dbdbdb;margin:auto" id="AccountRegister"  >
                         <font size="4" style="margin-top: 10px">账号注册</font>
                     </div>
                 </div>
             </div>
         </div>
         <!-- 遮罩层 -->
         <div class="cover"></div>
   </div>
   <script>
       window.onload = function(){
           document.getElementById("btn_showlogin").onclick = shogMinLogin;
           document.getElementById("btn_showlogin1").onclick = shogMinLogin;
           document.getElementById("close_minilogin").onclick = closeLogin;
           document.getElementById("firstLine").onmousedown = moveLogin;
           /* 显示登录窗口 */
           function shogMinLogin(){
               var mini_login = document.getElementsByClassName("mini_login")[0];
               var cover = document.getElementsByClassName("cover")[0];
               mini_login.style.display = "block";
               cover.style.display = "block";
               mini_login.style.left = (document.body.scrollWidth - mini_login.scrollWidth) / 2 + "px";
               mini_login.style.top = $('mini_login').height()+$(document).scrollTop()+"px";
           }

           /* 关闭登录窗口 */
           function closeLogin(){

               var mini_login = document.getElementsByClassName("mini_login")[0];
               var cover = document.getElementsByClassName("cover")[0];
               mini_login.style.display = "none";
               cover.style.display = "none";
           }

           /* 移动登录窗口 */
           function moveLogin(event){
               var moveable = true;
               //获取事件源
               event = event ? event : window.event;
               var clientX = event.clientX;
               var clientY = event.clientY;

               var mini_login = document.getElementById("mini_login");
               console.log(mini_login);
               var top = parseInt(mini_login.style.top);
               var left = parseInt(mini_login.style.left);//鼠标拖动
               document.onmousemove = function(event){
                   if(moveable){
                       event = event ? event : window.event;
                       var y = top + event.clientY - clientY;
                       var x = left + event.clientX - clientX;
                       if(x>0 && y>0){
                           mini_login.style.top = y + "px";
                           mini_login.style.left = x + "px";
                       }
                   }
               }
               //鼠标弹起
               document.onmouseup = function(){
                   moveable = false;
               }
           }
       };
       var array=new Array();
       function login() {
           var oForm=document.getElementById("loginform");
          /* console.log(serializeForm1(oForm));*/
           var json=serializeForm1(oForm);
           array.length=0;
           $.ajax({
               type: "post",
               url: "/LifeWeb/Login/user_login",
               data: JSON.stringify(json),
               dataType: "json",
               contentType: "application/json;charset=UTF-8",
               success: function (result) {
                   if(result.code==100){
                       var mini_login = document.getElementsByClassName("mini_login")[0];
                       var cover = document.getElementsByClassName("cover")[0];
                       mini_login.style.display = "none";
                       cover.style.display = "none";
                       history.go(0);
                   }else{
                       var error=document.getElementById("misserror1");
                       error.style.display="block";
                       if(result.code==201){
                           error.innerHTML="密码不能为空"
                       }
                       if(result.code==202){
                           error.innerHTML="账户格式不正确"
                       }
                       if(result.code==203){
                           error.innerHTML="密码错误"
                       }
                       if(result.code==204){
                           error.innerHTML="账户不存在"
                       }
                       if(result.code==200){
                           error.innerHTML="账户密码格式出错"
                       }


                   }
               }
           });
       }
       function loginAction() {
           ${"logindisplay"}.style.color="blue";
           ${" registerdisplay"}.style.color="white";
           ${"loginStyle"}.style.display="block";
           ${"registerStyle"}.style.display="none";
       }
       function registerAction() {
           ${"logindisplay"}.style.color="white";
           ${" registerdisplay"}.style.color="blue";
           ${"loginStyle"}.style.display="none";
           ${"registerStyle"}.style.display="block";
       }
       function register() {
           var oForm=document.getElementById("registerform");
           var json=serializeForm1(oForm);
           array.length=0;
           $.ajax({
               type: "post",
               url: "/LifeWeb/Register/user_register",
               data: JSON.stringify(json),
               dataType: "json",
               contentType: "application/json;charset=UTF-8",
               success: function (result) {
                   if(result.code==100){
                       var mini_login = document.getElementsByClassName("mini_login")[0];
                       var cover = document.getElementsByClassName("cover")[0];
                       mini_login.style.display = "none";
                       cover.style.display = "none";
                       history.go(0);
                   }else{
                       var error=document.getElementById("misserror2");
                       error.style.display="block";
                       if(result.code==201){
                           error.innerHTML="密码不能为空"
                       }
                       if(result.code==202){
                           error.innerHTML="账户格式不正确"
                       }
                       if(result.code==203){
                           alert("注册失败");
                       }
                       if(result.code==204){
                           error.innerHTML="账户已被注册"
                       }


                   }
               }
           });
       }
       function serializeForm1(form){
           var setForm = "";
           for(var key in form){
               if(form.hasOwnProperty(key)){
                   setForm += '"'+form[key].name+'"'+':'+'"'+form[key].value + '"'+',';
               }
           }
           setForm = "{" + setForm.slice(0,setForm.length -1) + "}";
           // console.log(JSON.parse(setForm));
           return JSON.parse(setForm);
       }


   </script>
</body>
</html>
