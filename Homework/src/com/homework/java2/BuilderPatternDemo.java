package com.homework.java2;

/**
 * @projectName: newJavaProject
 * @className: BuilderPatternDemo
 * @author: AaronLi
 * @description: nothing
 * @date: 2022/6/8 19:40
 * @version: JDK17
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {
        //创建对象
        MealBuilder mealBuilder = new MealBuilder();

        //准备素食套餐
        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("This is VegMeal");
        vegMeal.showItems();
        System.out.println("Package price is  " +vegMeal.getCost()+"\n");

        //准备荤套餐
        Meal nonVegMeal = mealBuilder.prepareChickenVegMeal();
        System.out.println("This is NonVegMeal");
        nonVegMeal.showItems();
        System.out.println("Package price is " +nonVegMeal.getCost()+"\n");
    }
}
