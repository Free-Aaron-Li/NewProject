package com.experience.day11.java2;
/*
 * @author: Aaron.Li
 * @date: 2022 - 02 - 24 - 下午8:06
 * @project: newJavaProject
 * @version: JDK17.0.2
 */

/**
 * @ClassName KidTest
 * @Description java2项目测试
 * 定义类KidsTest,在类的main方法中实例化Kids的对象someKids,用该对象访问其父类的变量和方法
 * @Author Aaron-Li
 * @Date 2022 - 02 - 24 - 下午8:06
 * @Version JDK17
 */
public class KidTest {
    public static void main(String[] args) {
        Kids someKids = new Kids(12);
        someKids.printAge();
        someKids.setYearsOld(12);
        someKids.setSalary(100);
        someKids.setSex(1);
        someKids.manOrWoman();
    }
}
