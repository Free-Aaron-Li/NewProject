package com.homework.java2;

/**
 * @projectName: newJavaProject
 * @className: ChickenBurger
 * @author: AaronLi
 * @description: nothing
 * @date: 2022/6/8 19:42
 * @version: JDK17
 */
public class ChickenBurger extends Burger{
    @Override
    public String name() {

        return "鸡肉汉堡";
    }

    @Override
    public float price() {

        return 14.0f;
    }
}
