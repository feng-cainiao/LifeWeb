<%--
  Created by IntelliJ IDEA.
  User: ThinkPad
  Date: 2018/12/4
  Time: 21:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>register</title>
    <script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<style type="text/css">
    a:hover{
        color: red;
    }
    a{
        color: black;
    }
    .title:hover{
        background: #dbdbdb;
    }
    .fixednav {
        position: fixed;
        top: 0px;
        right: 0px;
        width: 100%;
        z-index: 999;
    }
    input{
        padding: 2px 0px;
        font-size: 20px;
    }
    .mini_register{
        display:none;
        position:absolute;
        z-index:2;
        background:white;
    }
    .mini_register .item{
        width:400px;
        margin:0 auto;
        height:48px;
        line-height:48px;
        padding:0 20px;
    }
    /* 登录窗第一行*/
    .mini_register .firstLine{
        color:#666;
        background:#f7f7f7;
        font-size:18px;
        font-weight:bold;
        cursor:move;
    }
    .mini_register .item .register_close{
        display:inline-block;
        float:right;
        cursor:pointer;
    }


    /* 登录按钮 */
    .mini_register .item a.btn_login{
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
      <div class="mini_register" id="mini_register">
          <!-- 表单 -->
          <div class="item firstLine" id="firstLine">
              <span class="register_title">注册界面</span>
              <span class="register_close" id="close_miniregister">X</span>
          </div>

          <div style="width: 95%;margin: auto;height: 280px;border: 1px solid white" id="accountRegister">
              <form  method="post"   >
                  <table style="width: 90%;height:200px;margin-top: 40px;text-align: center;margin-left: 30px;line-height: 35px">
                      <tr >
                          <td ><input type="text" placeholder="昵称" value="" size="15" name="userName" property="userName"> </td>
                      </tr>
                      <tr >
                          <td ><input type="tel" placeholder="电话号" value="" size="15" name="userTelephone" property="userTelephone"> </td>
                      </tr>
                      <tr >
                          <td ><input type="password" placeholder="密码" value="" size="15" name="userPassword" property="userPassword"> </td>
                      </tr>

                      <tr style="margin: auto;">
                          <td ><input type="button" value="注册" style="width: 20%" onclick="register()"></td>
                      </tr>
                      <tr>
                          <td>
                              <div id="misserror" style="display: none;color: red;"></div>
                          </td>
                      </tr>
                  </table>
              </form>

          </div>
          <div style="width: 95%;margin: auto;height: 280px;border: 1px solid white;display: none" id="messageRegister">
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
          </div>
          <div style="width: 100%;height: 61px;">
              <div style="width: 50%;height: 100%;display: inline;float: left;text-align: center;line-height: 57px;background-color: #dbdbdb" id="AccountColor" onclick="registerAccount(e)">
                  <font size="4" style="margin-top: 10px">账号注册</font>
              </div>
              <div style="width: 50%;height: 100%;display: inline;float: left;text-align: center;line-height: 57px" id="MessageColor" onclick="registerMessage(e)">
                  <font size="4">短信注册</font>
              </div>
          </div>
      </div>
      <!-- 遮罩层 -->
      <div class="cover"></div>
   <%-- <div style="">
        <form action="/LifeWeb/Register/user_register" method="post" >
            <table style="width: 90%;height:200px;margin-top: 40px;text-align: center;margin-left: 30px;line-height: 35px">
                <tr >
                    <td ><input type="text" placeholder="昵称" value="" size="15" name="userName" property="userName"> </td>
                    <td><form:errors path="user.userName" cssClass="error" /></td>
                </tr>
                <tr >
                    <td ><input type="tel" placeholder="电话号" value="" size="15" name="userTelephone" property="userTelephone">  </td>
                    <td><form:errors path="user.userTelephone" cssClass="error" /></td>
                </tr>
                <tr >
                    <td ><input type="password" placeholder="密码" value="" size="15" name="userPassword" property="userPassword"> </td>
                    <td><form:errors path="user.userPassword" cssClass="error" /></td>
                </tr>
                <tr>
                    <td><input type="file" ></td>
                </tr>
               &lt;%&ndash; <tr >
                    <td colspan="2">
                           <div style="padding: 10px 20px">
                               <form role="form" enctype="multipart/form-data" method="post">
                                   <div class="embed-responsive embed-responsive-16by9">
                                       <div class="embed-responsive-item pre-scrollable">
                                           <img alt="" src="${pageContext.request.contextPath}/img/showings.jpg" id="cut-img" class="img-responsive img-thumbnail"/>
                                       </div>
                                   </div>
                                   <div class="white-divider-md"></div>
                                   <input type="file" name="imgFile" id="fileUpload"/>
                                   <div class="white-divider-md"></div>
                                   <div id="alert" class="alert alert-danger hidden" role="alert"></div>
                                   <input type="hidden" id="x" name="x"/>
                                   <input type="hidden" id="y" name="y"/>
                                   <input type="hidden" id="w" name="w"/>
                                   <input type="hidden" id="h" name="h"/>
                               </form>
                           </div>
                    </td>
                </tr>&ndash;%&gt;
                <tr style="margin: auto;">
                    <td colspan="2" ><input type="submit" value="注册" style="width: 20%"></td>
                </tr>
            </table>
        </form>

    </div>
    <div style="width: 95%;margin: auto;height: 280px;margin-top: 7px;border: 1px solid white;display: none" id="message1">
        <form action="#"  >
            <table style="width: 90%;height:200px;margin-top: 40px;margin-left: 30px;line-height: 35px;"  >
                <tr style="text-align: center"   >
                    <td colspan="2"><input type="tel" size="20px" placeholder="电话号"></td>
                </tr>
                <tr  >
                    <td style="height: 100%;" align="right"><input type="text" size="7" placeholder="验证码"> </td>
                    <td ><div style="background-color: #f0ad4e;height: 42px;width: 90px;" onclick="AccounTime()"><font size="4" >获取验证码</font></div></td>
                </tr>
                <tr style="text-align: center" >
                    <td colspan="2"><input type="submit" style="width: 20%" value="确定"> </td>

                </tr>
            </table>
        </form>
    </div>
    <div style="width: 100%;height: 61px;">
        <div style="width: 50%;height: 100%;display: inline;float: left;text-align: center;line-height: 57px" class="title" onclick="account()">
            <font size="4" style="margin-top: 10px">账号登录</font>
        </div>
        <div style="width: 50%;height: 100%;display: inline;float: left;text-align: center;line-height: 57px" class="title" onclick="message()">
            <font size="4">短信登录</font>
        </div>
    </div>--%>
</div>
  <script>
    function registerAccount() {
        ${"accountRegister"}.style.display="block";
        ${"messageRegister"}.style.display="none";
        ${"AccountColor"}.style.backgroundColor="#dbdbdb";
        ${"messageRegister"}.style.backgroundColor="#dbdbdb";
    }
    function registerMessage(e){
        ${"accountRegister"}.style.display="none";
        ${"messageRegister"}.style.display="block";
        ${"messageRegister"}.style.backgroundColor="#dbdbdb";
        ${"AccountColor"}.style.backgroundColor="white";
    }


</script>
</body>
</html>
