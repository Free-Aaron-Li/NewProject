package com.homework.java2;

/**
 * @projectName: newJavaProject
 * @className: Pepsi
 * @author: AaronLi
 * @description: nothing
 * @date: 2022/6/8 19:45
 * @version: JDK17
 */
public class Pepsi extends ColdDrink{
    @Override
    public String name() {
        return "百事可乐";
    }
    @Override
    public float price() {
        return 3.5f;
    }
}
