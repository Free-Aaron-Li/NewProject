package com.homework.java2;

/**
 * @projectName: newJavaProject
 * @className: Burger
 * @author: AaronLi
 * @description: nothing
 * @date: 2022/6/8 19:36
 * @version: JDK17
 */
public class Burger implements Item {
    public String name() {
        return "Burger";
    }

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public float price() {
        return 14.0f;
    }

}
