package com.templatemethod.exercise;

/**
 * @projectName: newJavaProject
 * @className: HourlyEmployee
 * @author: AaronLi
 * @description: 参照SalariedEmployee类定义HourlyEmployee类，实现按小时计算工资的员工处理，该类包含：
 * private成员变量wage和hour;
 * 实现父类的抽象方法earnings()，该方法返回wage*hour值，
 * toString()方法输出员工信息及员工的name,number和birthday。
 * @date: 2022/5/2 21:25
 * @version: JDK17
 */
public class HourlyEmployee extends Employee {
    private int wage;//每小时的工资
    private int hour;//月工作的小时数

    public HourlyEmployee(String name, int number, MyDate birthday,int wage,int hour) {
        super(name, number, birthday);
        this.hour=hour;
        this.wage=wage;
    }

    @Override
    public double earnings() {
        return wage * hour;
    }

    public String toString() {
        return "HourlyEmployee[" + super.toString() + "]";
    }
}
