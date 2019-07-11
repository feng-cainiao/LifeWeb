package newswebsite.service;

import newswebsite.dao.ReplyMapper;
import newswebsite.pojo.Reply;
import newswebsite.pojo.ReplyTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@Service
public class ReplyService {
    @Autowired
    ReplyMapper mapper;

    public List<ReplyTest> getReply(Integer newsId)
    {
        return mapper.select_reply1(newsId);
    }

    public int  pubReply(Reply reply) { return mapper.insert_reply(reply);}

    public int  updateApprove(String[] str){ return mapper.update_approve(str);}

}
