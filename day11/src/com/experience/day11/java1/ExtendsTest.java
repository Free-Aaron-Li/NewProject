package com.experience.day11.java1;
/*
 * @author: Aaron.Li
 * @date: 2022 - 02 - 20 - 下午11:21
 * @project: NewProject
 * @version: JDK17.0.2
 */

/**
 * @ClassName ExtendsTest
 * @Description 继承性的测试
 * @Author Aaron-Li
 * @Date 2022 - 02 - 20 - 下午11:21
 * @Version JDK17
 */

/**
 * 面向对象的特征之二：继承性 why？
 * 一、继承性的好处
 * ①减少了代码的冗余，提高了代码的复用性
 * ②便于功能的扩展
 * ③为之后的多态性提供了前提
 * <p>
 * 二、继承性的格式：class  A extends B{}
 * A:子类、派生类、subclass
 * B:父类、、基类、superclass
 * <p>
 * 2.1体现：一旦子类A继承父类B以后，子类A中就获取了父类B中声明的所有的属性和方法。特别的，父类中声明的private的属性或方法，子类继承父类以后，
 * 仍然认为获取了父类中私有的结构。只因封装性的影响，使得子类不能直接调用父类的结构而已。
 * 2.2 子类继承父类以后，还可以声明自己特有的属性或方法。
 * 子类和父类的关系，不同于子集和集合的关系。
 *
 *三、Java中关于继承性的规定：
 * 1.一个类可以被多个子类继承。
 * 2.Java中类的单继承性：一个类只能有一个父类
 * 3.子父类是相对的概念
 * 4.子类直接继承的父类，称为：直接父类。间接继承的父类称为：间接父类。
 * 5.子类继承父类以后，句获取了直接父类以及间接父类中声明的属性和方法
 */
public class ExtendsTest {
    public static void main(String[] args) {
        Person test = new Person();
        test.age = 20;
        test.name = "Aaron.Li";
        test.eat();

        Student testOne = new Student();
        testOne.age = 21;
        testOne.eat();

    }
}
