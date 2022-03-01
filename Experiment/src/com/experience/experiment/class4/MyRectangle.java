package com.experience.experiment.class4;
/*
 * @author: Aaron.Li
 * @date: 2022 - 03 - 01 - 下午1:23
 * @project: NewProject
 * @version: JDK17.0.2
 */

/**
 * @ClassName MyRectangle
 * @Description
 * @Author Aaron-Li
 * @Date 2022 - 03 - 01 - 下午1:23
 * @Version
 */
public class MyRectangle extends GeometricObject {
    private double width;
    private double height;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public MyRectangle(double width, double height, String color, double weight) {
        super(color, weight);
        this.width=width;
        this.height=height;
   }
   public double findArea(){
        return  width*height;
   }
}
