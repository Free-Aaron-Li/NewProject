package com.experience.day11.java1;
/*
 * @author: Aaron.Li
 * @date: 2022 - 02 - 20 - 下午11:18
 * @project: NewProject
 * @version: JDK17.0.2
 */

/**
 * @ClassName Student
 * @Description
 * @Author Aaron-Li
 * @Date 2022 - 02 - 20 - 下午11:18
 * @Version
 */
public class Student extends Person{
    String name;
    //int age;
    String major;

    public Student(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
    }

    public Student() {

    }

    public void eat() {
        System.out.println("吃饭！");
    }

    public void sleep() {
        System.out.println("睡觉！");
    }
    public void studying() {
        System.out.println("学习！");
    }
}
