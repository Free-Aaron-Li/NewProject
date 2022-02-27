package com.experience.day12.java1;
/*
 * @author: Aaron.Li
 * @date: 2022 - 02 - 27 - 下午1:13
 * @project: newJavaProject
 * @version: JDK17.0.2
 */

/**
 * @ClassName Man
 * @Description Person子类 多态性
 * @Author Aaron-Li
 * @Date 2022 - 02 - 27 - 下午1:13
 * @Version JDK17
 */
public class Man extends Person{
    boolean isSmoking;
    public void earnMoney(){
        System.out.println("负责挣钱!");
    }
    public void eat(){
        System.out.println("多吃肉!");
    }
    public void walk(){
        System.out.println("霸气走路！");
    }
}
