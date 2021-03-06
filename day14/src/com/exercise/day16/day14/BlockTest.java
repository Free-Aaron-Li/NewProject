package com.exercise.day16.day14;

/**
 * @projectName: newJavaProject
 * @className: BlockTest
 * @author: AaronLi
 * @description: 类的成员只四：代码块（或初始化块）
 * 1.代码块的作用：用来初始化类、对象。
 * 2.代码块如果有修饰，只能用static。
 * 3.分类：静态代码块VS非静态代码块
 * <p>
 * 4.静态代码块：
 * 内部可以有输出语句
 * 随着类的加载而执行,且只执行一次
 * 如果一个类中定义了多个静态代码块，则按照声明的先后顺序执行
 * 静态代码块的执行优先于非静态代码块
 * 作用：
 * 初始化当前类中的信息
 * <p>
 * 5.非静态代码块：
 * 内部可以有输出语句
 * 随着对象的创建而执行
 * 每创建一个对象，就执行一次非静态代码块
 * 作用：
 * 可以在创建对象时，对对象的属性进行初始化。
 * <p>
 * 补充：属性可以赋值的位置：
 * ①默认初始化
 * ②显式初始化
 * ③有了对象以后，可以通过“对象。属性”或“对象。方法”的方式，进行赋值
 * ④在代码块中赋值
 * @date: 2022/4/1 23:07
 * @version: JDK17
 */
public class BlockTest {
    public static void main(String[] args) {
        String desc = Person.desc;
        Person testOne = new Person();
        Person testTwo = new Person();
        Person.info();
        System.out.println(testOne.age);
        System.out.println(testTwo.age);
        System.out.println(desc);
    }
}

class Person {
    //属性
    String name;
    int age;
    static String desc = "我是一个人";

    //构造器
    public Person() {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //代码块
    //static代码块
    static {
        System.out.println("hello! static block");
        desc = "我是一个爱学习的人";
    }

    static {
        System.out.println("Hello!this is two static block");
    }

    //非static代码块
    {
        System.out.println("hello! block");
        age = 1;
    }

    //方法
    public void eat() {
        System.out.println("吃饭");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", desc='" + desc + '\'' +
                '}';
    }

    public static void info() {
        System.out.println("我是一个好人！");
    }
}
