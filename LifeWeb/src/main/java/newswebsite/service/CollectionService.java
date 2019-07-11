package newswebsite.service;

import newswebsite.dao.Collection_newsMapper;
import newswebsite.pojo.Collection_news;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollectionService {

    @Autowired
    Collection_newsMapper collection_newsMapper;

    public int setCollection(Collection_news collection_news){
       return collection_newsMapper.insert(collection_news) ;
    }

    public List<Collection_news> getCollection(int userId){
        return collection_newsMapper.selectCollection(userId);
    }
}
