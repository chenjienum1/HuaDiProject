package com.atschool.hdbasicserver.bean;

import java.util.Date;

public class Hotspot {//热点

    private  int id;
    private String title;//标题

    private Date time;//时间

    private String laiyuan;//图片

    private String content;//内容

    public Hotspot(){

    }


    public Hotspot(String title, String time, String laiyuan, String content){
        this.title = title;
        this.laiyuan = laiyuan;
        this.content = content;
        this.time = java.sql.Date.valueOf(time);
    }


    public String getTitle() {
        return title;
    }

    public Date getTime() {
        return time;
    }

    public String getlaiyuan() {
        return laiyuan;
    }

    public String getContent() {
        return content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public void setlaiyuan(String laiyuan) {
        this.laiyuan = laiyuan;
    }

    public void setContent(String content) {
        this.content = content;
    }


    @Override
    public String toString() {
        return "Hotspot{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", time=" + time +
                ", laiyuan='" + laiyuan + '\'' +
                ", content='" + content + '\'' +
                '}';
    }


}
