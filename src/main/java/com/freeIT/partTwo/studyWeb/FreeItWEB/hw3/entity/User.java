package com.freeIT.partTwo.studyWeb.FreeItWEB.hw3.entity;

public class User {

    private String name;
    private String login;
    private int id;
    private String password;

    public User(String name, String login, int id, String password) {
        this.name = name;
        this.login = login;
        this.id = id;
        this.password = password;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", login='" + login + '\'' +
                ", id=" + id +
                ", password='" + password + '\'' +
                '}';
    }
}
