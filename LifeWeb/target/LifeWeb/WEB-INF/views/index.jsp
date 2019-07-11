<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Cache-Control" content="no-cache">
<meta http-equiv="Expires" content="0">

<html>
<%
    String pagePath=request.getContextPath();
%>
<head>
    <title>生活娱乐网</title>
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
    .title1:hover{
        background: #dbdbdb;
    }


</style>
<body>

<div style="width: 100%;height: 120px;" >
    <div style="width: 85%;display: inline;float: left;margin-left:90px;">
        <img src="static/photo/ad.png" style="width: 100%;height: 100%" >
    </div>
    <div style="width:7%;display: inline;float: left;margin-left: 9px;margin-top: 3px" >
        <c:if test="${user.userId==null}">
            <div style="height: 102px ;">
                <span style="display: none;" id="btn_showlogin1"></span>
                    <div style="width: 100%;height: 50px ;text-align: center;padding-top: 5px;font-size: 21px;cursor: pointer;font-weight: bold" class="btn_login" id="btn_showlogin" >
                        登录/注册
                    </div>

            </div>
        </c:if>
        <c:if test="${user.userId!=null}">
          <a href="User/userUpdate" target="_blank">
            <div style="width: 100%;height: 70px;text-align: center">
                  <img src="static/userphoto/${user.userPhoto}" style="width: 100%;height: 100%;" class="img-rounded" onerror="this.src='static/photo/userError.jpg'">
            </div>
            <div title="${user.userName}" style="width: 100%;height: 20px;margin-top: 3px;text-align: center;font-size: 15px;overflow: hidden;text-overflow: ellipsis; white-space: nowrap; cursor: pointer;">
                 ${user.userName}
            </div>
          </a>
            <div style="width: 100%;height: 10px;margin-top: 1px;text-align: center;font-size: 15px;cursor: pointer" onclick="cancel()">
               注销
            </div>
        </c:if>
    </div>
</div>
<div style="margin: auto;width: 85%;height: 60px">
    <div style="width:60% ;display: inline;height: auto;float: left">
        <img src="static/photo/logo.png" style="width: 30% ;height: 100%">
    </div>
    <div style="width: 40%;display: inline;height: auto;float: left;">
        <nav class="navbar  navbar-right" role="navigation" >
            <div class="container-fluid" >
                <form class="navbar-form navbar-left" role="search">
                    <div class="form-group">
                        <input type="text" class="form-control" id="seh" placeholder="习近平">
                    </div>
                    <button type="button" class="btn btn-default" onclick="search1()">搜索</button>
                </form>
            </div>
        </nav>
    </div>
</div>

<nav class="navbar navbar-default " role="navigation">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="#" >生活娱乐</a>
        </div>
        <div>
            <ul class="nav navbar-nav">
                <li class="active"><a href="#"><font size="4">首页</font></a></li>
                <c:forEach items="${kindList}" var="kind" end="11">
                    <li class="selectKind"><a target="_blank"  style="text-decoration: none;" href="Navigation/kindTid?navword=${kind.newsTid}"><font size="4">${kind.newsKind}</font> </a></li>
                </c:forEach>
            </ul>
        </div>
    </div>
