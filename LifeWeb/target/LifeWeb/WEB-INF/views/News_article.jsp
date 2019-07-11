<%--
  Created by IntelliJ IDEA.
  User: ThinkPad
  Date: 2018/10/18
  Time: 8:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Article</title>
    <script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
<body>
<div style="width: 100%;height: auto; ">
    <nav class="navbar navbar-default " role="navigation">
        <div class="container-fluid" style="width: 100%">
            <div class="navbar-header" style="width: 10%">
                <a class="navbar-brand" href="#">生活娱乐网</a>
            </div>
            <div>
                <ul class="nav navbar-nav" style="width: 90%">
                    <li class="active" style="float:left"><a href="#">链接1</a></li>
                    <li style="float:left"><a href="#">链接2</a></li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" rel="drevil">
                            链接3
                        </a>
                        <ul class="dropdown-menu" id="disp">
                            <li style="align-content: center">
                                <table style="text-align:center;width: 400px;height: 200px;padding: 20px;margin: auto;">
                                    <tr>
                                        <td><a href="#">链接1</a></td>
                                        <td><a href="#">链接1</a></td>
                                        <td><a href="#">链接1</a></td>
                                        <td><a href="#">链接1</a></td>
                                    </tr>
                                    <tr>
                                        <td><a href="#">链接1</a></td>
                                        <td><a href="#">链接1</a></td>
                                        <td><a href="#">链接1</a></td>
                                        <td><a href="#">链接1</a></td>
                                    </tr>
                                </table>
                            </li>
                        </ul>
                    </li>
                    <li style="margin-left: 550px;">

                            <div class="container-fluid" >
                                <form class="navbar-form navbar-left" role="search">
                                    <div class="form-group">
                                        <input type="text" class="form-control" placeholder="Search">
                                    </div>
                                    <button type="submit" class="btn btn-default">搜索</button>
                                </form>
                            </div>

                    </li>
                    <li style="margin-left: 40px;">
                        <button type="button" class="btn btn-primary" style="margin-top: 9px">一键登录</button>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
</div>
<div style="width: 90%;margin:auto;height: 100px;text-align: center;padding:20px;">
    <div style="height: 100%">插入图片</div>
