package com.qianfeng.mybatis.entity;


import java.io.Serializable;
import java.util.List;


public class User implements Serializable {

  private long userId;
  private String username;
  private String realname;
  private String address;
  private String tel;
  private String pic;
//用户的评论集合
  private List<Comment> comments;

  public List<Comment> getComments() {
    return comments;
  }
  public void setComments(List<Comment> comments) {
    this.comments = comments;
  }

  public User(long userId, String username, String realname, String address, String tel, String pic) {
    this.userId = userId;
    this.username = username;
    this.realname = realname;
    this.address = address;
    this.tel = tel;
    this.pic = pic;
  }

  public User() {
  }

  @Override
  public String toString() {
    return "User{" +
            "userId=" + userId +
            ", username='" + username + '\'' +
            ", realname='" + realname + '\'' +
            ", address='" + address + '\'' +
            ", tel='" + tel + '\'' +
            ", pic='" + pic + '\'' +
            '}';
  }

  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public String getRealname() {
    return realname;
  }

  public void setRealname(String realname) {
    this.realname = realname;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public String getTel() {
    return tel;
  }

  public void setTel(String tel) {
    this.tel = tel;
  }


  public String getPic() {
    return pic;
  }

  public void setPic(String pic) {
    this.pic = pic;
  }

}
