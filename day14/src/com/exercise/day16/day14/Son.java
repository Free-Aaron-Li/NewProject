package com.exercise.day16.day14;

/**
 * @projectName: newJavaProject
 * @className: Son
 * @author: AaronLi
 * @description:
 * @date: 2022/4/3 13:07
 * @version: JDK17
 */
class Father {
    static {
        System.out.println("111111");
    }

    {
        System.out.println("222222");
    }

    public Father() {
        System.out.println("333333");
    }
}

public class Son extends Father {
    static {
        System.out.println("444444");
    }

    {
        System.out.println("555555");
    }

    public Son() {
        System.out.println("666666");
    }

    public static void main(String[] args) {//main方法除了是入口，也是一个普通方法，也需要类去调.所以在main方法执行前也是需要先调用类，再调用main方法
        System.out.println("777777");
        System.out.println("******");
        new Son();
        System.out.println("******");
        new Son();
        System.out.println("******");
        new Father();
    }
}
