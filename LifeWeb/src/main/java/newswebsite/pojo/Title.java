package newswebsite.pojo;

public class Title {

    private int titleId ;

    private String titleName;

    private int newsTid;

    public int getTitleId() {
        return titleId;
    }

    public void setTitleId(int titleId) {
        this.titleId = titleId;
    }

    public String getTitleName() {
        return titleName;
    }

    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }

    public int getNewsTid() {
        return newsTid;
    }

    public void setNewsTid(int newsTid) {
        this.newsTid = newsTid;
    }
}
