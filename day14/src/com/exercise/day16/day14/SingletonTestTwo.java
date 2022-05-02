package com.exercise.day16.day14;

/**
 * @projectName: newJavaProject
 * @className: SingletonTestTwo
 * @author: AaronLi
 * @description: 单例模式的懒汉式实现
 * @date: 2022/3/31 17:43
 * @version: JDK17
 */
public class SingletonTestTwo {
    public static void main(String[] args) {
        double[] a = new double[100];
        Order testOne = Order.instance;
        Order testTwo = Order.instance;
        System.out.println(testOne == testTwo);
    }

}

//懒汉式
class Order {
    //1.私有化类的构造器
    private Order() {
    }

    //2.声明当前类对象，没有初始化
    public static final Order instance = null;//记住加上final，否则会导致该类既可以调用，又可以修改。
}
