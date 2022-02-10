package com.everythingwuhu.exer2;

/*
 * @author: Aaron.Li
 * @date: 2022 - 02 - 10 - 下午1:30
 * @project: untitled1
 * @version: JDK17.0.2
 */
public class Boy {
    private String name;
    private int age;

    public Boy(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void marry(Girl girl) {
        System.out.println("我想娶 " + girl.getName());
    }

    public void shout() {
        if (this.age >= 22) {
            System.out.println("你可以结婚了");
        } else {
            System.out.println("先谈一谈恋爱～～");
        }
    }
}