</nav>
<div style="width:85%;height: auto;margin:auto;height:900px;">
    <div style="width: 73%;display: inline;float: left;">
        <div style="width: 100%;height: auto">
            <div class="container" style="width: 100%;height: 20px;text-align: center">
                <p style="width:100%;">
                    <span class="glyphicon glyphicon-time" ></span>
                    <font size="4" id="TodayTime"></font>
                </p>
            </div>
            <div style="width: 100%;height: 40px;">
                <c:forEach items="${list}" var="l" end="0">
                      <a href="Article/article?newsNid=${l.newsNid}" style="text-decoration:none;" target="_blank" >
                          <font size="4" style="margin-top: 4px"><strong >${l.newsTitle} </strong></font>
                      </a>
                </c:forEach>
            </div>
            <div style="width: 100%;height: 40px">
                <ul style="margin-left: 14px;padding:0;line-height: 20px">
                    <c:forEach items="${list}" var="l" begin="1" end="2">
                        <a href="Article/article?newsNid=${l.newsNid}" style="text-decoration:none;" target="_blank" >
                            <li ><font size="3" >${l.newsTitle}</font></li>
                        </a>
                    </c:forEach>
                </ul>
            </div>
        </div>
        <div style="width: 100%;border-top:1px #adadad solid ;padding: 15px">
            <c:forEach items="${topList}" var="top" varStatus="tl" >
                <c:if test="${tl.index<4}">
                    <div  class="title1" style="margin-top: 10px;">
                        <a  style="width: 100%;height:150px " target="_blank"  href="Article/article?newsNid=${top.newsNid}">
                            <div style="width: 100%;height:170px "  >
                                <div style="width: 35%;height:170px;display: inline;float: left;border:1px  #dbdbdb solid " >
                                    <img src="static/newsPhoto/${top.newsPicture}" style="width: 100%;height: 100%" onerror="this.src='static/photo/NewsError.jpg'">
                                </div>
                                <div style="width: 60%;height:170px;display: inline;float: left;margin-left: 9px" >
                                    <font  size="4" color="black">${top.newsTitle}</font>
                                </div>
                            </div>
                        </a>
                    </div>
                </c:if>
                <c:if test="${tl.index>=4}">
                    <c:if test="${tl.index==4}">
                        <div style="width: 100%;margin-top:20px;height: 30px" id="viewMore" >
                            <button style="width: 100%;background-color: #FBFBFB;" onclick="display()"><font size="3">查看更多新闻</font></button>
                        </div>
                    </c:if>
                    <div  class="title1" style="display:none;margin-top: 10px;" id=${tl.index}  >
                        <a  style="width: 100%;height:150px " target="_blank"  href="Article/article?newsNid=${top.newsNid}">
                            <div style="width: 100%;height:170px "  >
                                <div style="width: 35%;height:170px;display: inline;float: left;border:1px  #dbdbdb solid " >
                                    <img src="static/newsPhoto/1.jpg" style="width: 100%;height: 100%" onerror="this.src='static/photo/NewsError.jpg'">
                                </div>
                                <div style="width: 60%;height:170px;display: inline;float: left;margin-left: 9px" >
                                    <font  size="4" color="black">${top.newsTitle}</font>
                                </div>
                            </div>
                        </a>
                    </div>
                </c:if>
            </c:forEach>
        </div>

        <jsp:include page="News_login.jsp"></jsp:include>



        <div style="width: 100%;margin-top: 5px;height: 52px;background-color:#FBFBFB;border-top: 1px solid black;border-bottom: 1px solid black">
            <ul class="nav navbar-nav">
                <c:forEach items="${kindList}" var="kind" begin="12">
                   <li ><a  target="_blank"  style="text-decoration: none"  onmouseover="visitHover(${kind.newsTid})" href="Navigation/kindTid?navword=${kind.newsTid}" ><font size="4">${kind.newsKind}</font> </a></li>
                </c:forEach>
            </ul>
        </div>
        <div id="index_copy" class="index_copy">
            <jsp:include page="index_copy.jsp"></jsp:include>
        </div>
    </div>



    <div style="width: 2%;height:auto;display: inline;float: left;border: 1px white solid"></div>



    <div style="width: 25%;height:auto;display: inline;float: left">
        <div style="width: 100%;margin: auto;background: #FBFBFB;height: 310px;padding: 15px">
            <div style="width: 100%;height: auto;"><font size="3"><strong>心系房价</strong></font></div>
            <c:forEach items="${bottomList1}" var="list1" end="0" varStatus="rl">
                <a  target="_blank" href="Article/article?newsNid=${right.newsNid}">
                    <div style="width: 100%;height: 80px;margin-top: 10px">
                        <div style="width: 49%;display: inline;float: left;" ><img  src="static/newsPhoto/${list1.newsPicture}" style="height: 100%;width: 100%" onerror="this.src='static/photo/NewsError.jpg'"></div>
                        <div style="width: 49%;display: inline;float: left;margin-left: 5px" ><font size="2" >${list1.newsTitle}</font></div>
                    </div>
                </a>
            </c:forEach>
            <div style="width: 100%;height: auto;margin-top: 10px">
                <ul style="margin-left:15px; padding:0;line-height: 27px ">
                    <c:forEach items="${bottomList1}" var="list1" begin="1" end="3" >
                        <li > <a href="Article/article?newsNid=${list1.newsNid}" target="_blank"><font  size="3">${list1.newsTitle}</font></a></li>
                    </c:forEach>
                </ul>
            </div>
        </div>
        <div style="text-align:left;width: 100%;margin-top:15px ;background: #FBFBFB;height: 310px;padding: 15px">
            <div style="width: 100%;height: auto"><font size="3"><strong>娱乐新天地</strong></font></div>
            <c:forEach items="${bottomList2}" var="list2" end="0" varStatus="rl">
                <a  target="_blank" href="Article/article?newsNid=${list2.newsNid}">
                    <div style="width: 100%;height: 80px;margin-top: 10px">
                        <div style="width: 49%;display: inline;float: left;" ><img  src="static/newsPhoto/${list2.newsPicture}" style="height: 100%;width: 100%" onerror="this.src='static/photo/NewsError.jpg'"></div>
                        <div style="width: 49%;display: inline;float: left;margin-left: 5px" ><font size="2" >${list2.newsTitle}</font></div>
                    </div>
                </a>
            </c:forEach>
            <div style="width: 100%;height: auto;margin-top: 10px">
                <ul style="margin-left:15px; padding:0;line-height: 27px ">
                    <c:forEach items="${bottomList2}" var="list2" begin="1" end="3" >
                        <li > <a href="Article/article?newsNid=${list2.newsNid}" target="_blank"><font  size="3">${list2.newsTitle}</font></a></li>
                    </c:forEach>
                </ul>
            </div>
        </div>
        <div style="text-align:left;width: 100%;margin-top:15px ;background: #FBFBFB;height: 310px;padding: 15px">
            <div style="width: 100%;height: auto"><font size="3"><strong>互联网改革</strong></font></div>
            <c:forEach items="${bottomList3}" var="list3" end="0" varStatus="rl">
                <a  target="_blank" href="Article/article?newsNid=${list3.newsNid}">
                    <div style="width: 100%;height: 80px;margin-top: 10px">
                        <div style="width: 49%;display: inline;float: left;" ><img  src="static/newsPhoto/${list3.newsPicture}" style="height: 100%;width: 100%" onerror="this.src='static/photo/NewsError.jpg'"></div>
                        <div style="width: 49%;display: inline;float: left;margin-left: 5px" ><font size="2" >${list3.newsTitle}</font></div>
                    </div>
                </a>
            </c:forEach>
            <div style="width: 100%;height: auto;margin-top: 10px">
                <ul style="margin-left:15px; padding:0;line-height: 27px ">
                    <c:forEach items="${bottomList3}" var="list3" begin="1" end="3" >
                        <li > <a href="Article/article?newsNid=${list3.newsNid}" target="_blank"><font id="rig0" size="3">${list3.newsTitle}</font></a></li>
                    </c:forEach>
                </ul>
            </div>
        </div>
    </div>
