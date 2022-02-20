package com.experience.day11.java1;
/*
 * @author: Aaron.Li
 * @date: 2022 - 02 - 20 - 下午11:21
 * @project: NewProject
 * @version: JDK17.0.2
 */

/**
 * @ClassName ExtendsTest
 * @Description 继承性的测试
 * @Author Aaron-Li
 * @Date 2022 - 02 - 20 - 下午11:21
 * @Version JDK17
 */
public class ExtendsTest {
    public static void main(String[] args) {
        Person test = new Person();
        test.age=20;
        test.name="Aaron.Li";
        test.eat();

        Student testOne =new Student();
        testOne.age=21;
    }
}
