package com.example.androidgame.entity;

import java.util.Date;

public class Userdiscuss {
    int userdiscussId;
    int userId;
    int discussId;
    int gameId;
    Date userdiscussDate;

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public int getUserdiscussId() {
        return userdiscussId;
    }

    public void setUserdiscussId(int userdiscussId) {
        this.userdiscussId = userdiscussId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getDiscussId() {
        return discussId;
    }

    public void setDiscussId(int discussId) {
        this.discussId = discussId;
    }

    public Date getUserdiscussDate() {
        return userdiscussDate;
    }

    public void setUserdiscussDate(Date userdiscussDate) {
        this.userdiscussDate = userdiscussDate;
    }
}
