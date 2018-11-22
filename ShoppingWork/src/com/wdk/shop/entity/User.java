package com.wdk.shop.entity;

public class User {
    private String userId;
    private String userName;
    private String password;
    private String sex;
    private  String birthday;
    private String code;
    private String email;
    private String mobile;
    private String address;
    private int status;

    public User(String userId,String userName,String password,String sex,
                String birthday,String code,String email,String mobile,String address ,int status){
        this.userId=userId;
        this.userName=userName;
        this.password=password;
        this.sex=sex;
        this.birthday=birthday;
        this.code=code;
        this.email=email;
        this.mobile=mobile;
        this.address=address;
        this.status=status;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
