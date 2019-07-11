package newswebsite.controller;

import newswebsite.pojo.Reply;
import newswebsite.service.NewsService;
import newswebsite.service.ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
@RequestMapping("/Reply")
public class Reply_Controller {

    @Autowired
    ReplyService replyService;
    @Autowired
    NewsService newsService;

    @RequestMapping("/user_Reply")
    public String replyComment(Reply reply){
        reply.setReplyTime(new Date());
        newsService.updateComment(reply.getNewsNid());
        int i= replyService.pubReply(reply);
        return "redirect:/Article/article?newsNid="+reply.getNewsNid();
    }
}
