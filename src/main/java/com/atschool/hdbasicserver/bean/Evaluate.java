package com.atschool.hdbasicserver.bean;

import java.util.Date;

public class Evaluate {

    private String title;

    private String kind;

    private Integer satisfaction;

    private Date time;

    private String evaluate;

    public Evaluate() {
    }

    public Evaluate(String title, String kind, Integer satisfaction, String time, String evaluate) {
        this.title = title;
        this.kind = kind;
        this.satisfaction = satisfaction;
        this.evaluate = evaluate;
        this.time = java.sql.Date.valueOf(time);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Integer getSatisfaction() {
        return satisfaction;
    }

    public void setSatisfaction(Integer satisfaction) {
        this.satisfaction = satisfaction;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getEvaluate() {
        return evaluate;
    }

    public void setEvaluate(String evaluate) {
        this.evaluate = evaluate;
    }

    @Override
    public String toString() {
        return "Evaluate{" +
                "title='" + title + '\'' +
                ", kind='" + kind + '\'' +
                ", satisfaction=" + satisfaction +
                ", time=" + time +
                ", evaluate='" + evaluate + '\'' +
                '}';
    }
}
