package newswebsite.controller;

import newswebsite.pojo.Collection_news;
import newswebsite.service.CollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("Collection")
public class Collectioin_Controller {

    @Autowired
    CollectionService collectionService;
    @RequestMapping("/collection")
    @ResponseBody
    public String setCollection(@RequestBody Collection_news collection_news){
        Date d = new Date();
        String code=null;
        int n=0;
        System.out.println(d);
        collection_news.setCollectionTime(d);
         n= collectionService.setCollection(collection_news);
        if(n!=0){
            code=""+100;
        }else{
            code=""+200;
        }
        return code;
    }
    @RequestMapping("/userCollection")
    public String getCollection(@RequestParam("userId") String userId, Model model){
        int id=Integer.parseInt(userId);
       List<Collection_news> collections=collectionService.getCollection(id);
       model.addAttribute("collection",collections);
       return "collection";
    }
}
