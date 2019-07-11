<%--
  Created by IntelliJ IDEA.
  User: ThinkPad
  Date: 2018/12/20
  Time: 21:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="h" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>头部导航</title>
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

</style>
<body>
    <nav class="navbar navbar-default " role="navigation">
    <div class="container-fluid" style="width: 100%">
        <div class="navbar-header" style="width: 12%">
            <a class="navbar-brand" href="#"><font size="5" color="red">生活娱乐网</font></a>
        </div>
        <div>
            <ul class="nav navbar-nav" style="width: 88%">
                <c:forEach items="${kindList}" var="kind" end="6">
                    <c:if test="${kind.newsTid==newsTid}">
                        <li  class="active" style="float:left"><a href="/LifeWeb/Navigation/kindTid?navword=${kind.newsTid}" target="_blank"><font size="4">${kind.newsKind}</font></a></li>
                    </c:if>
                    <c:if test="${kind.newsTid!=newsTid}">
                        <li   style="float:left"><a href="/LifeWeb/Navigation/kindTid?navword=${kind.newsTid}" target="_blank"><font size="4">${kind.newsKind}</font></a></li>
                    </c:if>
                </c:forEach>

                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" rel="drevil">
                        <font size="4">更多+</font>
                    </a>
                    <ul class="dropdown-menu" id="disp">
                        <li style="align-content: center">
                            <table style="text-align:center;width: 400px;height: 200px;padding: 20px;margin: auto;">
                                <tr >
                                    <c:forEach items="${kindList}" var="kind" begin="7" end="10">
                                        <td onmouseover="this.style.backgroundColor ='#0080FF'" onmouseleave="this.style.backgroundColor='#FFFFFF'" ><a href="/LifeWeb/Navigation/kindTid?navword=${kind.newsTid} " style="text-decoration: none" target="_blank"><font size="4">${kind.newsKind}</font></a></td>
                                    </c:forEach>
                                </tr>
                                <tr>
                                    <c:forEach items="${kindList}" var="kind" begin="11" end="14">
                                        <td onmouseover="this.style.backgroundColor ='#0080FF'" onmouseleave="this.style.backgroundColor='#FFFFFF'"><a href="/LifeWeb/Navigation/kindTid?navword=${kind.newsTid} " style="text-decoration: none" target="_blank"><font size="4">${kind.newsKind}</font></a></td>
                                    </c:forEach>
                                </tr>
                                <tr>
                                    <c:forEach items="${kindList}" var="kind" begin="14">
                                        <td onmouseover="this.style.backgroundColor ='#0080FF'" onmouseleave="this.style.backgroundColor='#FFFFFF'"><a href="/LifeWeb/Navigation/kindTid?navword=${kind.newsTid} " style="text-decoration: none" target="_blank"><font size="4">${kind.newsKind}</font></a></td>
                                    </c:forEach>
                                </tr>
                            </table>
                        </li>
                    </ul>
                </li>
                <li style="margin-left: 150px">

                    <div class="container-fluid" >
                        <form class="navbar-form navbar-left" role="search">
                            <div class="form-group">
                                <input type="text" class="form-control" placeholder="习近平" id="seh">
                            </div>
                            <button type="button" class="btn btn-default" onclick="search()" >搜索</button>
                        </form>
                    </div>

                </li>
                <li style="">
                    <c:if test="${user.userId==null}">
                        <button type="button" class="btn btn-primary" style="margin-top: 9px"   id="btn_showlogin">一键登录</button>
                        <input type="hidden" id="btn_showlogin1">
                    </c:if>
                    <c:if test="${user.userId!=null}">
                        <div style="width: 130px;height: 50px;" >
                           <a href="../User/userUpdate" target="_blank">
                            <div style="width: 50px;height: 50px;text-align: center;float: left;display: inline">
                                <img src="../static/userphoto/${user.userPhoto}" style="width: 50px;height: 50px;" class="img-rounded" onerror="this.src='../static/photo/userError.jpg'">
                            </div>
                           </a>
                            <div style="width: 70px;height: 50px;display: inline;float: left;">
                                <div title="${user.userName}" style="width: 75px;height: 25px;margin-left: 3px;text-align: center;font-size: 15px;overflow: hidden;text-overflow: ellipsis; white-space: nowrap; cursor: pointer;">
                                        ${user.userName}
                                </div>
                                <div style="width: 75px;height: 25px;float:left;display: inline;text-align: center;font-size: 15px;cursor: pointer" onclick="cancel()">
                                   注销
                                </div>
                            </div>
                        </div>
                    </c:if>
                </li>
            </ul>
        </div>
    </div>
</nav>

</body>
</html>
