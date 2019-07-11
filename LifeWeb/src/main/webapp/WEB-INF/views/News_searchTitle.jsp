<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Cache-Control" content="no-cache">
<meta http-equiv="Expires" content="0">
<%--
  Created by IntelliJ IDEA.
  User: ThinkPad
  Date: 2018/12/30
  Time: 9:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>左边栏</title>
</head>
<body>
<div style="width: 100%;height: auto; " >
    <jsp:include page="navigation.jsp"></jsp:include>
    <jsp:include page="News_login.jsp"></jsp:include>
</div>

<div style="width: 85%;height: 120px;margin:auto" >
    <img src="../static/photo/ad1.png" style="width: 100%">
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
                        <div style="width:100% ;height:200px; " ><img style="width: 100%;height:100%" src="/LifeWeb/Search/getKindPicture/${st.index}" onerror="this.src='../static/photo/NewsError.jpg'"></div>
                        <div style="width: 100%;height:50px;margin-top: 3px" ><font  size="3" color="black">${list.newsTitle}</font></div>
                    </div>
                </a>
            </div>
        </c:forEach>
    </div>
</div>
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
