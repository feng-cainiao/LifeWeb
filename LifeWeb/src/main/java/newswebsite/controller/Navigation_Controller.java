package newswebsite.controller;

import newswebsite.pojo.Kind;
import newswebsite.pojo.News;
import newswebsite.pojo.Title;
import newswebsite.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("/Navigation")
public class Navigation_Controller {

    @Autowired
    TitleService titleService;
    @Autowired
    NewsService service;
    @Autowired
    NewsKindService kindService;
    @Autowired
    CommentService commentService;
    @Autowired
    UserService userService;
    @Autowired
    ReplyService replyService;

    List<News> TopList;
    List<News> RightList;
    List<Kind> KindList;
    List<News> listArticle;
    List<Title> channellist;


    @RequestMapping("/kindTid")  //点击导航栏跳转
    public String getKindTid(@RequestParam("navword") int newsTid, Model model) {

        if(KindList==null)
        {
            KindList=kindService.getNewsKind();
        }
        listArticle=service.getKindArticle(newsTid);
        channellist=titleService.getRevelantChannel(newsTid);
        HashMap<String,Object> map=new HashMap();
        map.put("searchtitle","养生");
        List<News> newsList1=service.getSearch(map);

        map.put("searchtitle","阿里");
        List<News> newsList2=service.getSearch(map);
        model.addAttribute(KindList);
        model.addAttribute(newsTid);
        model.addAttribute("listArticle",listArticle);
        model.addAttribute("channellist",channellist);
        model.addAttribute("newsList1",newsList1);
        model.addAttribute("newsList2",newsList2);
        return  "News_kind";
    }


}
