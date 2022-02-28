package com.experience.day13.java2;
/*
 * @author: Aaron.Li
 * @date: 2022 - 02 - 24 - 下午3:28
 * @project: newJavaProject
 * @version: JDK17.0.2
 */

/**
 * @ClassName Kids
 * @Description java2子类
 * 定义类kids继承Mankind，并包括成员变量int yearsOld；方法printAge（）打印yearsOld的值。
 * @Author Aaron-Li
 * @Date 2022 - 02 - 24 - 下午3:28
 * @Version JDK17
 */
public class Kids extends ManKind {
    private int yearsOld;

    public Kids(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public void printAge() {
        System.out.println("I am " + yearsOld + " years old.");
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    /**
     * 覆盖父类ManKind中定义的employeed()的方法
     */
    public void employeed() {
        System.out.println("kids should study and no job!");
    }
}
