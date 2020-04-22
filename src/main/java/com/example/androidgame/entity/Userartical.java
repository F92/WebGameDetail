package com.example.androidgame.entity;

import java.util.Date;

public class Userartical {
    int userarticalId;
    int userId;
    int articalId;
    int gameId;
    Date userarticalDate;

    public int getUserarticalId() {
        return userarticalId;
    }

    public void setUserarticalId(int userarticalId) {
        this.userarticalId = userarticalId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getArticalId() {
        return articalId;
    }

    public void setArticalId(int articalId) {
        this.articalId = articalId;
    }

    public Date getUserarticalDate() {
        return userarticalDate;
    }

    public void setUserarticalDate(Date userarticalDate) {
        this.userarticalDate = userarticalDate;
    }
}
