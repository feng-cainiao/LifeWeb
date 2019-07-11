package newswebsite.controller;

import newswebsite.pojo.User;
import newswebsite.service.UserService;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.*;


@Controller
@RequestMapping("/uploadFile")
public class Photo_Controller {

    @Autowired
    UserService userService;


    @ResponseBody
    @RequestMapping("/uploadUserPhoto")
    public String uploadPhoto (@RequestParam MultipartFile headPhotoFile, @SessionAttribute("user")User user,HttpSession session) throws IOException {
            String newFileName=null;
            int userId=user.getUserId();
            if(headPhotoFile.isEmpty()){
                System.out.println("文件未上传");
            }else {
                String contentType = headPhotoFile.getContentType();
                if (contentType.startsWith("image")) {//获取Web项目的全路径
                   // String realPath = request.getSession().getServletContext().getRealPath("/");
                   String realPath="D:\\demo\\LifeWeb\\src\\main\\webapp\\static\\userphoto\\";
                    System.out.println(realPath);//输出D:\Program Files\apache-tomcat-7.0.62\webapps\springmvc\
                   /* realPath = realPath.replace("springmvc", "springmvcImage");
                    realPath.concat("user");*/
                    Calendar calendar=Calendar.getInstance();
                    String name=calendar.get(Calendar.YEAR)+""+(calendar.get(Calendar.MONTH)+1)
                            +""+calendar.get(Calendar.DATE)+""+calendar.get(Calendar.HOUR_OF_DAY)+""+
                            calendar.get(Calendar.MINUTE)+""+calendar.get(Calendar.SECOND)+"_"+userId;
                    newFileName = name+ ".jpg";
                    FileUtils.copyInputStreamToFile(headPhotoFile.getInputStream(), new File(realPath, newFileName));
                    //将图片路径插入数据库
                    HashMap<String, Object> requestMap = new HashMap<String, Object>();
                    requestMap.put("userId", userId);
                    requestMap.put("headPhoto",newFileName);
                        int flag=0;
                        flag = userService.updatePhoto(requestMap);
                        User user1=userService.getUser(userId);
                        session.setAttribute("user",user1);
                        System.out.println(flag+"asdf");
                }
                return newFileName;
            }
        return newFileName;
    }
}
