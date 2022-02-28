package com.experience.day13.java3;
/*
 * @author: Aaron.Li
 * @date: 2022 - 02 - 24 - 下午8:17
 * @project: newJavaProject
 * @version: JDK17.0.2
 */

/**
 * @ClassName Circle
 * @Description java3继承性的使用
 * @Author Aaron-Li
 * @Date 2022 - 02 - 24 - 下午8:17
 * @Version JDK17
 */
public class Circle {
    private double radius;

    public Circle() {
        radius = 1.0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     *
     * @return 圆的表面积
     */
    public double findArea() {
        return getRadius() * getRadius() * 3.14159;
    }
}
