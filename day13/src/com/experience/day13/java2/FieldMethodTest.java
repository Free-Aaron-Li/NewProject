package com.experience.day13.java2;
/*
 * @author: Aaron.Li
 * @date: 2022 - 03 - 01 - 上午7:53
 * @project: NewProject
 * @version: JDK17.0.2
 */

/**
 * @ClassName FieldMethodTest
 * @Description 多态性测试
 * @Author Aaron-Li
 * @Date 2022 - 03 - 01 - 上午7:53
 * @Version JDK17
 */
class Base {
    int count = 10;

    public void display() {
        System.out.println(this.count);
    }
}

class Sub extends Base {
    int count = 20;

    public void display() {
        System.out.println(this.count);
    }
}

public class FieldMethodTest {
    public static void main(String[] args) {
        Sub test = new Sub();
        System.out.println(test.count);//20
        test.display();//20
        Base baseTest = test;
        //==:对于应用数据类型来讲，比较的是两个引用数据类型变量的地址值是否相同
        System.out.println(baseTest == test);
        System.out.println(baseTest.count);
        baseTest.display();
    }
}
