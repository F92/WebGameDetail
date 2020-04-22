package com.example.androidgame.entity;

public class Comment {
    int commentId;
    int userId;
    int replytoId;
    String commentDetail;
    String commentImage;

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
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
