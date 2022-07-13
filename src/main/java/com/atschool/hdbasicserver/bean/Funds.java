package com.atschool.hdbasicserver.bean;

public class Funds {
    private String town;
    private String village;
    private int account;
    private int realAccount;
    private boolean available;
    private String comment;
    private String accountant;
    private String functionary;

    public Funds() {
    }

    public Funds(String town, String village, int account, int realAccount, boolean available, String comment, String accountant, String functionary) {
        this.town = town;
        this.village = village;
        this.account = account;
        this.realAccount = realAccount;
        this.available = available;
        this.comment = comment;
        this.accountant = accountant;
        this.functionary = functionary;
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
                "town='" + town + '\'' +
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
