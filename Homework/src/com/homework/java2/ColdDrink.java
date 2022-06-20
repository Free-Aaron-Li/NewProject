package com.homework.java2;

/**
 * @projectName: newJavaProject
 * @className: ColdDrink
 * @author: AaronLi
 * @description: nothing
 * @date: 2022/6/8 19:44
 * @version: JDK17
 */
public class ColdDrink implements Item {
    @Override
    public String name() {
        return "ColdDrink";
    }

    @Override
    public float price() {
        return 3.5f;
    }

    @Override
    public Packing packing() {
        return new Bottle();
    }
}
