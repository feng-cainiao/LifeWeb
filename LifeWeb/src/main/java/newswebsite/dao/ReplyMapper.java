package newswebsite.dao;

import java.util.List;
import java.util.Map;
import java.util.Objects;

import newswebsite.pojo.Reply;
import newswebsite.pojo.ReplyExample;
import newswebsite.pojo.ReplyTest;
import org.apache.ibatis.annotations.Param;

public interface ReplyMapper {
    long countByExample(ReplyExample example);

    int deleteByExample(ReplyExample example);

    int deleteByPrimaryKey(Integer replyId);

    int insert(Reply record);

    int insertSelective(Reply record);

    List<Reply> selectByExample(ReplyExample example);

    Reply selectByPrimaryKey(Integer replyId);

    int updateByExampleSelective(@Param("record") Reply record, @Param("example") ReplyExample example);

    int updateByExample(@Param("record") Reply record, @Param("example") ReplyExample example);

    int updateByPrimaryKeySelective(Reply record);

    int updateByPrimaryKey(Reply record);

    List<ReplyTest> select_reply1(Integer newsId);

    int insert_reply(Reply reply);

    int update_approve(String[] array);

}