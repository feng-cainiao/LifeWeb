package newswebsite.controller;

import newswebsite.pojo.Collection_news;
import newswebsite.pojo.Kind;
import newswebsite.pojo.User;
import newswebsite.service.CollectionService;
import newswebsite.service.NewsKindService;
import newswebsite.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("User")
public class User_Controller {

    @Autowired
    UserService userService;
    @Autowired
    NewsKindService kindService;
    @Autowired
    CollectionService collectionService;

    List<Kind> KindList;
    @RequestMapping("/userUpdate")
    public String getUserInformation(Model model, HttpSession session){
        User user=(User) session.getAttribute("user");
        int userId=user.getUserId();
        List<Collection_news> collections=collectionService.getCollection(userId);
        model.addAttribute("user",user);
        model.addAttribute("collections",collections);
        return "User_information";
    }
    @RequestMapping("update")
    @ResponseBody
    public String updatePassword(@RequestParam("password") String pas,@RequestParam("userId") String userid){
        HashMap<String,Object> map=new HashMap<>();
        map.put("userId",userid);
        map.put("userPassword",pas);
        int i=0;
        i=userService.updatePassword(map);
        String code=null;
        if(i!=0){
            code=""+100;
            return code;
        }else {
            code=""+200;
            return code;
        }
    }

}
