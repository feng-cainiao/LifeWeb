package newswebsite.pojo;

import java.util.Date;

public class Comment {
    private Integer commentId;

    private Integer newsNid;

    private Integer userId;

    private String commentContent;

    private Integer commentApprove;

    private Date commentTime;

    private  User user;

    private Reply reply;

    public Reply getReply() {
        return reply;
    }

    public void setReply(Reply reply) {
        this.reply = reply;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Integer getNewsNid() {
        return newsNid;
    }

    public void setNewsNid(Integer newsNid) {
        this.newsNid = newsNid;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent == null ? null : commentContent.trim();
    }

    public Integer getCommentApprove() {
        return commentApprove;
    }

    public void setCommentApprove(Integer commentApprove) {
        this.commentApprove = commentApprove;
    }

    public Date getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }
}