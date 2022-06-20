package com.homework.java2;

/**
 * @projectName: newJavaProject
 * @className: Cock
 * @author: AaronLi
 * @description: nothing
 * @date: 2022/6/8 19:43
 * @version: JDK17
 */
public class Cock extends ColdDrink{
    @Override
    public String name() {
        return "可口可乐";
    }

    @Override
    public float price() {
        return 3.5f;
    }
}
