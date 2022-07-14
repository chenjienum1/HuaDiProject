package com.atschool.hdbasicserver.bean;

import java.sql.Date;

public class Property {//资产
    private String town;//镇
    private String village;//村
    private String name;//资产名称
    private String unit;//资产单位
    private int amount;//数量
    private int jinZhi;//资产净值
    private Date time;//购置时间
    private String principal;//资产负责人

    public Property() {
    }

    public Property(String town, String village, String name, String unit, int amount, int jinZhi, String time, String principal) {
        this.town = town;
        this.village = village;
        this.name = name;
        this.unit = unit;
        this.amount = amount;
        this.jinZhi = jinZhi;
        this.time = java.sql.Date.valueOf(time);
        this.principal = principal;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getJinZhi() {
        return jinZhi;
    }

    public void setJinZhi(int jinZhi) {
        this.jinZhi = jinZhi;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    @Override
    public String toString() {
        return "property{" +
                "town='" + town + '\'' +
                ", village='" + village + '\'' +
                ", name='" + name + '\'' +
                ", unit='" + unit + '\'' +
                ", amount=" + amount +
                ", jinZhi=" + jinZhi +
                ", time=" + time +
                ", principal='" + principal + '\'' +
                '}';
    }
}
