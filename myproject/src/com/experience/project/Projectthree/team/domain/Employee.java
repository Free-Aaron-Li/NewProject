package com.experience.project.Projectthree.team.domain;

/**
 * @projectName: newJavaProject
 * @className: Employee
 * @author: AaronLi
 * @description: nothing
 * @date: 2022/6/7 21:02
 * @version: JDK17
 */
public class Employee {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Employee() {
    }

    public Employee(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * @description:子类调用父类的toString方法
     */
    public String getDetails() {
        return id + "\t" + name + "\t" + age + "\t" + salary + "\t";
    }

    @Override
    public String toString() {
        return id + "\t" + name + "  \t" + age + "\t" + salary + "\t";
    }
}
