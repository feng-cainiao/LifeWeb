<%--
  Created by IntelliJ IDEA.
  User: ThinkPad
  Date: 2018/12/19
  Time: 21:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <script>
      function getKeyNews(id)
      {
          var News={newsNid:id};
          $.ajax({
              type:"post",
              url: "article_newsid",
              data:JSON.stringify(News),
              dataType:"json",
              contentType : "application/json;charset=UTF-8",
              success: function(result){



                  /* $("#keyword1").append($("<a style='text-decoration:none;'></a>").append(result.extend["keyword"][0].newsTitle).attr("href","getPicture?newsNid="+result.extend["keyword"][0].newsNid));
                   $("#keyword2").append($("<a style='text-decoration:none;'></a>").append(result.extend["keyword"][1].newsTitle).attr("href","article?newsNid="+result.extend["keyword"][1].newsNid));
                   $("#keyword3").append($("<a style='text-decoration:none;'></a>").append(result.extend["keyword"][2].newsTitle).attr("href","article?newsNid="+result.extend["keyword"][2].newsNid));
                   $("#image1").append($("<a style='text-decoration:none;'></a>").append(result.extend["keyword"][0].newsPicture).attr("href","article?newsNid="+result.extend["keyword"][0].newsNid));
                   $("#topic0").append(result.extend["keyword"][0].newsTitle);
                   $("#dis0").attr("href","article?newsNid="+result.extend["keyword"][0].newsNid);

                   $("#topic1").append(result.extend["keyword"][1].newsTitle);
                   $("#dis1").attr("href","article?newsNid="+result.extend["keyword"][1].newsNid);

                   $("#topic2").append(result.extend["keyword"][2].newsTitle);
                   $("#dis2").attr("href","article?newsNid="+result.extend["keyword"][2].newsNid);

                   $("#right0").append(result.extend["keyword"][0].newsTitle);
                   $("#top0").attr("href","article?newsNid="+result.extend["keyword"][0].newsNid);
                   $("#rig0").append($("<a style='text-decoration:none;'></a>").append(result.extend["keyword"][0].newsTitle).attr("href","article?newsNid="+result.extend["keyword"][0].newsNid));
                   $("#rig1").append($("<a style='text-decoration:none;'></a>").append(result.extend["keyword"][1].newsTitle).attr("href","article?newsNid="+result.extend["keyword"][1].newsNid));
                   $("#rig2").append($("<a style='text-decoration:none;'></a>").append(result.extend["keyword"][2].newsTitle).attr("href","article?newsNid="+result.extend["keyword"][2].newsNid));*/


              }
          });
      }
  </script>
</body>
</html>
