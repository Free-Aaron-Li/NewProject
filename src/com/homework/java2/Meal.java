package com.homework.java2;

import java.util.ArrayList;
import java.util.List;

/**
 * @projectName: newJavaProject
 * @className: Meal
 * @author: AaronLi
 * @description: nothing
 * @date: 2022/6/8 19:39
 * @version: JDK17
 */
public class Meal {
    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item) {
        items.add(item);
    }

    public void showItems() {
        for (Item item : items) {
            System.out.print("Item name is : " + item.name() +
                    ", Packing is : " + item.packing().pack() + ", Price is : " + item.price()+"\n");
        }
    }

    public float getCost() {
        float num = 0.0f;
        for (Item item : items) {
            num += item.price();
        }
        return num;
    }
}
