package com.exercise.day16;

/**
 * @projectName: newJavaProject
 * @className: Manager
 * @author: AaronLi
 * @description: manager类，既是员工，还具有奖金
 * @date: 2022/4/21 20:05
 * @version: JDK17
 */
public class Manager extends Employee {
    private double bonus;//奖金

    public void work() {
        System.out.println("管理员工，提高公司运行的效率");
    }

    public Manager(double bonus) {
        this.bonus = bonus;
    }

    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }
}