</div>
<div style="width:85%;margin: auto;height: 150px;text-align-all: center;overflow: hidden"; >
    <div style="margin-top:15px;background:#FBFBFB;">
        <div style="text-align: center;margin: auto;">
            <div ><font size="4">合作伙伴</font></div>
        </div>
        <div style="text-align: center;margin: auto;"><a href="#"><font size="3">新浪新闻</font></a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;<a href="#"><font size="3">腾讯新闻</font></a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;<a href="#"><font size="3">中国政府网</font></a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;<a href="#"><font size="3">搜狐网</font></a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;<a href="#"><font size="3">微博官方</font></a> </div>
        <div style="text-align: center"><font size="2">Copyright 2018 OnlineNews. All Rights Reserved</font></div>
        <div style="text-align: center"><font size="2">娱乐公司 版权所有</font></div>
    </div>
</div>

<script>
    $(function () {
        getTime();
    })
    function getTime() {
        var date=new  Date();
        var year=date.getFullYear();
        var month=date.getMonth()+1;
        var week=date.getDay();
        var day=date.getDate();
        var week1=['星期日','星期一','星期二','星期三','星期四','星期五','星期六'];
        document.getElementById('TodayTime').innerHTML=" "+year+"年"+month+"月"+day+"日  "+week1[week];
    }//获取当前时间
    function display(){
        var view=document.getElementById("viewMore");
        view.style.display="none";
        for(var i=4;i<=6;i++){
            var tit=document.getElementById(i);
            tit.style.display='block';
        }
    }//查看更多
    function search1(){
       var sch=document.getElementById('seh').value;
        if(sch==''){
            sch= document.getElementById('seh').getAttribute('placeholder');
        }
        window.open('/LifeWeb/Search/search?searchword='+sch)
    } //搜索栏

    function visitHover(v) {
       $.ajax({
            type: "post",
            url: "bottomNews",
            data: {newsTid:v},
            dataType:"html",
            success: function(result){
                $('#index_copy').html(result);
            }
        });
    } //下部导航栏
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

    function  displaySearch() {
        $.ajax({
            type: "post",
            url: "Search",
            data: null,
            dataType: "json",
            contentType: "application/json;charset=UTF-8",
            success: function (result) {
                $("#search").attr("placeholder",result.extend["search"]);
            }
        });
    }
    function check() {
        var hide=document.getElementById("hideTop");
        hide.style.display="none";
        var news1=document.getElementById("hideNews1");
        news1.style.display="block";
        var news2=document.getElementById("hideNews2");
        news2.style.display="block";

    }
   /* function showUserDetail() {
        show();
    }
    function noshowUserDetail() {
        hide();
    }*/
   /* function show() {
        var X = $('#userDetail').offset().top;
        var Y = $('#userDetail').offset().left;
        $("#userDetail").css("display","block");
        $("#userDetail").css("right","68px");
        $("#userDetail").css("top", 7);
    }
    // 隐藏div 
    function hide() {
        $("#userDetail").css("display", "none");
    }*/

</script>
</body>
</html>
