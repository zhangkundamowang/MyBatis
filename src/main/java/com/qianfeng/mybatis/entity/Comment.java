package com.qianfeng.mybatis.entity;

/**
 *
 */



public class Comment {
    private int  comment_id;
    private String  time;
    private int stars;
    private String content;
    private int user_id;
    private int nanny_id;
    /*配置评论的用户对象*/
    private User user;
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

    public Comment() {
    }

    public Comment(int comment_id, String time, int stars, String content, int user_id, int nanny_id) {
        this.comment_id = comment_id;
        this.time = time;
        this.stars = stars;
        this.content = content;
        this.user_id = user_id;
        this.nanny_id = nanny_id;
    }

    public int getComment_id() {
        return comment_id;
    }

    public void setComment_id(int comment_id) {
        this.comment_id = comment_id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getNanny_id() {
        return nanny_id;
    }

    public void setNanny_id(int nanny_id) {
        this.nanny_id = nanny_id;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "comment_id=" + comment_id +
                ", time='" + time + '\'' +
                ", stars=" + stars +
                ", content='" + content + '\'' +
                ", user_id=" + user_id +
                ", nanny_id=" + nanny_id +
                '}';
    }
}
