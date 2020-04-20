package com.example.androidgame.entity;

import java.util.Date;

public class Userartical {
    int userartical_id;
    int user_id;
    int artical_id;
    Date userartical_date;

    public int getUserartical_id() {
        return userartical_id;
    }

    public void setUserartical_id(int userartical_id) {
        this.userartical_id = userartical_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getArtical_id() {
        return artical_id;
    }

    public void setArtical_id(int artical_id) {
        this.artical_id = artical_id;
    }

    public Date getUserartical_date() {
        return userartical_date;
    }

    public void setUserartical_date(Date userartical_date) {
        this.userartical_date = userartical_date;
    }
}
