package com.stackroute.exercise1;


public class User {

    private String name;
    private int userid;

    public User(int userid, String name) {
        this.name = name;
        this.userid = userid;
        System.out.println("user constructor called");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

}
