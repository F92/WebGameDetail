package com.example.androidgame.entity;

public class Comment {
    int commentId;
    int discussId;
    int userId;
    int replytoId;
    int rcommentId;
    String commentDetail;
    String commentImage;


    public int getRcommentId() {
        return rcommentId;
    }

    public void setRcommentId(int rcommentId) {
        this.rcommentId = rcommentId;
    }

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

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

    public int getReplytoId() {
        return replytoId;
    }

    public void setReplytoId(int replytoId) {
        this.replytoId = replytoId;
    }

    public String getCommentDetail() {
        return commentDetail;
    }

    public void setCommentDetail(String commentDetail) {
        this.commentDetail = commentDetail;
    }

    public String getCommentImage() {
        return commentImage;
    }

    public void setCommentImage(String commentImage) {
        this.commentImage = commentImage;
    }
}
