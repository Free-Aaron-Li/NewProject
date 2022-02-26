package com.experience.day11.java5;
/*
 * @author: Aaron.Li
 * @date: 2022 - 02 - 26 - 上午11:01
 * @project: newJavaProject
 * @version: JDK17.0.2
 */

/**
 * @ClassName OrderTest
 * @Description 权限修饰符测试
 * @Author Aaron-Li
 * @Date 2022 - 02 - 26 - 上午11:01
 * @Version JDK17
 */
public class OrderTest {
    public static void main(String[] args) {
        Order order=new Order();
        order.orderDefault=1;
        order.orderProtected=2;
        order.orderPublic=3;
        order.methodDefault();
        order.methodProtected();
        order.methodPublic();
        //同一个包中的其他类，不能调用私有类的属性和方法
//        order.orderPrivate=4;
//        order.methodPrivate();
    }
}
