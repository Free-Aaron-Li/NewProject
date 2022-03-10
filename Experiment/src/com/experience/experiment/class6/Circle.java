
/*
 * @Description: 
 * @version: JDK17
 * @Author: Aaron.Li
 * @Date: 2022-03-10 18:35:48
 * @LastEditTime: 2022-03-10 21:11:49
 */

public class Circle extends GeometricObject {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(double radius, String color, double weight) {
        super(color, weight);
        this.radius = radius;
        this.color = color;
        this.weight = weight;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // 求圆的面积
    public double findArea() {
        return 3.14 * radius * radius;
    }

    // 比较两个圆的半径是否相同，如相同，返回true
    @Override
    public boolean equals(Object obj) {
        if(this==obj){
            return true;
        }
        if(obj instanceof Circle){
            Circle circle=(Circle)obj;
            return this.radius==circle.radius;
        }
        return false;
    }

    public String toString() {
        return "Circle [radius=" + radius + ",weight=" + weight + ",color=" + color + "]";
    }
}
