package com.example.androidgame.dto;

public class DiscussDetail {
    int discussId;
    int userId;
    String userName;
    String userImage;
    String discussDetail;
    String discussType;

    public int getDiscussId() {
        return discussId;
    }

    public void setDiscussId(int discussId) {
        this.discussId = discussId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }

    public String getDiscussDetail() {
        return discussDetail;
    }

    public void setDiscussDetail(String discussDetail) {
        this.discussDetail = discussDetail;
    }

    public String getDiscussType() {
        return discussType;
    }

    public void setDiscussType(String discussType) {
        this.discussType = discussType;
    }
}
