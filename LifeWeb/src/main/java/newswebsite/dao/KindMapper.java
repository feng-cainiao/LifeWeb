package newswebsite.dao;

import java.util.List;
import newswebsite.pojo.Kind;
import newswebsite.pojo.KindExample;
import org.apache.ibatis.annotations.Param;

public interface KindMapper {

    List<Kind> selectKind();


    long countByExample(KindExample example);

    int deleteByExample(KindExample example);

    int deleteByPrimaryKey(Integer newsTid);

    int insert(Kind record);

    int insertSelective(Kind record);

    List<Kind> selectByExample(KindExample example);

    Kind selectByPrimaryKey(Integer newsTid);

    int updateByExampleSelective(@Param("record") Kind record, @Param("example") KindExample example);

    int updateByExample(@Param("record") Kind record, @Param("example") KindExample example);

    int updateByPrimaryKeySelective(Kind record);

    int updateByPrimaryKey(Kind record);
}