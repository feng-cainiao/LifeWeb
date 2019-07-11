package newswebsite.controller;

import newswebsite.pojo.Kind;
import newswebsite.pojo.News;
import newswebsite.pojo.User;
import newswebsite.service.NewsKindService;
import newswebsite.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("/Search")
public class Search_Controller {

    @Autowired
    NewsService newsService;

    @Autowired
    NewsKindService kindService;

    List<News> newsList;

    List<News> ListTitle;
    @ModelAttribute
    public void getUser(HttpSession httpSession, Model model) {
        User user=(User)httpSession.getAttribute("user");
        if(user!=null){
            model.addAttribute("user");
        }
    }

    @RequestMapping("/search")
    public String getSearch(@RequestParam(value = "searchword",required = false) String word,@RequestParam(value = "searchTitle",required = false) String title, Model model)
    {
        List<Kind> kindList=kindService.getNewsKind();
        HashMap<String,Object> map=new HashMap();
        map.put("searchword",word);
        map.put("searchtitle",title);
        newsList=newsService.getSearch(map);


        model.addAttribute(kindList);
        model.addAttribute(newsList);

        return "News_search";
    }

    @RequestMapping("/searchChannel")
    public String getSearchChannel(@RequestParam(value = "channel",required = false) int  titleId,@RequestParam(value = "searchTitle",required = false) String title, Model model)
    {
        List<Kind> kindList=kindService.getNewsKind();

        newsList=newsService.getSearchChannel(titleId);
        model.addAttribute(kindList);
        model.addAttribute(newsList);

        return "News_search";
    }




}
