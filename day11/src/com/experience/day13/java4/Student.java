package com.experience.day13.java4;
/*
 * @author: Aaron.Li
 * @date: 2022 - 02 - 25 - 下午1:34
 * @project: newJavaProject
 * @version: JDK17.0.2
 */

/**
 * @ClassName Student
 * @Description 方法的重写的理解子类
 * @Author Aaron-Li
 * @Date 2022 - 02 - 25 - 下午1:34
 * @Version JDK17
 */
public class Student extends Person{
    String major;
    public Student(){

    }
    public Student(String major){
        this.major=major;
    }
    public void studying(){
        System.out.println("学习的专业是："+major);

    }
    /**
     * Description: 方法的重写
     */
    public void eat(){
        System.out.println("学生应该吃有营养的食物！");
    }
    /**
    * Description 方法重写之返回值类型可以是其类型的子类
    */
    public String info(){
        return null;
    }
    /**
    * Description 基本数据的返回值类型必须相同
    */
    public double infoOne() {
        return 3;
    }
}
