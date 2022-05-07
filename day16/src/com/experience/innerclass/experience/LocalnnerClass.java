package com.experience.innerclass.experience;

/**
 * @projectName: newJavaProject
 * @className: LocalnnerClass
 * @author: AaronLi
 * @description: 局部内部类的实例化
 * 局部内部类只能在该类中实例化，也只能调用该类内部的方法。是无法在外部类中实例化和调用的。
 * @date: 2022/5/8 0:59
 * @version: JDK17
 */
public class LocalnnerClass {
    public void main(String[] args) {
        new AA().BB();
        new NewObject().methodTwo();
    }

}

class NewObject {
    public static void main(String[] args) {
        NewObject.method();
    }

    private static void method() {
        class Haha{
            void say(){
                System.out.println("HAHA!");
            }
        }
    }

    void methodTwo() {
        System.out.println("This is a NewObject.methodTwo method");
    }

    public void Method() {
        class newObject {
            void say() {
                System.out.println("This is a new method!");
            }
        }
    }
}

//错误的示范
class AA {
    void BB() {
        class CC {
            void DD() {
                System.out.println("haha!");
            }
        }
    }
}
//局部内部类只能在该类中实例化，也只能调用该类内部的方法。是无法在外部类中实例化和调用的。

