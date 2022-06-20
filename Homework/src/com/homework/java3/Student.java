package com.homework.java3;

/**
 * @projectName: newJavaProject
 * @className: Student
 * @author: AaronLi
 * @description: nothing
 * @date: 2022/6/8 20:38
 * @version: JDK17
 */
public class Student extends Person {
    String sno;

    Student(String id, String name, String sno) {
        super(id, name);
        this.sno = sno;
    }

    public void study() {
        System.out.println("I am Student,I am studying");
    }

    public void eat() {
        System.out.println("I am Student");
        System.out.println("id:" + id);
        System.out.println("name:" + name);
        System.out.println("sno:" + sno);
        System.out.println("eating ..........");
    }

    public String toString() {
        return "Student " + "ID:" + this.id
                + " Name:" + this.name
                + " SNo:" + this.sno;
    }
}
