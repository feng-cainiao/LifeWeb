<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: ThinkPad
  Date: 2019/3/25
  Time: 13:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>个人信息</title>
    <meta http-equiv="Cache-Control" content="no-cache, must-revalidate">
    <script src="https://code.jquery.com/jquery-3.2.1.min.js" ></script>
    <script src="../static/js/jquery-form.js" ></script>
</head>
<style type="text/css">
    .user_btn{
        height: 50px;
        width: 100px;
        line-height: 50px;
        text-align: center;
        float: left;
        font-size: 18px;
        margin-left: 150px;
    }
    .user_btnHover{
        height: 50px;
        width: 100px;
        line-height: 50px;
        text-align: center;
        float: left;
        font-size: 18px;
        margin-left: 150px;
        background-color: orange;
    }
    .user_info{
        height: 400px;
        width:500px;
        margin: auto;
        display: none;

    }
    .user_infoHover{
        height: 400px;
        width:700px;
        margin: auto;
        display: block;

    }
</style>
<body>
<div style="width: 100%;height: auto; " >
    <%--<jsp:include page="navigation.jsp"></jsp:include>--%>
</div>
<div style="width: 80%;margin: auto">
    <div style="width: 100px;margin: auto;height: 45px"><font size=5 color="orange">用户信息</font></div>
    <div style="width: 80%;margin: auto;border-bottom: 1px orange solid;border-top: 1px orange solid;height: 50px">
        <div style="margin: auto;">
            <div class="user_btnHover" id="btn1" onmouseover="select(0)">我的信息</div>
            <div class="user_btn" id="btn2" onmouseover="select(1)">更改密码</div>
            <div class="user_btn" id="btn3" onmouseover="select(2)">我的收藏</div>
        </div>
    </div>
    <div style="width: 80%;height:450px;margin:10px auto;border: 1px solid cornflowerblue">
         <div class="user_infoHover" id="info1">
             <div style="width: 40%;margin:10px auto">
                 <div style="height:120px;line-height: 120px">
                     <label>头像</label>
                     <img id="userImage" src="../static/userphoto/${user.userPhoto}" class="img-rounded" style="width:100px;height: 100px;margin-left: 50px">
                 </div>
                 <div style="height: 80px;line-height: 80px">
                     <label>昵称</label>
                     <label style="margin-left: 50px">${user.userName}</label>
                 </div>
                 <div style="height: 80px;line-height: 80px">
                     <label>账号</label>
                     <label style="margin-left: 50px">${user.userTelephone}</label>
                 </div>
                 <div style="height: 80px;">
                     <form  id="photoForm"  enctype="multipart/form-data" >
                         <input type="file" name="headPhotoFile" id="image_input">
                         <button type="button" onclick="upload()" >修改头像</button>
                     </form>
                 </div>
             </div>
         </div>
         <div class="user_info" id="info2">
            <div style="width: 40%;margin:10px auto">
                <div style="">
                    <label >新密码</label>
                        &nbsp;&nbsp;&nbsp;<input name="password" type="password" id="input1"/>
                </div>
                <div style="">
                    <label>确认密码</label>
                        <input name="passwordConfirm" type="password" id="input2"/>
                </div>
                <div style="margin:5px 60px;">
                    <input type="button" onclick="confirm()" value="确认">
                </div>
            </div>
        </div>
        <div class="user_info" id="info3">
            <div style="width: 100%;height: 100%;margin:10px auto;">
                <div style="height: 30px;line-height: 30px;width: 100%">
                    <div style="float: left;margin-left: 5px"> 序号</div>
                    <div style="float: left;margin-left: 280px"> 标题</div>
                    <div style="float: left;margin-left: 260px">时间</div>
                </div>
                <c:forEach items="${collections}" var="collectioin" varStatus="c" >
                    <div style="width: 100%;margin-top: 5px;height: 40px;">
                        <div style="float: left;margin-left: 5px">${c.index+1}</div>
                        <div style="float: left;margin-left: 120px;width:400px;" title="${collectioin.newsTitle}"> ${collectioin.newsTitle} </div>
                        <div style="float: left;margin-left: 20px;">
                            <fmt:formatDate value="${collectioin.collectionTime}" type="both" dateStyle="short" timeStyle="short"></fmt:formatDate>
                        </div>
                    </div>
                </c:forEach>

            </div>
        </div>
    </div>
</div>
 <script>

     function select(id) {
         var btn=["btn1","btn2","btn3"];
         var info=["info1","info2","info3"]
         for(var i=0;i<3;i++){
             if(i==id){
                 document.getElementById(btn[i]).className="user_btnHover";
                 document.getElementById(info[i]).className="user_infoHover";
             }else{
                 document.getElementById(btn[i]).className="user_btn";
                 document.getElementById(info[i]).className="user_info";
             }
         }
     }
     function confirm(){
         var pa1=document.getElementById("input1").value;
         var pa2=document.getElementById("input2").value;
         if(pa1!=pa2){
             alert("两次密码不一致，请重新输入");
             document.getElementById("input2").value="";
             return;
         }
         var userid=${user.userId};
         $.ajax({
             type: "post",
             url: "/LifeWeb/User/update",
             data: {password:pa1,userId:userid},
             dataType: "json",
             contentType: "application/json;charset=UTF-8",
             success: function (result) {
                 if(result.code==100){
                     alert("修改成功")
                 }else{
                     alert("修改失败");
                 }
             }
         });
     }
     function  upload() {
         var imagePath = $("#image_input").val();
         if (imagePath == '') {
             alert("请选择图片");
             return false;
         }
         var strExtension = imagePath.substr(imagePath.lastIndexOf('.') + 1);
         if (strExtension != 'jpg' && strExtension != 'gif' && strExtension != 'png' && strExtension != 'bmp') {
             alert("请选择图片");
             return false;
         }
         $('#photoForm').ajaxSubmit({
             type : "POST",
             url : "../uploadFile/uploadUserPhoto",
             cache:false,
             ifModified :true ,
             dataType:"text",
             success : function(data){

                   $("#userImage").attr("src","/userphoto/"+data);
             }
         })
     }

 </script>
</body>
</html>
