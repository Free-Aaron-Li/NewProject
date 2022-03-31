package com.exercise.day14;

/**
 * @projectName: newJavaProject
 * @className: SingletonTestOne
 * @author: AaronLi
 * @description: 单例设计模式：
 * 1.所谓单例设计模式，就是采取一定的方法保证在整个软件系统中，对某个类只能存在一个对象实例。
 *
 * 2.如何实现？
 * 饿汉式VS懒汉式
 *
 * 3.区分饿汉式和懒汉式
 * 饿汉式：
 *      坏处：对象加载时间过长。
 *      好处：饿汉式天然就是线程安全的.
 * 懒汉式：
 *      好处，延长对象的创建。
 *      坏处：目前写法坏处，线程不安全。--->到多线程内容时，再修改。
 * @date: 2022/3/30 21:11
 * @version: JDK17
 */
public class SingletonTestOne {
    public static void main(String[] args) {
        Bank testOne = Bank.getInstance();
        Bank testTwo = Bank.getInstance();
    }
}

//饿汉式
class Bank
{
    //1.私有化类的构造器
    private Bank() {
    }

    //2.内部创建类的对象
    //4.要求此对象也必须时static的
    private static Bank instance = new Bank();

    //3.提供公共方法，提供类的对象
    public static Bank getInstance() {
        return instance;
    }
}
