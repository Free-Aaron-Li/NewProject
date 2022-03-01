package com.experience.experiment.class4;
/*
 * @author: Aaron.Li
 * @date: 2022 - 03 - 01 - 下午1:18
 * @project: NewProject
 * @version: JDK17.0.2
 */

/**
 * @ClassName Circle
 * @Description 继承性-子类_圆
 * @Author Aaron-Li
 * @Date 2022 - 03 - 01 - 下午1:18
 * @Version JDK17
 */
public class Circle extends GeometricObject{
    private double radius;
    public Circle(String color, double weight,double radius) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double findArea(){
        return 3.14159*radius*radius;
    }
}
