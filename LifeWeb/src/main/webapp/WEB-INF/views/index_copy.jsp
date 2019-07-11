<%--
  Created by IntelliJ IDEA.
  User: ThinkPad
  Date: 2019/4/20
  Time: 14:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Cache-Control" content="no-cache">
<meta http-equiv="Expires" content="0">
<html>
<head>
    <title>主页副本</title>
</head>
<body>
  <div>
      <c:forEach items="${bottomList}" var="bottom" begin="0"  varStatus="bl" >
          <c:if test="${bl.index<3}">
              <div  class="title1" style="margin-top: 10px;" id="d${bl.index}" >
                  <a  style="width: 100%;height:150px " target="_blank"  href="Article/article?newsNid=${bottom.newsNid}" id="a${bl.index}">
                      <div style="width: 100%;height:170px "  >
                          <div style="width: 35%;height:170px;display: inline;float: left;border:1px  #dbdbdb solid " id="i${bl.index}">
                              <img src="static/newsPhoto/${bottom.newsPicture}" style="width: 100%;height: 100%" onerror="this.src='static/photo/NewsError.jpg'">
                          </div>
                          <div style="width: 60%;height:170px;display: inline;float: left;margin-left: 9px" >
                              <font  size="4" color="black" id="f${bl.index}">${bottom.newsTitle}</font>
                          </div>
                      </div>
                  </a>
              </div>
          </c:if>
          <c:if test="${bl.index>=3}">
              <c:if test="${bl.index==3}">
                  <div style="width: 100%;margin-top:20px;height: 30px" id="viewMore1" >
                      <button style="width: 100%;background-color: #FBFBFB;" onclick="display1()"><font size="3">查看更多新闻</font></button>
                  </div>
              </c:if>
              <div  class="title1" style="margin-top: 10px;display: none" id="d${bl.index}" >
                  <a  style="width: 100%;height:150px " target="_blank"  href="Article/article?newsNid=${bottom.newsNid}" id="a${bl.index}">
                      <div style="width: 100%;height:170px "  >
                          <div style="width: 35%;height:170px;display: inline;float: left;border:1px  #dbdbdb solid " id="i${bl.index}">
                              <img src="static/newsPhoto/1.jpg" style="width: 100%;height: 100%" onerror="this.src='static/photo/NewsError.jpg'" >
                          </div>
                          <div style="width: 60%;height:170px;display: inline;float: left;margin-left: 9px" >
                              <font  size="4" color="black" id="f${bl.index}">${bottom.newsTitle}</font>
                          </div>
                      </div>
                  </a>
              </div>
          </c:if>
      </c:forEach>
     <%-- <div style="width: 100%;margin-top:20px;height: 30px;display: none" id="viewMore2" >
          <button style="width: 100%;background-color: #FBFBFB;" onclick="display1()" ><font size="3">查看更多新闻</font></button>
      </div>--%>
  </div>
  <script>
      function display1() {
          var d=["d0","d1","d2","d3","d4"];
          var view1=document.getElementById("viewMore1")
          view1.style.display="none";
          for(var n=3;n<5;n++)
          {
              var hid=document.getElementById(d[n]);
              hid.style.display="block";
          }
      } //查看更多新闻
  </script>
</body>
</html>
