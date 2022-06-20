package com.homework.java3;

/**
 * @projectName: newJavaProject
 * @className: Person
 * @author: AaronLi
 * @description: nothing
 * @date: 2022/6/8 20:37
 * @version: JDK17
 */
public class Person {
    String id;
    String name;

    Person(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void sleep() {
        System.out.println("I am Person,I am sleeping");
    }

    public void eat() {
        System.out.println("I am Person,I am eating");
    }
}
