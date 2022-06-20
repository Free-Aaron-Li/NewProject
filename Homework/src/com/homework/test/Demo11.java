package com.homework.test;

/**
 * @projectName: newJavaProject
 * @className: Demo11
 * @author: AaronLi
 * @description: nothing
 * @date: 2022/6/11 16:13
 * @version: JDK17
 */
public class Demo11 {
    public static void main(String[] args) {
        School school=new School();
        school.print(school);
        school.print(new Teacher());
    }

}
interface Introduceable {
    public String detail();
}
class Teacher implements Introduceable {
    @Override
    public String detail() {
        return "I am a teacher";
    }
}
class Printer {
    public void print(String content) {
        System.out.print("print:");
        System.out.println(content);
    }
}
class School implements Introduceable {
    private Printer printer = new Printer();

    public void print(Introduceable intro) {
        printer.print(intro.detail());
    }
    @Override
    public String detail() {
        return "This is a school";
    }
}
