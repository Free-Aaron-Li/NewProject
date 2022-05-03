package com.templatemethod.exercise;

/**
 * @projectName: newJavaProject
 * @className: SalariedEmployee
 * @author: AaronLi
 * @description: 定义SalariedEmployee类继承Employee类，实现按月计算工资的员工的员工处理。该类包括：private成员
 * 变量monthlySalary;
 * 实现父类的抽象方法earnings()，该方法返回monthlySalary值；toString()方法输出员工类型信息及员工的
 * name,number,birthday。
 * @date: 2022/5/2 21:15
 * @version: JDK17
 */
public class SalariedEmployee extends Employee {
    private double monthlySalary;//月工资

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public SalariedEmployee(String name, int number, MyDate birthday,double monthlySalary) {
        super(name, number, birthday);
        this.monthlySalary=monthlySalary;
    }

    @Override
    public double earnings() {
        return monthlySalary;
    }

    public String toString() {
        return "SalariedEmployee[" + super.toString() + "]";
    }
}
