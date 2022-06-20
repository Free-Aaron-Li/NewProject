package com.homework.test;

/**
 * @projectName: newJavaProject
 * @className: Animal
 * @author: AaronLi
 * @description: nothing
 * @date: 2022/6/11 16:03
 * @version: JDK17
 */
public class Animal {
    String name;
    void eat() {
        System.out.println("动物吃东西");
    }
    void cry() {
        System.out.println("我是动物");
    }
}
class Dog extends Animal {
    void eat() {
        System.out.println("狗啃骨头");
    }
    void lookHome() {
        System.out.println("小狗看家");
    }
}
class Fish extends Animal {
    void eat() {
        System.out.println("鱼儿吃东西");
    }
    void swim() {
        System.out.println("鱼儿游泳");
    }

}
class Demo02 {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.eat();
        animal.cry();
        Dog dog = (Dog) animal;
        dog. lookHome ();
        animal=new Fish();
        animal.eat();
    }
}
