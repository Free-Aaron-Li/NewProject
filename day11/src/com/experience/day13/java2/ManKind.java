package com.experience.day13.java2;
/*
 * @author: Aaron.Li
 * @date: 2022 - 02 - 24 - 下午1:49
 * @project: newJavaProject
 * @version: JDK17.0.2
 */

/**
 * @ClassName Mankind
 * @Description 继承类的练习
 * 定义变量int sex和int salary;
 * 方法void manOrWoman():根据sex的值显示“man”（sex==1）或者“woman”（sex==0）;
 * 方法void employeed():根据salary的值显示“no job”（salary==0）或者“job”（salary!=0）;
 * @Author Aaron-Li
 * @Date 2022 - 02 - 24 - 下午1:49
 * @Version JDK17
 */
public class ManKind {
    private int sex;//性别
    private int salary;//薪资

    public ManKind() {
    }

    public ManKind(int sex, int salary) {
        this.sex = sex;
        this.salary = salary;
    }

    public void manOrWoman() {
        if (sex == 1) {
            System.out.println("man");
        } else if (sex == 0) {
            System.out.println("woman");
        }
    }

    public void employeed() {
        String salaryInfo = (salary == 0) ? "no job" : "job";
        System.out.println(salaryInfo);
    }

    public int getSex() {
        return sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}