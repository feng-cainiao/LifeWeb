package newswebsite.pojo;

public class NewsWithBLOBs extends News {
    private String newsContent;

    private String newsPicture;

    public String getNewsContent() {
        return newsContent;
    }

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent == null ? null : newsContent.trim();
    }

    public String getNewsPicture() {
        return newsPicture;
    }

    public void setNewsPicture(String  newsPicture) {
        this.newsPicture = newsPicture;
    }
}