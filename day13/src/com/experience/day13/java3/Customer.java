package com.experience.day13.java3;

/*
 * @author: Aaron.Li
 * @date: 2022 - 03 - 02 - 下午9:56
 * @project: NewProject
 * @version: JDK17.0.2
 */
/*
 * @ClassName Customer
 * @Description
 * @Author Aaron-Li
 * @Date 2022 - 03 - 02 - 下午9:56
 * @Version
 */
public class Customer {
    private String name;
    private int age;

    public Customer() {
    }

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
