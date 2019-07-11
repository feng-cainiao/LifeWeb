package newswebsite.dao;

import java.util.List;
import newswebsite.pojo.Collection_news;
import newswebsite.pojo.Collection_newsExample;
import org.apache.ibatis.annotations.Param;

public interface Collection_newsMapper {
    long countByExample(Collection_newsExample example);

    int deleteByExample(Collection_newsExample example);

    int deleteByPrimaryKey(Integer collectionId);



    int insertSelective(Collection_news record);

    List<Collection_news> selectByExampleWithBLOBs(Collection_newsExample example);

    List<Collection_news> selectByExample(Collection_newsExample example);

    Collection_news selectByPrimaryKey(Integer collectionId);

    int updateByExampleSelective(@Param("record") Collection_news record, @Param("example") Collection_newsExample example);

    int updateByExampleWithBLOBs(@Param("record") Collection_news record, @Param("example") Collection_newsExample example);

    int updateByExample(@Param("record") Collection_news record, @Param("example") Collection_newsExample example);

    int updateByPrimaryKeySelective(Collection_news record);

    int updateByPrimaryKeyWithBLOBs(Collection_news record);

    int updateByPrimaryKey(Collection_news record);


    int insert(Collection_news record);

    List<Collection_news> selectCollection(int userId);
}