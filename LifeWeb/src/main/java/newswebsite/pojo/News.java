package newswebsite.pojo;

import java.util.Date;

public class News {
    private Integer newsNid;

    private Integer newsTid;

    private String newsTitle;

    private Integer companyId;

    private Date newsTime;

    private Integer newsApprove;

    private Integer newsComment;

    private String newsKeyword;

    private String newsContent;

    private String newsPicture;

    private  Company company;

    private String  author;

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getNewsContent() {
        return newsContent;
    }

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent == null ? null : newsContent.trim();
    }

    public String getNewsPicture() {
        return newsPicture;
    }

    public void setNewsPicture(String newsPicture) {
        this.newsPicture = newsPicture;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getNewsNid() {
        return newsNid;
    }

    public void setNewsNid(Integer newsNid) {
        this.newsNid = newsNid;
    }

    public Integer getNewsTid() {
        return newsTid;
    }

    public void setNewsTid(Integer newsTid) {
        this.newsTid = newsTid;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle == null ? null : newsTitle.trim();
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Date getNewsTime() {
        return newsTime;
    }

    public void setNewsTime(Date newsTime) {
        this.newsTime = newsTime;
    }

    public Integer getNewsApprove() {
        return newsApprove;
    }

    public void setNewsApprove(Integer newsApprove) {
        this.newsApprove = newsApprove;
    }

    public Integer getNewsComment() {
        return newsComment;
    }

    public void setNewsComment(Integer newsComment) {
        this.newsComment = newsComment;
    }

    public String getNewsKeyword() {
        return newsKeyword;
    }

    public void setNewsKeyword(String newsKeyword) {
        this.newsKeyword = newsKeyword == null ? null : newsKeyword.trim();
    }
}