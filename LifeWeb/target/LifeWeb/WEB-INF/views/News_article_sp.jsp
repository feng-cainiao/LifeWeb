<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="h" uri="http://www.springframework.org/tags/form" %>

<%--
  Created by IntelliJ IDEA.
  User: ThinkPad
  Date: 2018/10/18
  Time: 10:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新闻详情</title>
    <script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>

<style type="text/css">

</style>
<body>
<div style="width: 100%;height: auto; " >
   <jsp:include page="navigation.jsp"></jsp:include>
</div>
<jsp:include page="News_login.jsp"></jsp:include>
<div style="width: 90%;margin:auto;overflow: hidden">
    <div style="width: 76%;display: inline;float: left;height: auto;">
        <div style="width: 100%;margin:auto;height: 70px;">
            <p ><font size="6" color="black" >${news.newsTitle}</font> </p>
        </div>
        <div style="width: 100%;margin:auto;height: auto;">
            <div style="width: 18%;height:auto;display: inline;float: left;border-right: 1px #adadad solid;">
                <div style="width: 100%;height: 170px;">

                    <ul style="list-style-type: none;line-height:inherit;width: 100%;padding: 0px">
                        <li style="width: 100%;text-align: center;margin-outside: 10px"><font size="3" id="year"  ></font></li>
                        <li style="width: 100%;text-align: center"><font size="5" id="monday" color="black" ></font></li>
                        <li style="width: 100%;text-align: center" ><font size="3" id="dataline" ></font></li>
                        <li style="width: 100%;text-align: center;margin-top: 50px"><a  href="/company?company=${news.company.companyId}">${news.company.companyName}</a> </li>
                    </ul>
                </div>

                <div style="width: 100%;height: 170px;">
                    <ul style="list-style-type: none;line-height:inherit;width: 100%;padding: 0px;margin-top: 100px">
                        <li style="width: 100%;text-align: center;margin-outside: 10px"><font size="3">--分享--</font></li>
                        <li style="width: 100%;text-align: center;"><a href="#" style="height: 100%;"><img src="../static/photo/qq.png"  onmouseover="this.src='../static/photo/qq_visit.png'" onmouseout="this.src='../static/photo/qq.png'"></a></li>
                        <li style="width: 100%;text-align: center" ><a href="#" style="height: 100%;"><img  src="../static/photo/space.png" onmouseover="this.src='../static/photo/space_visit.png'" onmouseout="this.src='../static/photo/space.png'"></a></li>
                        <li style="width: 100%;text-align: center;"><a href="#" style="height: 100%;"><img src="../static/photo/wechat.png" onmouseover="this.src='../static/photo/wechat_visit.png'" onmouseout="this.src='../static/photo/wechat.png'"></a></li>
                        <li style="width: 100%;text-align: center;"><a href="#" style="height: 100%;"><img src="../static/photo/friend.png" onmouseover="this.src='../static/photo/friend_visit.png'" onmouseout="this.src='../static/photo/friend.png'"></a></li>
                    </ul>
                </div>
                <div style="width: 100%;padding: 10px;height: auto;margin-top: 200px;text-align: center;position:relative;">
                    <p >--评论--</p>
                    <img src="../static/photo/comment.png" style="width:70%;height:100px;margin-top: 10px" class="img-rounded">
                    <span style="position:absolute; right:85px; top:65px;"><font size="6" color="red">${news.newsComment}</font></span>
                </div>
            </div>
            <div style="width: 82%;height:auto;display: inline;float: left;">
                <div style="width: 98%;height:auto;margin-left: 15px;">
                    <font size="3" color="black" id="content">${news.newsContent}</font>
                </div>
                <div style="width: 98%;height:200px;margin-left: 15px;margin-top: 40px;text-align: center">
                    <div>The  End</div>
                    <div style="margin-top: 20px">新闻立场只是媒体所发出的  不代表生活娱乐网的观点</div>
                    <div style="margin-top: 40px" onclick="actNews()" class="divclass">
                        <img src="../static/photo/approve.png" style="width:13%;height:60px;margin-top: 10px" class="img-rounded">
                        <p id="newsApprove"> ${news.newsApprove}</p>
                    </div>
                    <div>
                        <c:if test="${user.userId!=null}">
                            <a style="cursor: pointer" onclick="collection()" href="#">收藏</a>
                        </c:if>
                    </div>
                </div>
                <hr  style="width: 98%;color: #adadad;margin-left: 15px">


                <div style="width: 98%;margin-top: 40px;height: 200px;margin-left:15px;">
                    <div style="width:100%;height: 50px;margin:auto">
                        <div style="width: 85%;height: 100%;display: inline;float: left;"><font size="5">网友评论</font><font style="margin-left: 5px;color: #adadad;size: B4">请自觉遵守法律文明发言</font></div>
                        <div style="width: 15%;height: 100%;display: inline;float: left;text-align: right"> ${news.newsComment}条评论</div>
                    </div>
                    <div style="width:100%;height: 120px;margin:auto">
                        <div style="width: 15%;height: 50%;display: inline;float: left;">
                            <img style="width: 70%;height: 60px;" src="../static/userphoto/${user.userPhoto}" onerror="this.src='../static/photo/default_photo.jpg'"  class="img-circle">
                        </div>
                        <form action="/LifeWeb/Comment/user_comment"  method="post" onclick="return confirm()">
                            <input type="hidden"  value="${news.newsNid}" name="newsNid">
                            <div style="width: 70%;height: 100%;display: inline;float: left;">
                                <textarea class="form-control" rows="5.3" name="commentContent" id="commentContent"></textarea>
                            </div>
                            <div style="width: 15%;height: 94%;display: inline;float: left;">
                                <c:if test="${user.userId==null}">
                                    <button type="button" class="btn btn-primary btn-lg" style="width: 100%;height: 100%"   >未登录</button>
                                </c:if>
                                <c:if test="${user.userId!=null}">
                                    <input type="hidden"  value="${user.userId}" name="userId">
                                    <input type="submit" class="btn btn-primary btn-lg" style="width: 100%;height: 100%" value="发表">
                                </c:if>
                            </div>
                        </form>
                    </div>
                </div>
                <div style="width:98%;height:40px;margin-top:10px;margin-left:15px;">
                    <div style="width: 85%;height: 100%;display: inline;float: left;">
                        <c:if test="${user.userId==null}">
                            <font size="5">全部评论</font>
                        </c:if>
                        <c:if test="${user.userId!=null}">
                            <div style="display: inline;float: left;font-size: 18px;font-weight:bold;cursor: pointer;" onclick="allcomment(1)" id="allcomment1">全部评论</div>
                            <div style="display: inline;float: left;font-size: 16px">&nbsp;/&nbsp;</div>
                            <div style="display: inline;float: left;font-size: 16px;cursor: pointer;" onclick="allcomment(0)" id="allcomment0">我的评论</div>
                        </c:if>
                    </div>
                    <div style="width: 15%;height: 100%;display: inline;float: left;text-align: right">
                        <div   style="display: inline;float: right;font-size: 16px;cursor: pointer;" onclick="orderCom(1)" id="order1">最新</div>
                        <div style="display: inline;float: right;font-size: 16px" >&nbsp;/&nbsp; </div>
                        <div style="display: inline;float: right;font-size: 18px;font-weight:bold;cursor: pointer;" onclick="orderCom(2)" id="order2">最热</div>
                    </div>
                </div>
                <div id="comment">
                    <jsp:include page="commentpage.jsp"></jsp:include>
                </div>
            </div>
        </div>
    </div>
    <div style="width: 2%;display: inline;float: left;height: auto;border:1px white solid"></div>
    <div style="width: 22%;display: inline;float: left;height:auto;margin-top: 40px"></div>
