package com.example.androidgame.entity;

import java.util.Date;

public class Game {
    int game_id;
    String game_name;
    String game_introduce;
    String game_detail;
    String game_price;
    Date game_date;

    public int getGame_id() {
        return game_id;
    }

    public void setGame_id(int game_id) {
        this.game_id = game_id;
    }

    public String getGame_name() {
        return game_name;
    }

    public void setGame_name(String game_name) {
        this.game_name = game_name;
    }

    public String getGame_introduce() {
        return game_introduce;
    }

    public void setGame_introduce(String game_introduce) {
        this.game_introduce = game_introduce;
    }

    public String getGame_detail() {
        return game_detail;
    }

    public void setGame_detail(String game_detail) {
        this.game_detail = game_detail;
    }

    public String getGame_price() {
        return game_price;
    }

    public void setGame_price(String game_price) {
        this.game_price = game_price;
    }

    public Date getGame_date() {
        return game_date;
    }

    public void setGame_date(Date game_date) {
        this.game_date = game_date;
    }
}
