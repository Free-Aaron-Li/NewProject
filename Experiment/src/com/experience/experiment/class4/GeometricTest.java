package com.experience.experiment.class4;
/*
 * @author: Aaron.Li
 * @date: 2022 - 03 - 01 - 下午1:55
 * @project: NewProject
 * @version: JDK17.0.2
 */

/*
 * @ClassName GeometricTest
 * @Description 多态性-测试
 * @Author Aaron-Li
 * @Date 2022 - 03 - 01 - 下午1:55
 * @Version JDK17
 */

/**
 *编写equalsArea方法测试两个对象的面积是否相等（注意方法的参数类型，利用动态绑定技术），编写displayGeometricObject方法显示对象的面积（注意方法的参数类型，利用动态绑定技术）。
 */
public class GeometricTest {
    public static void main(String[] args) {
        GeometricTest object = new GeometricTest();
        Circle circleOne = new Circle("white",1.0,2.3);
        Circle circleTwo = new Circle("white",1.0,3.3);
        object.displayGeometricObject(circleOne);
        object.displayGeometricObject(circleTwo);
        boolean isequal = object.equalsArea(circleOne,circleTwo);
        System.out.println(isequal);
    }
    public void displayGeometricObject(GeometricObject test){
        System.out.println("面积为："+test.findArea());
    }
    //比较这两个对象面积是否相等
    public boolean equalsArea(GeometricObject testOne,GeometricObject testTwo) {
        return testOne.findArea()==testTwo.findArea();
    }
}
