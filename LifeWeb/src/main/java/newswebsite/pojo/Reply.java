package newswebsite.pojo;

import java.util.Date;

public class Reply {
    private Integer replyId;

    private Integer commentId;

    private Integer replyuserId;

    private String replyContent;

    private Integer replyApprove;

    private Integer commentuserId;

    private Date replyTime;

    private User user;
    private Integer newsNid;

    public Integer getNewsNid() {
        return newsNid;
    }

    public void setNewsNid(Integer newsNid) {
        this.newsNid = newsNid;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getReplyId() {
        return replyId;
    }

    public void setReplyId(Integer replyId) {
        this.replyId = replyId;
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Integer getReplyuserId() {
        return replyuserId;
    }

    public void setReplyuserId(Integer replyuserId) {
        this.replyuserId = replyuserId;
    }

    public String getReplyContent() {
        return replyContent;
    }

    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent == null ? null : replyContent.trim();
    }

    public Integer getReplyApprove() {
        return replyApprove;
    }

    public void setReplyApprove(Integer replyApprove) {
        this.replyApprove = replyApprove;
    }

    public Integer getCommentuserId() {
        return commentuserId;
    }

    public void setCommentuserId(Integer commentuserId) {
        this.commentuserId = commentuserId;
    }

    public Date getReplyTime() {
        return replyTime;
    }

    public void setReplyTime(Date replyTime) {
        this.replyTime = replyTime;
    }
}