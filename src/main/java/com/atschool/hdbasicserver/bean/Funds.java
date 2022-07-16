package com.atschool.hdbasicserver.bean;

public class Funds {//资金
    private int id;
    private String town;//镇
    private String village;//村
    private int account;//金额
    private int realAccount;//实际金额
    private boolean available;//是否符合
    private String comment;//原因
    private String accountant;//财务负责人
    private String functionary;//乡镇负责人

    public Funds() {
    }

    public Funds(int id,String town, String village, int account, int realAccount, boolean available, String comment, String accountant, String functionary) {
        this.id = id;
        this.town = town;
        this.village = village;
        this.account = account;
        this.realAccount = realAccount;
        this.available = available;
        this.comment = comment;
        this.accountant = accountant;
        this.functionary = functionary;
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

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public int getRealAccount() {
        return realAccount;
    }

    public void setRealAccount(int realAccount) {
        this.realAccount = realAccount;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getAccountant() {
        return accountant;
    }

    public void setAccountant(String accountant) {
        this.accountant = accountant;
    }

    public String getFunctionary() {
        return functionary;
    }

    public void setFunctionary(String functionary) {
        this.functionary = functionary;
    }

    @Override
    public String toString() {
        return "Funds{" +
                "id=" + id +
                ", town='" + town + '\'' +
                ", village='" + village + '\'' +
                ", account=" + account +
                ", realAccount=" + realAccount +
                ", available=" + available +
                ", comment='" + comment + '\'' +
                ", accountant='" + accountant + '\'' +
                ", functionary='" + functionary + '\'' +
                '}';
    }
}
