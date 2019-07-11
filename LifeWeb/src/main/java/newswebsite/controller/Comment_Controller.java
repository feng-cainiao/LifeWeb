package newswebsite.controller;

import newswebsite.pojo.Comment;
import newswebsite.service.CommentService;
import newswebsite.service.NewsKindService;
import newswebsite.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Date;
import java.text.SimpleDateFormat;

@Controller
@RequestMapping("/Comment")
public class Comment_Controller {

    @Autowired
    CommentService commentService;
    @Autowired
    NewsService newsService;
    @RequestMapping("/user_comment")
    public String PublishComment(Comment comment){
        newsService.updateComment(comment.getNewsNid());
        comment.setCommentTime(new Date());
        int i= commentService.publishComment(comment);
        return "redirect:/Article/article?newsNid="+comment.getNewsNid();
    }
}
