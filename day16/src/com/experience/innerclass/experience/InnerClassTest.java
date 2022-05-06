package com.experience.innerclass.experience;

/**
 * @projectName: newJavaProject
 * @className: InnerClassTest
 * @author: AaronLi
 * @description: 内部成员之内部类：
 * 1.Java中允许将一个类A声明在另一个类B中，则类A就是内部类，类B就是外部类。
 * <p>
 * 2.内部类的分类：成员内部类VS局部内部类（方法内、构造器内、代码块内）
 * <p>
 * 3.成员内部类（静态的、非静态的）：
 * 一方面，作为外部类的成员：
 * >调用外部类的结构
 * >可以用static修饰
 * >可以被四种权限修饰
 * 另一方面，作为一个类：
 * >类内可以定义属性、方法、构造器等
 * >可以用final修饰，表示此类不能被继承。言外之意，不加final，就可以被继承。
 * >可以被abstract修饰，表示不能被实例化
 * <p>
 * 4.关注如下3个问题：
 * 4.1 如何实例化成员内部类的对象
 * 4.2 如何在成员内部类中区分调用外部类的结构
 * 4.3 开发中局部内部类的使用
 * @date: 2022/5/6 23:01
 * @version: JDK17
 */
public class InnerClassTest {
    public static void main(String[] args) {
        //创建Dog的实例（静态的成员内部类）：
        Person.Dog dog = new Person.Dog();
        dog.show();
        //创建Bird实例（非静态的成员内部类）：
        Person person = new Person();
        Person.Bird bird = person.new Bird();
        bird.sing();

        bird.showName("黄鹂");
    }
}

class Person {
    String name="小米";
    int age=10;

    public void eat() {
        System.out.println("人，吃饭！");
    }

    //静态成员内部类
    static class Dog {
        String name;
        int age;

        public void show() {
            System.out.println("卡拉是条狗！");
            //eat(); error:Non-static method 'eat()' cannot be referenced from a static context
        }
    }

    //非静态成员内部类
    class Bird {
        String name="杜鹃";

        public void sing() {
            System.out.println("我是一只小小鸟！");
            //内部类可以调用外部类的方法
            eat();
            Person.this.eat();//调用外部类的属性，省略Person.this
        }
        public void showName(String name){
            System.out.println(name);//方法的形参
            System.out.println(this.name);//内部类的属性
            System.out.println(Person.this.name);//外部类的属性
            System.out.println(age);
        }
    }

    public void method() {
        //局部内部类
        class AA {

        }
    }

    {
        //局部内部类
        class BB {

        }
    }

    public Person() {
        //局部内部类
        class CC {

        }
    }
}
