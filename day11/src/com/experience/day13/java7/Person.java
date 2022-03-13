package com.experience.day13.java7;
/*
 * @author: Aaron.Li
 * @date: 2022 - 02 - 26 - 上午11:28
 * @project: newJavaProject
 * @version: JDK17.0.2
 */

/**
 * @ClassName Person
 * @Description super关键字的使用
 * @Author Aaron-Li
 * @Date 2022 - 02 - 26 - 上午11:28
 * @Version JDK17
 */
public class Person {
    String name="Aaron";
    int age;
    int id = 1001;//身份证号

    public Person() {
        System.out.println("我无处不在!");
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("人吃饭！");
    }

    public void walk() {
        System.out.println("人走路！");
    }
}
