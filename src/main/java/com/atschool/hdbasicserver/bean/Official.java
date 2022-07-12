package com.atschool.hdbasicserver.bean;

import java.util.Objects;

public class Official {
    private String username;
    private String password;
    private String position;

    public Official() {
    }

    public Official(String username, String password, String position) {
        this.username = username;
        this.password = password;
        this.position = position;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Official{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", position='" + position + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Official official = (Official) o;
        return Objects.equals(username, official.username) &&
                Objects.equals(password, official.password) &&
                Objects.equals(position, official.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password, position);
    }
}
