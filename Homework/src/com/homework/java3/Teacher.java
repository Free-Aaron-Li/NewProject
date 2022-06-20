package com.homework.java3;

/**
 * @projectName: newJavaProject
 * @className: Teacher
 * @author: AaronLi
 * @description: nothing
 * @date: 2022/6/8 20:39
 * @version: JDK17
 */
public class Teacher extends Person {
    String tid;

    Teacher(String id, String name, String tid) {
        super(id, name);
        this.tid = tid;
    }

    public void tech() {
        System.out.println("I am Student,I am taching");
    }

    public void eat() {
        System.out.println("I am Teacher");
        System.out.println("id:" + id);
        System.out.println("name:" + name);
        System.out.println("tid:" + tid);
        System.out.println("eating ..........");
    }

    public String toString() {
        return "Teacher " + "ID:" + this.id
                + " Name:" + this.name
                + " Tid:" + this.tid;
    }
}
