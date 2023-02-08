package com.example.user_managment.Model;

public class User {
    private Integer user_id;
    private String name;
    private String username;
    private String Adress;
    private String phonenumber;

    public User(Integer user_id, String name, String username, String adress, String phonenumber) {
        this.user_id = user_id;
        this.name = name;
        this.username = username;
        Adress = adress;
        this.phonenumber = phonenumber;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String adress) {
        Adress = adress;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", Adress='" + Adress + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                '}';
    }
}
