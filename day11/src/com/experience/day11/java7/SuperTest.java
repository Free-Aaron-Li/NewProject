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
 * super关键字的使用（解决子父类冲突问题）
 * 1.super:理解为父类的（类比this）
 * 2.super可以用来调用：属性、方法、构造器。
 * 3.super的使用（调用属性和方法）
 * 3.1 我们可以在子类的方法或构造器中，通过使用“super.属性”或“super.方法”的方式，显式的调用父类中声明的属性或方法，但是，通常情况下，我们习惯省略“super.”
 * 3.2 特殊情况：当子类和父类中定义了同名的属性（或方法）时，我们要想在子类调用父类中声明的属性（或方法），则必须显式的使用“super.属性（或方法）”的方式，表明调用的时父类中的属性（或方法）。
 * 4.super的使用（调用构造器）
 * 4.1 我们可以在子类的构造器中显式的使用“super（形参列表）”的方式，调用父类中声明的指定的构造器。
 * 4.2 “super（形参列表）”的使用，必须声明在子类构造器的首行。
 * 4.3 我们在类的构造器中，针对“this（形参列表）”或“super（形参列表）”只能二选一。
 * 4.4 在构造器的首行，没有显式的声明“this（形参列表）”或“super（形参列表）”，则默认调用的是父类中空参的构造器，super();
 * 4.5 在类的多个构造其中，至少有一个类的构造器中使用了“super（形参列表）”，调用父类中的构造器。
 * 5.this和super的区别
 * 使用this先去自己所在的类寻找指定内容，没找到再去父类中寻找。
 * 使用super则是直接去父类中寻找。
 * @Author Aaron-Li
 * @Date 2022 - 02 - 26 - 上午11:29
 * @Version JDK17
 */
public class SuperTest {
    public static void main(String[] args) {
        Student test = new Student();
        System.out.println("***************");
        test.show();
        System.out.println("***************");
        Student testOne=new Student("网络工程",20,"Aaron.Li");
        testOne.show();
        System.out.println("*************");
        Student tetTwo = new Student();
    }
}
