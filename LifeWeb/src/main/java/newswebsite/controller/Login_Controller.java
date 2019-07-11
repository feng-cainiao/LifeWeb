package newswebsite.controller;


import newswebsite.pojo.Msg;
import newswebsite.pojo.User;
import newswebsite.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/Login")
public class Login_Controller {

    @Autowired
    UserService userService;
    @RequestMapping("/user_login")
    @ResponseBody
    public Msg isBooleanLogin (@RequestBody @Valid User user, BindingResult result, HttpSession httpSession)
    {
        if (result.hasErrors()) {
            List<ObjectError> errorList=result.getAllErrors();
            if(errorList.size()==2){
                return Msg.fail();
            }
            for(ObjectError error:errorList){
                if(error.getDefaultMessage().equals("格式不对")){
                    return Msg.failaccount();
                }else{
                   return  Msg.failpasswordnull();
                }
            }
        }
        Map map=new HashMap<String, String>();
        map.put("userTelephone",user.getUserTelephone());
        map.put("userPassword",user.getUserPassword());
        User user1=userService.getUser(map);
        if(user1!=null) {
           httpSession.setAttribute("user",user1);
        }else{
            User user2=userService.getUser(user.getUserTelephone());
            if(user2!=null){
                return Msg.failpassworderror();
            }
            return Msg.failaccountno();
        }
        return Msg.success();
    }
}
