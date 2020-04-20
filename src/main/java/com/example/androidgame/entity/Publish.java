package com.example.androidgame.entity;

import java.util.Date;

public class Publish {
    int publish_id;
    int user_id;
    int game_id;
    Date publish_date;

    public int getPublish_id() {
        return publish_id;
    }

    public void setPublish_id(int publish_id) {
        this.publish_id = publish_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getGame_id() {
        return game_id;
    }

    public void setGame_id(int game_id) {
        this.game_id = game_id;
    }

    public Date getPublish_date() {
        return publish_date;
    }

    public void setPublish_date(Date publish_date) {
        this.publish_date = publish_date;
    }
}
