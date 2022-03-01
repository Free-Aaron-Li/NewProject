package com.experience.project.project01.bean;
/*
 * @author: Aaron.Li
 * @date: 2022 - 02 - 13 - 下午10:26
 * @project: untitled1
 * @version: JDK17.0.2
 */

/**
 * @ClassName Customer
 * @Description Customer为实体对象，用来封装客户信息
 * @Author Aaron-Li
 * @Date 2022 - 02 - 13 - 下午10:26
 * @Version JDK17
 */
public class Customer {
    private String name;      //客户信息
    private char gender;      //性别
    private int age;          //年龄
    private String phone;     //电话号码
    private String email;     //电子邮箱

    public Customer(String name, char gender, int age, String phone, String email) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.phone = phone;
        this.email = email;
    }

    public Customer() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }



    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public Customer(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
