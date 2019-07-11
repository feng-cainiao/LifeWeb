package newswebsite.dao;

import java.util.List;
import newswebsite.pojo.ApproveComment;
import newswebsite.pojo.ApproveCommentExample;
import org.apache.ibatis.annotations.Param;

public interface ApproveCommentMapper {
    long countByExample(ApproveCommentExample example);

    int deleteByExample(ApproveCommentExample example);

    int deleteByPrimaryKey(Integer approvecommentId);

    int insert(ApproveComment record);

    int insertSelective(ApproveComment record);

    List<ApproveComment> selectByExample(ApproveCommentExample example);

    ApproveComment selectByPrimaryKey(Integer approvecommentId);

    int updateByExampleSelective(@Param("record") ApproveComment record, @Param("example") ApproveCommentExample example);

    int updateByExample(@Param("record") ApproveComment record, @Param("example") ApproveCommentExample example);

    int updateByPrimaryKeySelective(ApproveComment record);

    int updateByPrimaryKey(ApproveComment record);
}