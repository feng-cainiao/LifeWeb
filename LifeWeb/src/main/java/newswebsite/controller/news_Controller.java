package newswebsite.controller;
import jdk.nashorn.internal.ir.RuntimeNode;
import net.coobird.thumbnailator.Thumbnails;
import newswebsite.pojo.*;
import newswebsite.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import newswebsite.pojo.User;
import javax.crypto.MacSpi;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.*;
import java.math.BigDecimal;
import java.sql.Blob;
import java.text.SimpleDateFormat;
import java.util.*;


@Controller
@RequestMapping("/")
public class news_Controller {

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




    @RequestMapping("/Advertise") //首页获取广告
    public  void  getAdverTise() {

    }

    @RequestMapping("/Search")  //搜索栏
    @ResponseBody
    public Msg  getSearch() {
        String search=null;
        //String time=getTime();
        String time="2018-10-18%";
        search=service.getSearchKey(time);
        return Msg.success().add("search",search);
    }


    @ModelAttribute
    public void getUser(HttpSession httpSession,Model model) {
        User user=(User)httpSession.getAttribute("user");
       if(user!=null){
           model.addAttribute("user");
       }
    }
    @RequestMapping("/")
    public String getIndex(Model model)
    {
        KindList=kindService.getNewsKind(); //导航栏
        //String time1=getTime();
        String time="2018-10-18%";
        List<News> list=service.getKeyword(time);//专栏

        TopList = service.getTopNews(time);//新闻中心

        /*HashMap<String,Object> record =new HashMap<>();
        record.put("companyName","新华网");
        record.put("time",time);
        RightList=service.getRight(record); //右侧新闻*/

        List<News> BottomList =new ArrayList<News>();
        BottomList=service.getKindArticle(13);

        List<News> BottomList1 =new ArrayList<News>();
        BottomList1=service.getKindArticle(12);

        List<News> BottomList2 =new ArrayList<News>();
        BottomList2=service.getKindArticle(5);

        List<News> BottomList3 =new ArrayList<News>();
        BottomList3=service.getKindArticle(7);

        model.addAttribute("kindList",KindList);
        model.addAttribute("list",list);
        model.addAttribute("topList",TopList);

        model.addAttribute("bottomList1",BottomList1);
        model.addAttribute("bottomList2",BottomList2);
        model.addAttribute("bottomList3",BottomList3);
        model.addAttribute("bottomList",BottomList);
        return "index";
    }

    @RequestMapping("/bottomNews")  //鼠标浮上显示
    public String  getBottomNews(@RequestParam("newsTid") String newsTid,Model model) {
        List<News> BottomList =new ArrayList<News>();
        BottomList.clear();
        BottomList=service.getKindArticle(Integer.parseInt(newsTid));
        model.addAttribute("bottomList",BottomList);
        return "index_copy";
    }

    public String getTime(){
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dateNowStr = sdf.format(d)+"%";
        return dateNowStr;
    } //获取本地时间

}