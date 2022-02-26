package com.experience.day11.java7;
/*
 * @author: Aaron.Li
 * @date: 2022 - 02 - 26 - 上午11:29
 * @project: newJavaProject
 * @version: JDK17.0.2
 */

/**
 * @ClassName SuperTest
 * @Description super关键字的测试
 * super关键字的使用
 * 1.super:理解为父类的（类比this）
 * 2.super可以用来调用：属性、方法、构造器。
 * 3.super的使用
 * 3.1 我们可以在子类的方法或构造器中，通过使用“super.属性”或“super.方法”的方式，显式的调用父类中声明的属性或方法，但是，通常情况下，我们习惯省略“super.”
 * 3.2 特殊情况：当子类和父类中定义了同名的属性（或方法）时，我们要想在子类调用父类中声明的属性（或方法），则必须显式的使用“super.属性（或方法）”的方式，表明调用的时父类中的属性（或方法）。
 *
 * 4.this和super的区别
 * 使用this先去自己所在的类寻找指定内容，没找到再去父类中寻找。
 * 使用super则是直接去父类中寻找。
 * @Author Aaron-Li
 * @Date 2022 - 02 - 26 - 上午11:29
 * @Version JDK17
 */
public class SuperTest {
    public static void main(String[] args) {
        Student test = new Student();
        test.show();
    }
}
