package com.exercise.day14;

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

        Order testOne = Order.getInstance();
        Order testTwo = Order.getInstance();
        System.out.println(testOne == testTwo);
    }

}

class Order {
    //1.私有化类的构造器
    private Order() {
    }

    //2.声明当前类对象，没有初始化
    private static Order instance = null;

    //3.声明public、static的返回当前类对象的方法
    public static Order getInstance() {
        if (instance == null) {
            instance = new Order();
        }
        return instance;
    }
}
