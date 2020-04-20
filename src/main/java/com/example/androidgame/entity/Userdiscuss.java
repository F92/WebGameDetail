package com.example.androidgame.entity;

import java.util.Date;

public class Userdiscuss {
    int userdiscuss_id;
    int user_id;
    int discuss_id;
    Date userdiscuss_date;

    public int getUserdiscuss_id() {
        return userdiscuss_id;
    }

    public void setUserdiscuss_id(int userdiscuss_id) {
        this.userdiscuss_id = userdiscuss_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getDiscuss_id() {
        return discuss_id;
    }

    public void setDiscuss_id(int discuss_id) {
        this.discuss_id = discuss_id;
    }

    public Date getUserdiscuss_date() {
        return userdiscuss_date;
    }

    public void setUserdiscuss_date(Date userdiscuss_date) {
        this.userdiscuss_date = userdiscuss_date;
    }
}
