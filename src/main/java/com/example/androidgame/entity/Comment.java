package com.example.androidgame.entity;

public class Comment {
    int comment_id;
    int user_id;
    int replyto_id;
    String comment_detail;
    String comment_image;

    public int getComment_id() {
        return comment_id;
    }

    public void setComment_id(int comment_id) {
        this.comment_id = comment_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getReplyto_id() {
        return replyto_id;
    }

    public void setReplyto_id(int replyto_id) {
        this.replyto_id = replyto_id;
    }

    public String getComment_detail() {
        return comment_detail;
    }

    public void setComment_detail(String comment_detail) {
        this.comment_detail = comment_detail;
    }

    public String getComment_image() {
        return comment_image;
    }

    public void setComment_image(String comment_image) {
        this.comment_image = comment_image;
    }
}
