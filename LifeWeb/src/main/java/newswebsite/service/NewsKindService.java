package newswebsite.service;

import newswebsite.dao.KindMapper;
import newswebsite.dao.NewsMapper;
import newswebsite.pojo.Kind;
import newswebsite.pojo.News;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsKindService {
    @Autowired
    KindMapper mapper;
    public List<Kind> getNewsKind()
    {
        return mapper.selectKind();
    }
}
