package newswebsite.service;

import newswebsite.dao.NewsMapper;
import newswebsite.pojo.Title;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TitleService {
    @Autowired
    NewsMapper mapper;

    public List<Title> getRevelantChannel(int newsTid){
        return mapper.relevant_channel(newsTid);
    }
}
