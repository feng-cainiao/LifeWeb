package newswebsite.pojo;

public class Kind {
    private Integer newsTid;

    private String newsKind;

    public Integer getNewsTid() {
        return newsTid;
    }

    public void setNewsTid(Integer newsTid) {
        this.newsTid = newsTid;
    }

    public String getNewsKind() {
        return newsKind;
    }

    public void setNewsKind(String newsKind) {
        this.newsKind = newsKind == null ? null : newsKind.trim();
    }
}