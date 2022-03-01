package com.experience.experiment.class4;
/*
 * @author: Aaron.Li
 * @date: 2022 - 03 - 01 - 下午1:12
 * @project: NewProject
 * @version: JDK17.0.2
 */

/**
 * @ClassName GeometricObject
 * @Description 继承性-父类_几何图形
 * @Author Aaron-Li
 * @Date 2022 - 03 - 01 - 下午1:12
 * @Version JDK17
 */
public class GeometricObject {//几何图形
    protected String color;
    protected double weight;//权重

    public GeometricObject() {
    }

    public GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double findArea(){
        return 0.0;
    }
}
