<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Cache-Control" content="no-cache">
<meta http-equiv="Expires" content="0">
<%--
  Created by IntelliJ IDEA.
  User: ThinkPad
  Date: 2018/12/11
  Time: 19:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>搜索数据</title>

</head>
<style type="text/css">
</style>
<body>
<div style="width: 100%;height: auto; " >
        <jsp:include page="navigation.jsp"></jsp:include>
       <jsp:include page="News_login.jsp"></jsp:include>
</div>

<div style="width: 85%;height: 120px;margin:auto" >
    <img src="../static/photo/ad.png" style="width: 100%">
</div>
<div style="width:85%;height: auto;margin:auto;margin-top: 20px;text-align: center">
    <c:if test="${newsList==null}">
        </br>
        <div style="font-size: 19px">没有搜到有关新闻</div>
    </c:if>
    <div style="width: 85%;height:auto;margin: auto;">
        <c:forEach items="${newsList}" var="list" varStatus="st" >
            <c:if test="${st.index!=0 && st.index%3==0}">
                    </br>
            </c:if>
            <div align="center" onmouseover="this.style.backgroundColor ='#0080FF'" onmouseleave="this.style.backgroundColor='#FFFFFF'" valign="middle" style="width:310px;height:260px;display: inline;float: left;margin-left: 5px;">
                 <a  href="/LifeWeb/Article/article?newsNid=${list.newsNid}" target="_blank" style="text-decoration: none" >
                     <div style="width:300px;height:253px;text-align: center;margin-top: 5px"  >
                         <div style="width:100% ;height:200px; " ><img style="width: 100%;height:100%" src="../static/newsPhoto/${list.newsPicture}" onerror="this.src='../static/photo/NewsError.jpg'"></div>
                           <div style="width: 100%;height:50px;margin-top: 3px" ><font  size="3" color="black">${list.newsTitle}</font></div>
                     </div>
                 </a>
            </div>
    </c:forEach>
    </div>
</div>
<%--<nav class="navbar navbar-default " role="navigation">
      <div class="container-fluid" style="width: 100%">
          <div class="navbar-header" style="width: 12%">
              <a class="navbar-brand" href="#"><font size="5" color="red">生活娱乐网</font></a>
          </div>
          <div>
              <ul class="nav navbar-nav" style="width: 88%">
                  <c:forEach items="${kindList}" var="kind" end="6">
                          <li   style="float:left"><a href="/LifeWeb/Navigation/kindTid/${kind.newsTid}" target="_blank"><font size="4">${kind.newsKind}</font></a></li>
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
                                          <td onmouseover="this.style.backgroundColor ='#0080FF'" onmouseleave="this.style.backgroundColor='#FFFFFF'" ><a href="/LifeWeb/Navigation/kindTid/${kind.newsTid} " style="text-decoration: none" target="_blank"><font size="4">${kind.newsKind}</font></a></td>
                                      </c:forEach>
                                  </tr>
                                  <tr>
                                      <c:forEach items="${kindList}" var="kind" begin="11" end="14">
                                          <td onmouseover="this.style.backgroundColor ='#0080FF'" onmouseleave="this.style.backgroundColor='#FFFFFF'"><a href="/LifeWeb/Navigation/kindTid/${kind.newsTid} " style="text-decoration: none" target="_blank"><font size="4">${kind.newsKind}</font></a></td>
                                      </c:forEach>
                                  </tr>
                                  <tr>
                                      <c:forEach items="${kindList}" var="kind" begin="14">
                                          <td onmouseover="this.style.backgroundColor ='#0080FF'" onmouseleave="this.style.backgroundColor='#FFFFFF'"><a href="/LifeWeb/Navigation/kindTid/${kind.newsTid} " style="text-decoration: none" target="_blank"><font size="4">${kind.newsKind}</font></a></td>
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
                                  <input type="text" class="form-control" id="seh">
                              </div>
                              <button type="button" class="btn btn-default" onclick="search1()">搜索</button>
                          </form>
                      </div>

                  </li>
                  <li style="">
                      <c:if test="${user.userId==null}">
                          <button type="button" class="btn btn-primary" style="margin-top: 9px" id="btn_showlogin">一键登录</button>
                      </c:if>
                      <c:if test="${user.userId!=null}">
                          <div style="width: 130px;height: 50px;" >
                              <div style="width: 50px;height: 50px;text-align: center;float: left;display: inline">
                                  <img src="/LifeWeb/Search/getUserPhoto" style="width: 50px;height: 50px;" class="img-rounded">
                              </div>
                              <div style="width: 70px;height: 50px;display: inline;float: left;">
                                  <div title="${user.userName}" style="width: 75px;height: 25px;margin-left: 3px;text-align: center;font-size: 15px;overflow: hidden;text-overflow: ellipsis; white-space: nowrap; cursor: pointer;">
                                          ${user.userName}
                                  </div>
                                  <div style="width: 75px;height: 25px;float:left;display: inline;text-align: center">
                                      <a href="/LifeWeb/Admin/login_cancel" target="_blank"><font size="3">注销</font></a>
                                  </div>
                              </div>
                          </div>
                      </c:if>
                  </li>
              </ul>
          </div>
      </div>
  </nav>--%>
<script type="text/javascript">
    function search(){
        var sch=document.getElementById('seh').value;
        if(sch==''){
            sch= document.getElementById('seh').getAttribute('placeholder');
        }
        window.location.href='/LifeWeb/Search/search?searchword='+sch;
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


</script>
</body>
</html>
