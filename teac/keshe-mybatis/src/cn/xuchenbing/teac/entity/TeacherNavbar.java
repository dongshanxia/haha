package cn.xuchenbing.teac.entity;

import java.util.Date;

public class TeacherNavbar {
    private String teacNavId;

    private String userId;

    private String teacNavUrl;

    private String teacNavName;

    private Date teacNavOrder;

    public String getTeacNavId() {
        return teacNavId;
    }

    public void setTeacNavId(String teacNavId) {
        this.teacNavId = teacNavId == null ? null : teacNavId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getTeacNavUrl() {
        return teacNavUrl;
    }

    public void setTeacNavUrl(String teacNavUrl) {
        this.teacNavUrl = teacNavUrl == null ? null : teacNavUrl.trim();
    }

    public String getTeacNavName() {
        return teacNavName;
    }

    public void setTeacNavName(String teacNavName) {
        this.teacNavName = teacNavName == null ? null : teacNavName.trim();
    }

    public Date getTeacNavOrder() {
        return teacNavOrder;
    }

    public void setTeacNavOrder(Date teacNavOrder) {
        this.teacNavOrder = teacNavOrder;
    }
}