package newswebsite.dao;

import java.util.List;
import newswebsite.pojo.Approve;
import newswebsite.pojo.ApproveExample;
import org.apache.ibatis.annotations.Param;

public interface ApproveMapper {
    long countByExample(ApproveExample example);

    int deleteByExample(ApproveExample example);

    int deleteByPrimaryKey(Integer approveId);

    int insert(Approve record);

    int insertSelective(Approve record);

    List<Approve> selectByExample(ApproveExample example);

    Approve selectByPrimaryKey(Integer approveId);

    int updateByExampleSelective(@Param("record") Approve record, @Param("example") ApproveExample example);

    int updateByExample(@Param("record") Approve record, @Param("example") ApproveExample example);

    int updateByPrimaryKeySelective(Approve record);

    int updateByPrimaryKey(Approve record);
}