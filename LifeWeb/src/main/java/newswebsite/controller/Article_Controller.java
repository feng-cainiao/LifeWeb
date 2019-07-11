package newswebsite.controller;

import net.coobird.thumbnailator.Thumbnails;
import newswebsite.pojo.*;
import newswebsite.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.*;
import java.util.HashMap;
import java.util.List;

import java.util.Map;
import java.util.Objects;

@Controller
@RequestMapping("/Article")
public class Article_Controller {

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
    List<News> ListTitle;

    @ModelAttribute
    public void getUser(HttpSession httpSession, Model model) {
        User user = (User) httpSession.getAttribute("user");
        if (user != null) {
            model.addAttribute("user");
        }
    }





    @RequestMapping("/article")//跳转页面查看新闻
    public String getNewsJsp(@RequestParam(value = "newsNid") int id, @RequestParam(value = "ord", required = false, defaultValue = "2") int ord, Model model) {
        if (KindList == null) {
            KindList = kindService.getNewsKind();
        }
        HashMap map = new HashMap<String, Object>();
        map.put("newsId", id);
        map.put("ord", ord);
        News news1 = service.getArticle(id);
        List<Comment> comment = commentService.getComment(map);
        List<ReplyTest> reply = replyService.getReply(id);
        model.addAttribute(news1);
        model.addAttribute(comment);
        model.addAttribute(reply);
        model.addAttribute(KindList);
        model.addAttribute("newsNid", id);
        return "News_article_sp";
    }


    @RequestMapping("/comment_time")
    public String getCommentTime(@RequestParam("newsNid") String nid, @RequestParam("ord") String orde, @RequestParam("commentflag") String commentflag1, Model model, @SessionAttribute(value = "user", required = false) User user) {
        int newsNid = Integer.parseInt(nid);
        int ord = Integer.parseInt(orde);
        int commentflag = Integer.parseInt(commentflag1);
        HashMap map = new HashMap<String, Object>();
        map.put("newsId", newsNid);
        map.put("ord", ord);
        if (commentflag == 0) {
            if (user != null)
                map.put("userid", user.getUserId());
        }
        List<Comment> comment = commentService.getComment(map);
        List<ReplyTest> reply = replyService.getReply(newsNid);
        model.addAttribute(comment);
        model.addAttribute(reply);
        return "commentpage";
    }



    @RequestMapping("/news_approve")
    @ResponseBody
    public String setNewsApprove(@RequestParam("newsNid") String nid, @SessionAttribute(value = "user", required = false) User user) {
        if (user == null) {
            return "";
        }
        System.out.println("asdf");
        int newsNid = Integer.parseInt(nid);
        service.updateApprove(newsNid);
        return "";
    }

    @RequestMapping("/comment_approve")
    public String setCommentApprove(@RequestParam("ltcomment") String ltcomment, @SessionAttribute(value = "user", required = false) User user,@RequestParam("newsNid") String nid, @RequestParam("ord") String orde, @RequestParam("commentflag") String commentflag1, Model model) {
        if (user == null) {
            return "";
        }
        String comment1=ltcomment.substring(1,ltcomment.length()-1);
        String []data=comment1.split(",");
        commentService.updateApprove(data);
        int newsNid = Integer.parseInt(nid);
        int ord = Integer.parseInt(orde);
        int commentflag = Integer.parseInt(commentflag1);
        HashMap map = new HashMap<String, Object>();
        map.put("newsId", newsNid);
        map.put("ord", ord);
        if (commentflag == 0) {
            if (user != null)
                map.put("userid", user.getUserId());
        }
        List<Comment> comment = commentService.getComment(map);
        List<ReplyTest> reply = replyService.getReply(newsNid);
        model.addAttribute(comment);
        model.addAttribute(reply);
        return "commentpage";
    }

    @RequestMapping("/reply_approve")
    @ResponseBody
    public String setReplyApprove(@RequestParam("rycomment") String rycomment, @SessionAttribute(value = "user", required = false) User user,@RequestParam("newsNid") String nid, @RequestParam("ord") String orde, @RequestParam("commentflag") String commentflag1, Model model) {
        if (user == null) {
            return "";
        }
        String comment1=rycomment.substring(1,rycomment.length()-1);
        String []data=comment1.split(",");
        replyService.updateApprove(data);
        int newsNid = Integer.parseInt(nid);
        int ord = Integer.parseInt(orde);
        int commentflag = Integer.parseInt(commentflag1);
        HashMap map = new HashMap<String, Object>();
        map.put("newsId", newsNid);
        map.put("ord", ord);
        if (commentflag == 0) {
            if (user != null)
                map.put("userid", user.getUserId());
        }
        List<Comment> comment = commentService.getComment(map);
        List<ReplyTest> reply = replyService.getReply(newsNid);
        model.addAttribute(comment);
        model.addAttribute(reply);
       /* int newsNid = Integer.parseInt(nid);
        service.updateApprove(newsNid);*/
        return "commentpage";
    }



    @RequestMapping("/search_title")
    public String getSearchTitle(@RequestParam("searchword") String word, Model model) {
        List<Kind> kindList = kindService.getNewsKind();
        ListTitle = service.getSearchtitle(word);
        System.out.println(ListTitle.get(0).getNewsTitle());
        model.addAttribute(kindList);
        model.addAttribute("ListTitle", ListTitle);
        model.addAttribute(word);
        return "News_searchTitle";
    }
}
