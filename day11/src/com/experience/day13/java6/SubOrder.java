package com.experience.day13.java6;
/*
 * @author: Aaron.Li
 * @date: 2022 - 02 - 26 - 上午11:13
 * @project: newJavaProject
 * @version: JDK17.0.2
 */

import com.experience.day13.java5.Order;

/**
 * @ClassName SubOrder
 * @Description 不同包下测试权限修饰符
 * @Author Aaron-Li
 * @Date 2022 - 02 - 26 - 上午11:13
 * @Version JDK17
 */
public class SubOrder extends Order {
    public void method(){
        orderPublic=1;
        orderProtected=2;
        methodProtected();
        methodPublic();
        //在不同包的子类中，不能调用Order类中声明为private和缺省的属性和方法；
        //orderDefault=2;
    }
}
