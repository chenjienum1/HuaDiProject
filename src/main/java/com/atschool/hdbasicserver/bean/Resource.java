package com.atschool.hdbasicserver.bean;

public class Resource {
    private String town;
    private String village;
    private String variety;
    private String position;
    private int area;
    private String charger;

    public Resource() {
    }

    public Resource(String town, String village, String variety, String position, int area, String charger) {
        this.town = town;
        this.village = village;
        this.variety = variety;
        this.position = position;
        this.area = area;
        this.charger = charger;
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
                "town='" + town + '\'' +
                ", village='" + village + '\'' +
                ", variety='" + variety + '\'' +
                ", position='" + position + '\'' +
                ", area=" + area +
                ", charger='" + charger + '\'' +
                '}';
    }
}
