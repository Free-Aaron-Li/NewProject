package com.experience.day13.java4;
/*
 * @author: Aaron.Li
 * @date: 2022 - 02 - 25 - 下午1:41
 * @project: newJavaProject
 * @version: JDK17.0.2
 */

/**
 * @ClassName PersonTest
 * @Description 方法的重写的测试
 * 方法的重写（override/overwrite）
 * 1.重写：子类继承父类以后，可以对父类中同名同参数的方法，进行覆盖操作。
 * 2.应用：重写以后，当创建子类对象以后，通过子类对象调用父类中的同名同参数的方法，实际执行的是父类重写父类的方法。
 * 3.重写的规定：
 * >方法的声明：权限修饰符 返回值类型 方法名（形参列表）{
 * >方法体
 * >}
 * >约定俗称：子类中的叫重写的方法，父类中的叫被重写方法
 * <p>
 * >①子类重写的方法的方法名和形参列表与父类被重写的方法的方法名和形参列表相同。
 * >②子类重写的方法的权限修饰符不小于父类被重写的方法的权限修饰符。特殊情况：子类不能重写父类的private方法。
 * >③返回值类型：
 * >如果父类中被重写的方法的返回值类型是void，则子类重写的方法返回值只能是void。
 * >父类被重写的方法的返回值类型是A类型，则子类重写的方法的返回值类型可以是A类或A类的子类。
 * >父类被重写的方法的返回值类型是基本数据类型，则子类重写的方法的返回值类型必须是相同的基本数据类型。
 * >④子类重写的方法抛出的异常类型不大于父类被重写方法抛出的异常类型。（具体放到异常处理再详细说明）
 * **********
 * 子类和父类中同名同参数的方法要么都非static的（考虑重写），要么都声明为static的（static是不能被重写的）。6
 * 区分：方法的重载和重写
 * @Author Aaron-Li
 * @Date 2022 - 02 - 25 - 下午1:41
 * @Version JDK17
 */
public class PersonTest {
    public static void main(String[] args) {
        Student test = new Student("网络工程");
        test.eat();
        test.walk(10);
        test.studying();
        Person testOne = new Person();
        testOne.eat();
    }
}
