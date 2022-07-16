package com.atschool.hdbasicserver.bean;

public class Resource {//资源
    private int id;
    private String town;//镇
    private String village;//村
    private String variety;//资源种类
    private String position;//资源地址
    private int area;//资源面积
    private String charger;//资源负责人

    public Resource() {
    }

    public Resource(int id,String town, String village, String variety, String position, int area, String charger) {
        this.id = id;
        this.town = town;
        this.village = village;
        this.variety = variety;
        this.position = position;
        this.area = area;
        this.charger = charger;
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

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getCharger() {
        return charger;
    }

    public void setCharger(String charger) {
        this.charger = charger;
    }

    @Override
    public String toString() {
        return "Resource{" +
                "id=" + id +
                ", town='" + town + '\'' +
                ", village='" + village + '\'' +
                ", variety='" + variety + '\'' +
                ", position='" + position + '\'' +
                ", area=" + area +
                ", charger='" + charger + '\'' +
                '}';
    }
}
