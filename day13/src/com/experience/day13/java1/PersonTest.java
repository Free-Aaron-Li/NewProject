package com.experience.day13.java1;
/*
 * @author: Aaron.Li
 * @date: 2022 - 02 - 27 - 下午1:36
 * @project: newJavaProject
 * @version: JDK17.0.2
 */

/**
 * @ClassName PersonTest
 * @Description 多态性的测试
 * @Author Aaron-Li
 * @Date 2022 - 02 - 27 - 下午1:36
 * @Version JDK17
 */

/**
 * 面向对象特征之三：多态性（是一个运行时行为）
 * 1.理解多态性：可以理解为一个事物的多种形态。
 * 2.何为多态性？对象多态性：父类的引用指向子类的对象（或子类的对象赋给父类的引用）
 * 3.多态的使用：虚拟方法调用
 * 有了对象的多态以后，我们在编译期，只能调用父类中声明的方法，但在运行期，但在运行期，我们实际执行的是子类重写父类的方法。
 * 总结：编译看左边，运行看右边。
 * 4.多态性使用前提：①类的继承关系 ②方法的重写
 * 5.对象的多态性，只适用于方法，不适用属性（编译和运行都看左边）。
 * ***********
 */
public class PersonTest {
    public static void main(String[] args) {
        Person test = new Person();
        test.eat();
        System.out.println("****************");
        Man man = new Man();
        man.eat();
        man.age = 25;
        man.earnMoney();
        System.out.println("****************");
        //*************************************
        //对象多态性：父类的引用指向子类的对象
        Person testOne = new Man();
        Person testThree = new Man();
        //Person testTwo=new Woman();
        //多态的使用：当调用子父类同名同参数的方法时，实际执行的子类重写父类的方法————虚拟方法调用
        testOne.eat();
        testOne.walk();
        //testOne.earnMoney();(⊙﹏⊙)b,不能调用子类所特有的方法、属性。
        System.out.println(testOne.id);//1001
        System.out.println("***************");
        //有了对象的多态性以后，内存中实际上是加载了子类特有的属性和方法，但是由于变量声明为父类类型，导致编译时，只能调用父类中声明的属性和方法。子类特有的属性和方法不能调用。
        //如何才能调用子类所特有的属性和方法？
        //向下转型（强制类型转换）
        Man manOne = (Man) testOne;
        manOne.isSmoking = true;
        manOne.earnMoney();
        //使用强制转换时，可能出现ClassCastException
        /**
         *instanceof关键字的使用
         *
         * a instanceof A:判断对象a是否是类A的实例。如果是，返回true;如果不是，返回false;
         * 使用情景：为了避免在向下转型时出现ClassCastException的异常，我们在向下转型之前，先进行instanceof的判断，一旦返回true,就进行向下转型。如果返回false,就不进行向下转型。
         *
         * 如果 a instanceof A:返回true,a instanceof B:也返回true。
         * 其中，类B是类A的父类。
         */
        if(testOne instanceof Woman){
            Woman womanOne=(Woman)testOne;
            womanOne.goShopping();
            System.out.println("**************");
        }
        if(testThree instanceof Man){
            System.out.println("*****Man*****");
        }
        if(testThree instanceof Person){
            System.out.println("*****Person*****");
        }

        //练习：
        //问题一：编译时通过，运行时不通过,但是在Woman()中没有Man(),所以不可能从Woman()中声明Man()。
        //举例一：
//        Person testFour=new Woman();
//        Man WomanTest=(Man)testFour;
        //举例二：
//        Person PersonTest=new Person();
//        Man manTestFive=(Man)PersonTest;
        //问题二：编译通过，运行时也通过，但是在父类中没有Woman()这个类，怎么可以从父类中声明Woman()。
//        Object obj=new Woman();
//        Person WomanTestOne=(Person)obj;
//        WomanTestOne.goShopping();
        //问题三：编译不通过
//        Man ManTestSix=new Woman();

    }
}
