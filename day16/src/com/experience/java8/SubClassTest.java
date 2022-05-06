package com.experience.java8;

/**
 * @projectName: newJavaProject
 * @className: SubClassTest
 * @author: AaronLi
 * @description: nothing
 * @date: 2022/5/6 20:44
 * @version: JDK17
 */
public class SubClassTest {
    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        subClass.method2();
        //subClass.method1();error: Static method may be invoked on containing interface class only
        //知识点1：接口中定义的静态方法，只能通过接口调用
        CompareA.method1();
        //知识点2：通过是实现类的对象，可以调用接口中的默认方法
        //如果实现类重写了接口中的默认方法，调用时，仍然调用重写的方法
        subClass.method2();
        subClass.method2();
        //知识点3：如果子类（或实现类）继承的父类和实习的接口中声明了同名同参数的方法，那么子类在没有重写此方法的情况下，默认调用的是
        //父类中的同名同参数的方法。-->类优先原则
        subClass.method3();
        //知识点4：如果实现了实现了多个接口，而这个接口中定义了同名同参数的多个默认方法，那么在实现类没有重写的情况下-->接口冲突。
        //这就需要我们必须在实现类中重写此方法。
        SubClassTwo subClassTwo = new SubClassTwo();
        subClassTwo.method3();
    }
}

class SubClass extends SuperClass implements CompareA, CompareB {
    public void method3() {
        System.out.println("CompareA：天津");
    }

    public void myMethod() {
        method3();//自己定义重写的方法
        //知识点5：如何在子类（或实现类）的方法中调用父类、接口中的默认方法
        // super.method3();//调用的是父类中声明的方法
        CompareA.super.method3();
        CompareB.super.method3();
    }
}

class SubClassTwo implements CompareA, CompareB {
    public void method3() {
        System.out.println("SubClassTwo：深圳");
    }
}
