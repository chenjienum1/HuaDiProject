package com.atschool.hdbasicserver.bean;

import java.sql.Date;

public class Project {
    private int id;
    private String town;
    private String village;
    private String company;//负责公司
    private int area;//面积
    private int cost;//工程造价
    private Date startTime;//开工日期
    private Date completeTime;//竣工日期
    private String manager;//项目负责人

    public Project() {
    }

    public Project(int id,String town, String village, String company, int area, int cost, String startTime, String completeTime, String manager) {
        this.id = id;
        this.town = town;
        this.village = village;
        this.company = company;
        this.area = area;
        this.cost = cost;
        this.startTime = java.sql.Date.valueOf(startTime);
        this.completeTime = java.sql.Date.valueOf(completeTime);
        this.manager = manager;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getCompleteTime() {
        return completeTime;
    }

    public void setCompleteTime(Date completeTime) {
        this.completeTime = completeTime;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", town='" + town + '\'' +
                ", village='" + village + '\'' +
                ", company='" + company + '\'' +
                ", area=" + area +
                ", cost=" + cost +
                ", startTime=" + startTime +
                ", completeTime=" + completeTime +
                ", manager='" + manager + '\'' +
                '}';
    }
}
