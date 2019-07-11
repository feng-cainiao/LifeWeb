package newswebsite.service;

import newswebsite.dao.CommentMapper;
import newswebsite.pojo.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class CommentService {
    @Autowired
    CommentMapper commentMapper;

    public  List<Comment> getComment(HashMap<String,Object> map){
        return commentMapper.select_comments(map);
    }

    public int publishComment(Comment comment){ return  commentMapper.insert_comment(comment);}

    public int updateApprove(String[] str){
        return commentMapper.update_Approve(str);
    }
}
