package newswebsite.dao;

import java.util.List;
import newswebsite.pojo.ApproveNews;
import newswebsite.pojo.ApproveNewsExample;
import org.apache.ibatis.annotations.Param;

public interface ApproveNewsMapper {
    long countByExample(ApproveNewsExample example);

    int deleteByExample(ApproveNewsExample example);

    int deleteByPrimaryKey(Integer approvenewsId);

    int insert(ApproveNews record);

    int insertSelective(ApproveNews record);

    List<ApproveNews> selectByExample(ApproveNewsExample example);

    ApproveNews selectByPrimaryKey(Integer approvenewsId);

    int updateByExampleSelective(@Param("record") ApproveNews record, @Param("example") ApproveNewsExample example);

    int updateByExample(@Param("record") ApproveNews record, @Param("example") ApproveNewsExample example);

    int updateByPrimaryKeySelective(ApproveNews record);

    int updateByPrimaryKey(ApproveNews record);
}