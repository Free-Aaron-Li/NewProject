package com.expercise.day16;

/**
 * @projectName: newJavaProject
 * @className: AbstractTest
 * @author: AaronLi
 * @description: 抽象类的测试
 * abstract关键字的使用：
 * <h>
 *     1.abstract：抽象的
 * </h>
 * <h>
 *     2.abstract可以用来修饰的结构、类和方法
 * </h>
 * <H>
 *     3.abstract修饰类，抽象类
 * >此类不能实例化
 * >抽象类中一定有构造器，便于子类实例化时调用（涉及子类对象实例化的全过程）
 * >开发中，都会提供抽象类的子类，让子类对象实例化，完成相关操作
 * </H>
 * <h>
 *     4.abstract修饰方法，抽象方法
 *      >抽象方法只有方法的声明，没有方法体
 *      >包含抽象方法的类一定是抽象类，反之抽象类中可以没有抽象方法。
 *      >若子类重写了父类中的所有的抽象方法，此子类方可实例化。
 *      >若子类没有重写父类中的所有的抽象方法，则此子类也是一个抽象类，也需要将子类添加abstract。
 * </h>
 * @date: 2022/4/21 15:12
 * @version: JDK17
 */
public class AbstractTest {
    public static void main(String[] args) {
        //一旦Person类抽象，就不可以实例化
        //Person personOne=new Person();
        //personOne.eat();
    }
}

abstract class Person {
    String name;
    int age;

    public Person() {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //这个不是抽象方法
    public void eat() {
    }

    //这个才是抽象方法
    public abstract void eatOne();

    public void walk() {
        System.out.println("人走路");
    }
}

class Student extends Person {

    @Override
    public void eatOne() {
        System.out.println("学生应该多吃营养的吧");
    }
}