</div>
<div style="width:100%;margin:auto;height: 100px;text-align-all: center; position: absolute;margin-top: 20px"  >
    <div style="text-align: center;margin: auto;"><a href="#">新浪网</a>|<a href="#">腾讯网</a>|<a href="#">搜狐网</a>|<a href="#">网易网</a>|<a href="#">今日头条</a> </div>
    <div style="text-align: center">Copyright © 2018 OnlineNews. All Rights Reserved</div>
    <div style="text-align: center">娱乐公司 版权所有</div>
</div>
<script>
    $("html,body").on("click",".divclass",function(e){
        anp(e);
    })
    function anp(e) {
        var $i = $("<b>").text("+" + 1);
        var x = e.pageX,
            y = e.pageY;
        $i.css({
            top: y - 20,
            left: x,
            position: "absolute",
            color: "#E94F06"
        });
        $("body").append($i);
        $i.animate({
            top: y - 120,
            opacity: 0,
            "font-size": "1.4em"
        }, 1500, function() {
            $i.remove();
        });
        e.stopPropagation();
    }
    $(function () {
        getTime();
        var com = document.getElementById("comment");
        Subt(com);
    });
    function Subt(obj){
        var s = obj.innerHTML;
        var p = document.createElement("span");
        var n = document.createElement("a");
        p.innerHTML = s.substring(0,9500);
        n.innerHTML = s.length >9500 ? "<div style='margin-top:10px;width: 100%;height:20px;text-align: center'><font  size='4' id='more'>查看更多</font></div>" : "";
        n.href = "###";
        n.onclick = function(){
            var mor=$('#more').html();
            if (mor == "查看更多"){
                n.innerHTML = "<div style='margin-top:10px;width: 100%;height:20px;text-align: center'><font  size='3' id='more'>收起</font></div>" ;
                p.innerHTML = s;
            }else{
                n.innerHTML = "<div style='margin-top:10px;width: 100%;height:20px;text-align: center'><font  size='3' id='more'>查看更多</font></div>";
                p.innerHTML = s.substring(0,9500);
            }
        }
        obj.innerHTML = "";
        obj.appendChild(p);
        obj.appendChild(n);
    }

    function getTime() {
        var time="${news.newsTime}";
        var d = new Date(time);
        $("#year").append('--'+d.getFullYear()+'--');
        $("#monday").append(inserZero(d.getMonth() + 1)+"/"+inserZero(d.getDate()));
        $("#dataline").append(inserZero(d.getHours())+"/"+inserZero(d.getMinutes()));
    }
    function inserZero(obj)
    {
        if (obj < 10) return "0" + "" + obj;
        else return obj;
    }
    var array=new Array();
    var array1=new Array();

    function search(){
        var sch=document.getElementById('seh').value;
        if(sch==''){
            sch= document.getElementById('seh').getAttribute('placeholder');
        }
        window.open('/LifeWeb/Search/search?searchword='+sch);
    }
   /* function login() {
        window.location.href='/LifeWeb/Admin/login_search';
    }*/
    var comflag=1;
    var orde=2;
    var nid=''+${newsNid};
    var userid='';
    function orderCom(flag) {
        if(flag==1){
            var cs=document.getElementById("order1");
            cs.style.fontSize='18px';
            cs.style.fontWeight='bold';

            var cs=document.getElementById("order2");
            cs.style.fontSize='16px';
            cs.style.fontWeight='normal';
            orde=1;
           // window.location.href='comment_time?newsNid='+id+"&ord="+2;
        }else{
            var cs=document.getElementById("order1");
            cs.style.fontSize='16px';
            cs.style.fontWeight='normal';

            var cs=document.getElementById("order2");
            cs.style.fontSize='18px';
            cs.style.fontWeight='bold';
            orde=2;
        }
        $.ajax({
            type:"post",
            url: "comment_time",
            data:{newsNid:nid,ord:orde,commentflag:comflag},
            dataType:"html",
            success: function(result){
                $('#comment').html(result);

            }
        });
    }
    function allcomment(flag) {
        if(flag==1){
            var cs=document.getElementById("allcomment1");
            cs.style.fontSize='18px';
            cs.style.fontWeight='bold';
            var cs=document.getElementById("allcomment0");
            cs.style.fontSize='16px';
            cs.style.fontWeight='normal';
            comflag=1;
        }else{
            var cs=document.getElementById("allcomment1");
            cs.style.fontSize='16px';
            cs.style.fontWeight='normal';
            var cs=document.getElementById("allcomment0");
            cs.style.fontSize='18px';
            cs.style.fontWeight='bold';
            comflag=0;
        }
        ord=1;
        $.ajax({
            type:"post",
            url: "comment_time",
            data:{newsNid:nid,ord:orde,commentflag:comflag},
            dataType:"html",
            success: function(result){
                $('#comment').html(result);

            }
        });

    }
    var listcomment=new Array();
    var listreply=new Array();
    function actApprove(rid) {
        var useId=${user.userId}+"";
        if(useId==""){
            alert("请登录");
            return ;
        }
        var apc1="ap1"+rid;
        var rid1=document.getElementById(apc1);
        if(rid1.style.color=='black'){
            listcomment.push(rid);
            rid1.style.fontSize='18px';
            rid1.style.color='blue'
            var apc2="ap2"+rid;
            var rid1=document.getElementById(apc2);
            var num=rid1.innerHTML;
            document.getElementById(apc2).innerHTML= ++num;
        }else{

            listcomment.remove(rid);
            rid1.style.fontSize='15px';
            rid1.style.color='black'
            var apc2="ap2"+rid;
            var rid1=document.getElementById(apc2);
            var num=rid1.innerHTML;
            document.getElementById(apc2).innerHTML= --num;
        }
    }
    function actReply(rid) {
        var useId=${user.userId}+"";
        if(useId==""){
            alert("请登录");
            return ;
        }
        var apc1 = "apr1" + rid;
        var rid1 = document.getElementById(apc1);
        if (rid1.style.color == 'black') {
            listreply.push(rid);
            rid1.style.fontSize = '18px';
            rid1.style.color = 'blue'
            var apc2 = "apr2" + rid;
            var rid1 = document.getElementById(apc2);
            var num = rid1.innerHTML;
            document.getElementById(apc2).innerHTML = ++num;
        } else {
            listreply.remove(rid);
            rid1.style.fontSize = '15px';
            rid1.style.color = 'black'
            var apc2 = "apr2" + rid;
            var rid1 = document.getElementById(apc2);
            var num = rid1.innerHTML;
            document.getElementById(apc2).innerHTML = --num;
        }
    }
    Array.prototype.indexOf = function(val) {
        for (var i = 0; i < this.length; i++) {
            if (this[i] == val) return i;
        }
        return -1;
    };
    Array.prototype.remove = function(val) {
        var index = this.indexOf(val);
        if (index > -1) {
            this.splice(index, 1);
        }
    };
    window.onbeforeunload=function (){
        if(listcomment.length!=0){
            $.ajax({
                type:"post",
                url: "comment_approve",
                data:{ltcomment:JSON.stringify(listcomment),newsNid:nid,ord:orde,commentflag:comflag},
                dataType:"html",
                success: function(result){
                    $('#comment').html(result);

                }
            });
            listcomment.length=0;
        }
        if(listreply.length!=0){
            $.ajax({
                type:"post",
                url: "reply_approve",
                data:{rycomment:JSON.stringify(listreply),newsNid:nid,ord:orde,commentflag:comflag},
                dataType:"html",
                success: function(result){
                    $('#comment').html(result);

                }
            });
            listreply.length=0;
        }
        if(map['newsApprove']!=null){
            $.ajax({
                type:"post",
                url: "news_approve",
                data:{newsNid:nid},
                dataType:"text/json",
                success: function(result){
                }
            });
            map['newsApprove']=null;
        }

    }
    var map={};
    map['newsApprove']=null;
    function actNews() {
        var useId=${user.userId}+"";
        if(useId==""){
            alert("请登录");
            return ;
        }
        if(map['newsApprove']==null){
            var approve= ++document.getElementById("newsApprove").innerText;
            document.getElementById("newsApprove").innerHTML=approve;
            map['newsApprove']=approve;
        }else{

        }
    }
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
    function collection(){
        var collection={
            "newsTitle":"${news.newsTitle}",
            "newsNid":${news.newsNid},
            "userId":${user.userId}+"",
        };
        $.ajax({
            type: "post",
            url: "/LifeWeb/Collection/collection",
            data: JSON.stringify(collection),
            dataType: "json",
            contentType: "application/json;charset=UTF-8",
            success: function (result) {
                if(result==100){
                    alert("收藏成功")
                }else{
                    alert("收藏失败");
                }
            }
        });
    }
     function confirm(){

     }
</script>



</body>
</html>
