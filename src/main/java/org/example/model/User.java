package org.example.model;

public class User {
    private String userEmail;
    private String userPassword;
    private String userNickName;
    public User(String userEmail, String userPassword, String userNickName) {
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.userNickName = userNickName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserNickName() {
        return userNickName;
    }

    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName;
    }
}
