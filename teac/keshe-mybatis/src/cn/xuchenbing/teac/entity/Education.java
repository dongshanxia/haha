package cn.xuchenbing.teac.entity;

public class Education {
    private String educationId;

    private String userId;

    private String educationAddress;

    private String educationProfession;

    private String educationDegree;

    private String educationDate;

    public String getEducationId() {
        return educationId;
    }

    public void setEducationId(String educationId) {
        this.educationId = educationId == null ? null : educationId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getEducationAddress() {
        return educationAddress;
    }

    public void setEducationAddress(String educationAddress) {
        this.educationAddress = educationAddress == null ? null : educationAddress.trim();
    }

    public String getEducationProfession() {
        return educationProfession;
    }

    public void setEducationProfession(String educationProfession) {
        this.educationProfession = educationProfession == null ? null : educationProfession.trim();
    }

    public String getEducationDegree() {
        return educationDegree;
    }

    public void setEducationDegree(String educationDegree) {
        this.educationDegree = educationDegree == null ? null : educationDegree.trim();
    }

    public String getEducationDate() {
        return educationDate;
    }

    public void setEducationDate(String educationDate) {
        this.educationDate = educationDate == null ? null : educationDate.trim();
    }
}