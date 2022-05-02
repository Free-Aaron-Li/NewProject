package com.exercise.day16;

/**
 * @projectName: newJavaProject
 * @className: EmployeeTest
 * @author: AaronLi
 * @description: 测试
 * @date: 2022/4/21 20:13
 * @version: JDK1
 */
public class EmployeeTest {
    public static void main(String[] args) {
        //多态
        Employee managerOne = new Manager("KUKE", 1001, 5000, 50000);
        managerOne.work();
        CommonEmployee commonEmployeeOne=new CommonEmployee();
        commonEmployeeOne.work();
    }
}
