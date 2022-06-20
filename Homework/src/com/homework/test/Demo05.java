package com.homework.test;

/**
 * @projectName: newJavaProject
 * @className: Demo05
 * @author: AaronLi
 * @description: nothing
 * @date: 2022/6/11 16:08
 * @version: JDK17
 */
public class Demo05 {
    public static void main(String[] args) {
        Parent p = new Child();
        System.out.println(p.x);
        System.out.println(p.y);
        p.eat();
        p.sleep();
    }
}
class Parent {
    int x = 100;
    static int y = 200;
    void eat() {
        System.out.println("调用父类的eat()");
    }
    static void sleep() {
        System.out.println("调用父类的sleep()");
    }
}
class Child extends Parent {
    int x = 300;
    static int y = 400;
    void eat() {
        System.out.println("调用子类的eat()");
    }
    static void sleep() {
        System.out.println("调用子类的sleep()");
    }
}

