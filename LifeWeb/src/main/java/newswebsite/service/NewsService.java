package newswebsite.service;

import com.sun.org.apache.bcel.internal.generic.NEW;
import newswebsite.dao.NewsMapper;
import newswebsite.pojo.Company;
import newswebsite.pojo.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class NewsService {
    @Autowired
    NewsMapper mapper;
    public List<News> getKeyword(String  time)
    {
        return mapper.select_keyword(time);
    }

    public List<News> getTopNews(String time){  return mapper.select_top(time);}

    public List<News> getRight(HashMap<String,Object> map) {
        return mapper.select_right(map);
    }

    public News  getArticle(Integer newsid){
        return mapper.select_article(newsid);
    }

    public List<News> getKindArticle(Integer newsTid){
        return mapper.select_kindArticle(newsTid);
    }

    public  String getSearchKey(String time){
        return mapper.select_searchkey(time);
    };

    public List<News> getSearch(HashMap<String,Object> map){
        return mapper.select_search(map);
    }

    public List<News> getSearchtitle(String search){
        return mapper.select_searchtitle(search);
    }

    public int updateApprove(int newsid){ return mapper.update_approve(newsid);}

    public int updateComment(int newsid){ return mapper.update_comment(newsid);}

    public List<News> getSearchChannel(int titleId){
        return mapper.search_channel(titleId);
    }
}