</div>
<div style="width: 90%;margin:auto;height: 900px;">
    <div style="width: 76%;display: inline;float: left;height: auto;">
        <div style="width: 100%;margin:auto;height: 70px;">
            <p>新闻主题</p>
        </div>
        <div style="width: 100%;margin:auto;height: auto;">
            <div style="width: 18%;height:auto;display: inline;float: left;border-right: 1px #adadad solid;">
                <div style="width: 100%;padding: 10px;height: 170px">
                    <ul style="list-style: none">
                        <li>年</li>
                        <li>月</li>
                        <li>日</li>
                        <li>作者</li>
                    </ul>
                </div>

                <div style="width: 100%;padding: 10px;height: 170px">
                    分享
                </div>
                <div style="width: 100%;padding: 10px;height: auto">
                    评论
                </div>
            </div>

            <div style="width: 82%;height:auto;display: inline;float: left;">
                <div style="width: 98%;height:auto;margin-left: 15px;">
                    内容
                </div>
                <div style="width: 98%;height:200px;margin-left: 15px;margin-top: 40px;text-align: center">
                     <div>The  End</div>
                     <div style="margin-top: 20px">新闻立场只是媒体所发出的  不代表生活娱乐网的观点</div>
                     <div style="margin-top: 40px">点赞</div>
                </div>
                <hr  style="width: 98%;color: #adadad;margin-left: 15px">
                <div style="width: 98%;margin-top: 40px;height: 200px;margin-left:15px;">
                   <div style="width:100%;height: 50px;margin:auto">
                       <div style="width: 85%;height: 100%;display: inline;float: left;"><font size="5">网友评论</font><font style="margin-left: 5px;color: #adadad;size: B4">请自觉遵守法律文明发言</font></div>
                       <div style="width: 15%;height: 100%;display: inline;float: left;text-align: right">  条评论</div>
                   </div>
                    <div style="width:100%;height: 120px;margin:auto">
                        <div style="width: 15%;height: 50%;display: inline;float: left;">
                            <img src="/wp-content/uploads/2014/06/download.png" class="img-circle">
                        </div>
                        <div style="width: 70%;height: 100%;display: inline;float: left;">
                            <textarea class="form-control" rows="5.3"></textarea>
                        </div>
                        <div style="width: 15%;height: 94%;display: inline;float: left;">
                            <button type="button" class="btn btn-primary btn-lg" style="width: 100%;height: 100%">登录</button>
                        </div>
                    </div>

                </div>
                <div style="width:98%;height:40px;margin-top:10px;margin-left:15px;">
                    <div style="width: 85%;height: 100%;display: inline;float: left;"><font size="5">全部评论</font>/<a href="#">我的评论</a> </div>
                    <div style="width: 15%;height: 100%;display: inline;float: left;text-align: right"><a href="#">最新</a>/<a href="#">最热</a> </div>
                </div>
                <div style="width: 98%;border-bottom: 1px #adadad solid;margin-top: 30px;margin-left:15px;">
                    <div style="width: 15%;height: auto;display: inline;float: left;">
                        <img src="/wp-content/uploads/2014/06/download.png" class="img-circle">
                    </div>
                    <div style="width: 85%;height: auto;display: inline;float: left;">
                        <div>
                            <font style="size: B4;color: #2e6da4">昵称</font>
                            <font style="size: B4;color: #adadad;margin-left:10px">时间</font>
                        </div>
                        <div style="margin-top:5px;width: 100%;height: auto">评论内容</div>
                        <div style="margin-top:9px;width: 100%;background:#F5F5F5;height: auto;padding: 10px;">
                            <div style="width: 100% ;margin-left: 7px;">
                                <div style="width: 100%">
                                    <strong>回复人呢称：</strong>内容
                                </div>
                                <div><a href="#" style="margin-left: 5px">赞</a><a href="#"style="margin-left: 5px" >回复</a><font style="size: B4;color: #adadad;margin-left:10px">时间</font></div>
                            </div>
                        </div>
                        <div>
                            <a href ="#" style="margin-left: 10px">赞</a>
                            <a href ="#" style="margin-left: 10px">回复</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div style="width: 2%;display: inline;float: left;height: auto;border:1px white solid"></div>
    <div style="width: 22%;display: inline;float: left;height: 100px;margin-top: 40px">
        <div style="width: 100%;height:60px;padding: 5px;">
            <div style="width: 70%;display: inline;float: left;height: auto;">相关推荐</div>
            <div style="width: 30%;display: inline;float: left;height: auto;">换一换</div>
        </div>
        <div style="width: 100%;height:auto;">
              <div style="width: 100%;height: 140px">
                  图片
              </div>
            <div style="width: 100%;height: 40px;padding:3px;">
                新闻主题
            </div>
            <div style="width: 100%;height: 140px;margin-top: 15px">
                图片
            </div>
            <div style="width: 100%;height: 40px;padding:3px">
                新闻主题
            </div>

            <div style="width: 100%;height: 140px;margin-top: 15px">
                图片
            </div>
            <div style="width: 100%;height: 40px;padding:3px">
                新闻主题
            </div>

            <div style="width: 100%;height: 140px;margin-top: 15px">
                图片
            </div>
            <div style="width: 100%;height: 40px;padding:3px">
                新闻主题
            </div>
        </div>
    </div>
</div>
<div style="width:90%;margin: auto;height: 100px;text-align-all: center;">
    <<div style="text-align: center;margin: auto;"><a href="#">网站1</a>|<a href="#">网站1</a>|<a href="#">网站1</a>|<a href="#">网站1</a>|<a href="#">网站1</a> </div>
    <div style="text-align: center">Copyright © 1998 - 2018 Tencent. All Rights Reserved</div>
    <div style="text-align: center">腾讯公司 版权所有</div>


