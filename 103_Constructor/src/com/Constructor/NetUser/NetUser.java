package com.Constructor.NetUser;

public class NetUser {
    private String id;
    private String pwd;
    private String email;

    public NetUser() {
        id = "NetUser001";
        pwd = "123456";
        email = id + "@jerome.com";
    }

    public NetUser(String id) {
        this.id = id;
        pwd = "123456";
        email = id + "@jerome.com";
    }

    public NetUser(String id, String pwd) {
        this.id = id;
        this.pwd = pwd;
        email = id + "@jerome.com";
    }



}
