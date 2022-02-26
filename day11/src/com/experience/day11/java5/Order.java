package com.experience.day11.java5;
/*
 * @author: Aaron.Li
 * @date: 2022 - 02 - 26 - 上午10:56
 * @project: newJavaProject
 * @version: JDK17.0.2
 */

/**
 * @ClassName Order
 * @Description 体会4中不同的权限修饰符
 * @Author Aaron-Li
 * @Date 2022 - 02 - 26 - 上午10:56
 * @Version JDK17
 */
public class Order {
    private int orderPrivate;
    int orderDefault;
    protected int orderProtected;
    public int orderPublic;
    private void methodPrivate(){
        orderPrivate=1;
        orderDefault=2;
        orderProtected=3;
        orderPublic=4;
    }
    void methodDefault(){
        orderPrivate=1;
        orderDefault=2;
        orderProtected=3;
        orderPublic=4;
    }
    protected void methodProtected(){
        orderPrivate=1;
        orderDefault=2;
        orderProtected=3;
        orderPublic=4;
    }
    public void methodPublic(){
        orderPrivate=1;
        orderDefault=2;
        orderProtected=3;
        orderPublic=4;
    }
}