</div>

<script>
    /* function accountLogin() {
${"AccountLogin"}.style.backgroundColor='#dbdbdb';
           ${"MessageLogin"}.style.backgroundColor='#FFFFFF';
           ${"account1"}.style.display="block";
           ${"message1"}.style.display="none";

       }*/
    /*  function messageLogin(){
${"AccountLogin"}.style.backgroundColor='#FFFFFF';
           ${"MessageLogin"}.style.backgroundColor='#dbdbdb';
           ${"account1"}.style.display="none";
           ${"message1"}.style.display="block";


       }*/
    /*  function setSelectUserNo(radioObj){

          var radioCheck= $(radioObj).val();
          if("1"==radioCheck){
              $(radioObj).attr("checked",false);
              $(radioObj).val("0");

          }else{
              $(radioObj).val("1");

          }
      }*/
    function registerAccount() {
        ${"accountRegister"}.style.display="block";
        ${"messageRegister"}.style.display="none";
        ${"AccountColor"}.style.backgroundColor="#dbdbdb";
        ${"MessageColor"}.style.backgroundColor="white";
    }
    function registerMessage(e){
        ${"accountRegister"}.style.display="none";
        ${"messageRegister"}.style.display="block";
        ${"MessageColor"}.style.backgroundColor="#dbdbdb";
        ${"AccountColor"}.style.backgroundColor="white";
    }
    <%-- <div style="width: 95%;margin: auto;height: 280px;border: 1px solid white" id="account1">
              <form action="/LifeWeb/Login/user_login" method="post" modelAttribute="user">
                      <table style="width: 90%;height:200px;margin-top: 40px;text-align: center;margin-left: 30px;line-height: 35px">
                          <tr >
                              <td ><input type="tel" placeholder="账号" value="${user.userTelephone}" size="15" name="userTelephone" property="userTelephone" >  </td>
                              <td><form:errors path="user.userTelephone" cssClass="error" /></td>
                          </tr>
                          <tr >
                              <td ><input type="password" placeholder="密码" value="" size="15" name="userPassword" property="userPassword"> </td>
                              <td><form:errors path="user.userPassword" cssClass="error" /></td>
                          </tr>
                          <tr style="margin: auto">
                              <td colspan="2"><input type="radio"onclick="setSelectUserNo(this);"><font size="4">记住密码 </font></td>
                          </tr>
                          <tr style="margin: auto;">
                              <td colspan="2" ><input type="submit" value="登录" style="width: 20%"></td>
                          </tr>
                      </table>
              </form>

           </div>
           <div style="width: 95%;margin: auto;height: 280px;border: 1px solid white;display: none" id="message1">
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
                <div style="width: 50%;height: 100%;display: inline;float: left;text-align: center;line-height: 57px" class="title" onclick="account()">
                    <font size="4" style="margin-top: 10px">账号登录</font>
                </div>
                <div style="width: 50%;height: 100%;display: inline;float: left;text-align: center;line-height: 57px" class="title" onclick="message()">
                    <font size="4">短信登录</font>
                </div>
            </div>--%>
    /* @RequestMapping(value="/getUserPhoto",method = RequestMethod.GET)  //首页获取新闻图片
 public void UserPhoto(HttpSession httpSession, HttpServletRequest request, HttpServletResponse response, Model model) {
     User user=(User)httpSession.getAttribute("user");
     byte[] data;
     if(user!=null) {
         data = user.getUserPhoto();
     }else {
         return ;
     }

     response.setContentType("img/jpeg");
     response.setCharacterEncoding("utf-8");
     try {

         OutputStream outputStream = response.getOutputStream();
         InputStream in = new ByteArrayInputStream(data);

         int len = 0;
         byte[] buf = new byte[1024];
         while ((len = in.read(buf, 0, 1024)) != -1) {
             outputStream.write(buf, 0, len);
         }
         outputStream.close();
     } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
     }
 }
*/

</script>

</body>
</html>
