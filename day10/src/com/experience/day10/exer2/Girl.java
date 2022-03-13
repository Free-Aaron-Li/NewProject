package com.experience.day10.exer2;

/*
 * @author: Aaron.Li
 * @date: 2022 - 02 - 10 - 下午1:31
 * @project: untitled1
 * @version: JDK17.0.2
 */
public class Girl {
    private String name;
    private int age;

    public Girl() {
    }

    public Girl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*li

     */
    public void setAge(int age) {
        this.age = age;
    }

    public void marry(Boy boy) {
        System.out.println("我想嫁给 " + boy.getName());
        boy.marry(this);//直接this,表示当前的Girl
    }


    public int compare(Girl girl) {
        return this.age - girl.age;
    }

}
