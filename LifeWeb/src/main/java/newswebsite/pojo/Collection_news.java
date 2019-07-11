package newswebsite.pojo;

import java.util.Date;

public class Collection_news {
    private Integer collectionId;

    private Integer userId;

    private Integer newsNid;

    private String newsTitle;

    private String newsPicture;

    private Date collectionTime;

    public Date getCollectionTime() {
        return collectionTime;
    }

    public void setCollectionTime(Date collectionTime) {
        this.collectionTime = collectionTime;
    }

    public Integer getCollectionId() {
        return collectionId;
    }

    public void setCollectionId(Integer collectionId) {
        this.collectionId = collectionId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getNewsNid() {
        return newsNid;
    }

    public void setNewsNid(Integer newsNid) {
        this.newsNid = newsNid;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle == null ? null : newsTitle.trim();
    }

    public String  getNewsPicture() {
        return newsPicture;
    }

    public void setNewsPicture(String newsPicture) {
        this.newsPicture = newsPicture;
    }
}