package newswebsite.pojo;

public class Author {
    private Integer authorId;

    private String authorTelephone;

    private String authorPassword;

    private String authorIdentify;

    private String authorName;

    private String companyId;

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public String getAuthorTelephone() {
        return authorTelephone;
    }

    public void setAuthorTelephone(String authorTelephone) {
        this.authorTelephone = authorTelephone == null ? null : authorTelephone.trim();
    }

    public String getAuthorPassword() {
        return authorPassword;
    }

    public void setAuthorPassword(String authorPassword) {
        this.authorPassword = authorPassword == null ? null : authorPassword.trim();
    }

    public String getAuthorIdentify() {
        return authorIdentify;
    }

    public void setAuthorIdentify(String authorIdentify) {
        this.authorIdentify = authorIdentify == null ? null : authorIdentify.trim();
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName == null ? null : authorName.trim();
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }
}