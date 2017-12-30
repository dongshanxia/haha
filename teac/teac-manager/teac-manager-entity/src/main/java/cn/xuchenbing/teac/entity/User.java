package cn.xuchenbing.teac.entity;

import java.io.Serializable;

public class User implements Serializable{
    
	private String userId;

    private String userEmail;

    private String userPassword;

    private String userName;

    private String userEname;  //英文名字

    private String userSex;  

    private String userSubject;    //学科

    private String userAcademy;    //学院

    private String userDepartment;    //部门

    private String userSalt;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserEname() {
        return userEname;
    }

    public void setUserEname(String userEname) {
        this.userEname = userEname == null ? null : userEname.trim();
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex == null ? null : userSex.trim();
    }

    public String getUserSubject() {
        return userSubject;
    }

    public void setUserSubject(String userSubject) {
        this.userSubject = userSubject == null ? null : userSubject.trim();
    }

    public String getUserAcademy() {
        return userAcademy;
    }

    public void setUserAcademy(String userAcademy) {
        this.userAcademy = userAcademy == null ? null : userAcademy.trim();
    }

    public String getUserDepartment() {
        return userDepartment;
    }

    public void setUserDepartment(String userDepartment) {
        this.userDepartment = userDepartment == null ? null : userDepartment.trim();
    }

    public String getUserSalt() {
        return userSalt;
    }

    public void setUserSalt(String userSalt) {
        this.userSalt = userSalt == null ? null : userSalt.trim();
    }
}