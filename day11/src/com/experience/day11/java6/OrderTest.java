package com.experience.day11.java6;
/*
 * @author: Aaron.Li
 * @date: 2022 - 02 - 26 - 上午11:18
 * @project: newJavaProject
 * @version: JDK17.0.2
 */

import com.experience.day11.java5.Order;

/**
 * @ClassName OrderTest
 * @Description 不同包下测试权限修饰符
 * @Author Aaron-Li
 * @Date 2022 - 02 - 26 - 上午11:18
 * @Version JDK17
 */
public class OrderTest {
    public static void main(String[] args) {
        Order order=new Order();
        order.orderPublic=2;
        order.methodPublic();
        //不同包下的普通类（非子类），不可以调用private、缺省、protected的方法和属性。
//        order.orderProtected;
//        order.methodProtected();
    }
}
