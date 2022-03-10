/*
 * @Description: 
 * @version: JDK17
 * @Author: Aaron.Li
 * @Date: 2022-03-10 18:28:25
 * @LastEditTime: 2022-03-10 18:34:43
 */
public class GeometricObject {
    protected String color;
    protected double weight;

    protected GeometricObject() {
        super();
        this.color="white";
        this.weight=1.0;
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

}
