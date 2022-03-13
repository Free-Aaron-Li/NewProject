package com.experience.day13.java3;
/*
 * @author: Aaron.Li
 * @date: 2022 - 02 - 24 - 下午8:31
 * @project: newJavaProject
 * @version: JDK17.0.2
 */

/**
 * @ClassName CylinderTest
 * @Description java3测试类
 * @Author Aaron-Li
 * @Date 2022 - 02 - 24 - 下午8:31
 * @Version JDK17
 */
public class CylinderTest {
    public static void main(String[] args) {
        Cylinder test=new Cylinder();
        double volume=test.findVolume();
        System.out.println("圆柱体积为："+volume);
    }
}
