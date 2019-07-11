<%--
  Created by IntelliJ IDEA.
  User: ThinkPad
  Date: 2018/12/18
  Time: 20:41
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="h" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body  >
  <c:forEach items="${commentList}" var="com" >
    <div style="width: 98%;overflow: auto;border-bottom: 1px #adadad solid;margin-top: 30px;margin-left:15px;min-height: 100px"  >
        <div style="width: 15%;height: auto;display: inline;float: left;">
            <img style="width: 70%;height: 60px;" src="../static/userphoto/${com.user.userPhoto}" onerror="this.src='../static/photo/default_photo.jpg'"  class="img-circle">
        </div>
        <div style="width: 85%;height: auto;display: inline;float: left;">
            <div>
                <font style="size: B4;color: #2e6da4">${com.user.userName}</font>
                <font style="size: B4;color: #adadad;margin-left:10px"><fmt:formatDate value="${com.commentTime}" type="both" dateStyle="short" timeStyle="short"></fmt:formatDate>  </font>
            </div>
            <div style="margin-top:5px;width: 100%;height: auto">${com.commentContent}</div>
            <c:forEach items="${replyTestList}" var="rep">
                <c:if test="${rep.commentId==com.commentId}">
                    <div style="margin-top:9px;width: 100%;background:#F5F5F5;padding: 10px;">
                        <div style="width: 100% ;margin-left: 7px;">
                            <div style="width: 100%">
                                <strong>${rep.replyname}
                                    <c:if test="${rep.commentuser!=''}">回复 ${rep.commentuser}</c:if>
                                    <c:if test="${rep.commentuser==''}"></c:if>
                                    ：</strong>${rep.replyContent}
                            </div>
                            <div style="margin-top: 10px;height: 20px">
                                <div style="display: inline;float: left;cursor:pointer;color: black;font-size: 15px " onclick="actReply(${rep.replyId})" id="apr1${rep.replyId}">赞</div>
                                <div style="display: inline;float: left;margin-left: 3px; " id="apr2${rep.replyId}">${rep.replyApprove}</div>
                                <div style="display: inline;float: left;margin-left: 10px;" onclick="replyReply(${rep.replyId})" class="point" id="rr${rep.replyId}">回复</div>
                                <font style="size: B4;color: #adadad;margin-left:10px;display: inline;float: left">
                                    <fmt:formatDate value="${rep.replyTime}" type="both" dateStyle="short" timeStyle="short"></fmt:formatDate>
                                </font>
                            </div>
                            <div style="width: 100% ;height: 130px;display: none;" id="r${rep.replyId}">
                                <form action="/LifeWeb/Reply/user_Reply" onsubmit="return repReply(${rep.replyId})">
                                    <input type="hidden" name="commentId" value="${rep.commentId}">
                                    <input type="hidden" name="replyuserId" value="${user.userId}">
                                    <input type="hidden" name="newsNid" value="${rep.newsNid}">
                                    <input type="hidden" name="commentuserId" value="${rep.replyuserId}">
                                    <div style="width: 90%;height: 130px;display: inline;float: left;">
                                        <textarea class="form-control" rows="5.3" name="replyContent" placeholder="回复  ${rep.replyname}:"></textarea>
                                    </div>
                                    <div style="width: 10%;height: 130px;display: inline;float: left;">
                                        <input type="submit" class="btn btn-primary btn-lg" style="width: 100%;height: 115px" value="确定">
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </c:if>
            </c:forEach>
            <div style="margin-top: 10px">
                <div style="display: inline;float: left;cursor:pointer;color: black;font-size: 15px " onclick="actApprove(${com.commentId})" id="ap1${com.commentId}">赞</div>
                <div style="display: inline;float: left;margin-left: 7px; " id="ap2${com.commentId}">${com.commentApprove}</div>
                <div style="display: inline;float: left;margin-left: 12px;" onclick="replyComment(${com.commentId})" class="point" id="rc${com.commentId}">回复</div>
            </div>
            <div style="display: none;" id="c${com.commentId}">
                <form action="/LifeWeb/Reply/user_Reply" onsubmit="return repComment(${com.commentId})">
                    <input type="hidden" name="commentId" value="${com.commentId}">
                    <input type="hidden" name="replyuserId" value="${user.userId}">
                    <input type="hidden" name="newsNid" value="${com.newsNid}">
                    <input type="hidden" name="commentuserId" value="0">
                    <div style="width: 70%;height: 130px;display: inline;float: left;">
                        <textarea class="form-control" rows="5.3" name="replyContent" placeholder="回复  ${com.user.userName}:"></textarea>
                    </div>
                    <div style="width: 10%;height: 130px;display: inline;float: left;">
                        <input type="submit" class="btn btn-primary btn-lg" style="width: 100%;height: 115px" value="确定">
                    </div>
                </form>
            </div>
        </div>
    </div>
</c:forEach>
<script>


    function replyComment(rid) {
        if(${user.userId==null}){
            alert("请先登录")
            return ;
        }
        var d="rc"+rid;
        document.getElementById(d).innerHTML="取消";
        array1.push(d);
        var rid="c"+rid;
        array.push(rid);
        if(array[1]!=null){
            if(array[0]==array[1]){
                document.getElementById(d).innerHTML="回复";
                var comm=document.getElementById(array[0]);
                if(comm.style.display=="block")
                    comm.style.display="none";
                array1.length=0;
                array.length=0;
                return ;
            }
            var comm=document.getElementById(array[0]);
            if(comm.style.display=="block")
                comm.style.display="none";
            document.getElementById(array1[0]).innerHTML="回复";
            array1.shift();
            array.shift();
        }
        var comm=document.getElementById(array[0]);
        comm.style.display="block";
    }
    function repComment(rid) {

        var rid="c"+rid;
        var comm=document.getElementById(rid);
        comm.style.display="none";
        return true;
    }
    function replyReply(rid) {
        if(${user.userId==null}){
            alert("请先登录")
            return ;
        }
        var d="rr"+rid;
        document.getElementById(d).innerHTML="取消";
        array1.push(d);
        var rid="r"+rid;
        array.push(rid);
        if(array[1]!=null){
            if(array[0]==array[1]){
                document.getElementById(d).innerHTML="回复";
                var comm=document.getElementById(array[0]);
                if(comm.style.display=="block")
                    comm.style.display="none";
                array1.length=0;
                array.length=0;
                return ;
            }
            var comm=document.getElementById(array[0]);
            if(comm.style.display=="block")
                comm.style.display="none";
            document.getElementById(array1[0]).innerHTML="回复";
            array1.shift();
            array.shift();
        }
        var comm=document.getElementById(array[0]);
        comm.style.display="block";
    }
    function repReply(rid) {
        var rid="r"+rid;
        var comm=document.getElementById(rid);
        comm.style.display="none";
        return true;
    }



</script>
</body>
</html>
