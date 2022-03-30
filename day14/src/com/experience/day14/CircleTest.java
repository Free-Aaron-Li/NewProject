package com.experience.day14;

/**
 * @projectName: newJavaProject
 * @className: CircleTest
 * @author: AaronLi
 * @description: TODO
 * @date: 2022/3/30 13:04
 * @version: JDK17
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle test = new Circle();
        test.findArea();
        Circle testOne = new Circle();
        System.out.println("test的id：" + test.getId() + "，testOne的id：" + testOne.getId());
        System.out.println("圆的数量：" + Circle.getTotal());
    }
}

class Circle {
    private double radius;
    private int id;


    public Circle() {
        id = init++;
        total++;
    }

    public Circle(double radius) {
        this();//这里同样相当于下面的id和total。
        //id = init++;
        //total++;
        this.radius = radius;

    }

    private static int total;//记录创建的圆的个数
    private static int init = 1001;//static声明的属性被所有对象所共享


    public double findArea() {
        return 3.14 * radius * radius;
    }

    public int getId() {
        return id;
    }

    public double getRadius() {
        return radius;
    }

    public static int getTotal() {
        return total;
    }
}
