package com.atschool.hdbasicserver.bean;

import java.util.Date;

public class Affair {

    private String title;

    private Date time;

    private String picture;

    private String content;

    public Affair(){

    }



    public Affair(String title, String time, String picture, String content) {
        this.title = title;
        this.picture = picture;
        this.content = content;
        this.time = java.sql.Date.valueOf(time);
    }

    public String getTitle() {
        return title;
    }

    public Date getTime() {
        return time;
    }

    public String getPicture() {
        return picture;
    }

    public String getContent() {
        return content;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Affair{" +
                "title='" + title + '\'' +
                ", time=" + time +
                ", picture='" + picture + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
