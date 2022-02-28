package com.experience.day13.java7;
/*
 * @author: Aaron.Li
 * @date: 2022 - 02 - 26 - 上午11:28
 * @project: newJavaProject
 * @version: JDK17.0.2
 */

/**
 * @ClassName Student
 * @Description super关键字的使用，继承Person
 * @Author Aaron-Li
 * @Date 2022 - 02 - 26 - 上午11:28
 * @Version JDK17
 */
public class Student extends Person {
    String major;
    int id = 1002;//学号；

    public Student() {
        //这里默认会有super();无论删不删除，都会存在
    }

    public Student(String major) {
        this.major = major;
    }

    public Student(String major, int age, String name) {
        super(name, age);
        this.major = major;
    }

    public void eat() {
        System.out.println("学生多吃有营养的食物！");
    }

    public void study() {
        System.out.println("学生学习！");
    }

    public void show() {
        System.out.println("name is " + this.name + " age is " + super.age);
        System.out.println("id is " + id);//省略了this.
        System.out.println("super.id is " + super.id);
        eat();
        super.eat();
    }
}
