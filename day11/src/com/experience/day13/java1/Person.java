package com.experience.day13.java1;
/*
 * @author: Aaron.Li
 * @date: 2022 - 02 - 20 - 下午11:15
 * @project: NewProject
 * @version: JDK17.0.2
 */

/**
 * @ClassName Person
 * @Description 继承性的理解
 * @Author Aaron-Li
 * @Date 2022 - 02 - 20 - 下午11:15
 * @Version JDK17
 */
public class Person extends Creature{
    String name;
    int age;

    public Person() {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void eat(){
        System.out.println("吃饭!");
    }
    public void sleep(){
        System.out.println("睡觉！");
    }
}
