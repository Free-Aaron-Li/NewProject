package com.exercise.day16;

/**
 * @projectName: newJavaProject
 * @className: Employee
 * @author: AaronLi
 * @description: 抽象类的案例
 * <h>
 * 编写一个Employee类，声明位抽象类，包含如下三个属性：name,id,salary。提供必要的构造器和抽象方法：work()。
 * </h>
 * @date: 2022/4/21 16:36
 * @version: JDK17
 */
abstract public class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee() {
        super();
    }

    public Employee(String name, int id, double salary) {
        super();
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public abstract void work();
}
