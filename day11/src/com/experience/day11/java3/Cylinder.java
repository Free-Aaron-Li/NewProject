package com.experience.day11.java3;
/*
 * @author: Aaron.Li
 * @date: 2022 - 02 - 24 - 下午8:28
 * @project: newJavaProject
 * @version: JDK17.0.2
 */

/**
 * @ClassName Cylinder
 * @Description java3继承性的使用子类
 * @Author Aaron-Li
 * @Date 2022 - 02 - 24 - 下午8:28
 * @Version JDK17
 */
public class Cylinder extends Circle{
    private double length;
    public Cylinder(){
        length=1;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double findVolume(){
        return findArea()*getLength();
    }

    /**
     *
     * @return 圆柱的表面积
     */
    public double findArea(){
        return Math.PI*getRadius()*getRadius()*2+Math.PI*2*getRadius()*length;
    }
}
