package newswebsite.controller;

import newswebsite.pojo.Msg;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/Admin")
public class Admin_Controller {

    @RequestMapping("/login_link")
    public String getLoginJsp(){
        return "News_login";
    }

    @RequestMapping("/register_link")
    public String getRegisterJsp(){
        return "News_register";
    }

    @RequestMapping("/login_cancel")
    @ResponseBody
    public Msg getlogin_cancel(HttpSession httpSession){
        httpSession.invalidate();
        return Msg.success();
    }
     
	 @RequestBody
	 @RequestMapping("/test")
	 public String tryTest(){
		 return "Hello World"
	 }

}
