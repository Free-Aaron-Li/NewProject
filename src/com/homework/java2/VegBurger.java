package com.homework.java2;

/**
 * @projectName: newJavaProject
 * @className: VegBurger
 * @author: AaronLi
 * @description: nothing
 * @date: 2022/6/8 19:46
 * @version: JDK17
 */
public class VegBurger extends Burger{
    @Override
    public String name() {

        return "素食汉堡";
    }

    @Override
    public float price() {

        return 10.5f;
    }
}
