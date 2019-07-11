<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ThinkPad
  Date: 2018/11/8
  Time: 19:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>导航栏</title>


</head>

<style type="text/css">
    .fixednav {
        position: fixed;
        top: 0px;
        left: 0px;
        width: 100%;
        z-index: 999;
    }

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

</style>
<body>
<div style="width: 100%;height: auto; " class="navigation">
    <jsp:include page="navigation.jsp"></jsp:include>
    <jsp:include page="News_login.jsp"></jsp:include>
</div>
<div style="width: 85%;height: 120px;margin:auto" >
    <img src="../static/photo/ad.png" style="width: 100%">
</div>
<div style="width:85%;height: auto;margin:auto;margin-top: 20px">
    <div style="width: 15%;height:auto;display: inline;float: left;" class="top" >
        <table style="width: 100%;height: auto;border: 1px lightblue;collapse: 0;line-height: 45px;" >
            <tr style="border: 1px solid lightblue;background-color: #28a4c9" ><td style="text-align: center"><font size="5"></font>相关频道</td></tr>
            <c:forEach items="${channellist}" var="channel">
                   <tr style="border: 1px solid lightblue" >
                       <td style="text-align: center">
                           <div style="font-size: 19px;cursor: pointer" onclick="keyWord(${channel.titleId})">${channel.titleName}</div>
                       </td>
                   </tr>
            </c:forEach>
        </table>
    </div>
    <div style="width: 2%;height:auto;display: inline;float: left;border:1px white solid;"></div>
    <div style="width: 57%;height:auto;display: inline;float: left;">
        <c:forEach items="${listArticle}" var="list" varStatus="st">
        <div  class="title" style="padding: 15px">
            <a  style="width: 100%;height:150px;" target="_blank" href="/LifeWeb/Article/article?newsNid=${list.newsNid}" >
                <div style="width: 100%;height:150px;text-align: center;"  >
                    <div style="width: 35%;height:150px;display: inline;float: left; " >
                        <img style="width: 100%;height:140px" src="../static/newsPhoto/${list.newsPicture}" onerror="this.src='../static/photo/NewsError.jpg'">
                    </div>
                    <div style="width: 60%;height:150px;display: inline;float: left;margin-left: 9px;" >
                        <font  size="3" color="black">${list.newsTitle}</font>
                    </div>
                </div>
            </a>
        </div>
        </c:forEach>

    </div>
    <div style="width: 2%;height:200px;display: inline;float: left;border:1px white solid;"></div>
    <div style="width: 24%;height:200px;display: inline;float: left">
        <p><font size="4" color="#6495ed">独家原创</font></p>
        <div style="width: 100%;height: 600px;background-color: #dbdbdb">
              <div style="width: 100%;height: 300px;">
                  <div style="width: 100%;height: 50px;line-height: 50px;" >
                      <div style="width: 100%;height: 35px;border-left:2px solid #31b0d5;">
                          <p style="margin-left: 15px;">养生之道</p>
                      </div>
                  </div>
                  <c:forEach var="list1" items="${newsList1}">
                      <div style="width: 90%;height: 200px;margin: auto">
                          <img src="../static/newsPhoto/${list1.newsPicture}" style="width: 100%;height: 95%">
                      </div>
                      <div style="width: 100%;height:40px;margin-top: 5px">
                          <p style="margin-left: 20px;margin-top: 5px">${list1.newsTitle}</p>
                      </div>
                  </c:forEach>
              </div>
            <div style="width: 100%;height: 300px;">
                <div style="width: 100%;height: 50px;line-height: 50px" >
                    <div style="width: 100%;height: 35px;border-left:2px solid #31b0d5;">
                        <p style="margin-left: 15px">热门话题</p>
                    </div>
                </div>
                <c:forEach var="list2" items="${newsList2}">
                    <div style="width: 90%;height: 200px;margin: auto">
                        <img src="../static/newsPhoto/${list2.newsPicture}" style="width: 100%;height:95%;margin: auto;">
                    </div>
                    <div style="width: 100%;height:40px;margin-top: 5px">
                        <p style="margin-left: 20px;margin-top: 5px">${list2.newsTitle}</p>
                    </div>
                </c:forEach>
            </div>
        </div>
    </div>
</div>
<script type="text/javascript">
    $(function(){
        var nav=$(".navigation"); //得到导航对象
        var win=$(window); //得到窗口对象
        var sc=$(document);//得到document文档对象。
        win.scroll(function(){
            if(sc.scrollTop()>=100){
                nav.addClass("fixednav");
            }else{
                nav.removeClass("fixednav");
            }
        })
    })
    function cancel() {
        $.ajax({
            type: "post",
            url: "/LifeWeb/Admin/login_cancel",
            data: null,
            dataType: "json",
            contentType: "application/json;charset=UTF-8",
            success: function (result) {
                if(result.code==100){
                    history.go(0);
                }else{
                    alert("注销失败");
                }
            }
        });
    } //注销账户
    function search(){
        var sch=document.getElementById('seh').value;
        if(sch==''){
            sch= document.getElementById('seh').getAttribute('placeholder');
        }
        window.location.href='/LifeWeb/Search/search?searchword='+sch;
    }
    function keyWord(id) {
        window.location.href='/LifeWeb/Search/searchChannel?channel='+id;

    }
</script>
</body>
</html>
