package exercise.day15.Compare;

/**
 * @projectName: newJavaProject
 * @className: Circle
 * @author: AaronLi
 * @description: 定义一个Circle类，声明radius属性，提供getter和setter方法。
 * @date: 2022/5/4 19:35
 * @version: JDK17
 */
public class Circle {
    private Double radius;

    public Circle() {
    }

    public Circle(Double radius) {
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }
}
