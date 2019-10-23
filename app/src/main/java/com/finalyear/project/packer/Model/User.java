package com.finalyear.project.packer.Model;

public class User {
    private String email, password, name, phone, avatarUrl, avatarUrl2, Pdis, Pname, Hprice;

    public User() {
    }

    public User(String email, String password, String name, String phone, String avatarUrl, String avatarUrl2, String pdis, String pname, String hprice) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.phone = phone;
        this.avatarUrl = avatarUrl;
        this.avatarUrl2 = avatarUrl2;
        Pdis = pdis;
        Pname = pname;
        Hprice = hprice;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getAvatarUrl2() {
        return avatarUrl2;
    }

    public void setAvatarUrl2(String avatarUrl2) {
        this.avatarUrl2 = avatarUrl2;
    }

    public String getPdis() {
        return Pdis;
    }

    public void setPdis(String pdis) {
        Pdis = pdis;
    }

    public String getPname() {
        return Pname;
    }

    public void setPname(String pname) {
        Pname = pname;
    }

    public String getHprice() {
        return Hprice;
    }

    public void setHprice(String hprice) {
        Hprice = hprice;
    }
}
