package com.exercise.day14;

/**
 * @projectName: newJavaProject
 * @className: OrderTest
 * @author: AaronLi
 * @description: 赋值操作执行顺序
 * ①默认初始化
 * ②显式初始化/⑤在代码块中赋值(根据二者赋值的前后顺序做判断）
 * ③构造器中促使化
 * ④有了对象以后，可以通过“对象.属性”或“对象.方法"的方式进行赋值
 * 执行顺序：① - ②/⑤ - ③ - ④
 * @date: 2022/4/3 13:25
 * @version: JDK17
 */
public class OrderTest {
    public static void main(String[] args) {
        OrderOne ordertest = new OrderOne();
        System.out.println(ordertest.orderId);
        System.out.println(ordertest.testOne());
        System.out.println("******");
        ordertest.test();
        System.out.println(ordertest.orderId);
    }
}

class OrderOne {

    public OrderOne() {
        orderId = 5;
    }

    int orderId = 3;//显式赋值

    {
        orderId = 4;//代码块中赋值
    }

    public void test() {
        orderId = 6;
    }
    public int testOne(){
        return orderId=7;
    }
}
