package com.experience.innerclass.notice;

/**
 * @projectName: newJavaProject
 * @className: InnerClassTest
 * @author: AaronLi
 * @description:
 * 在局部内部类的方法中（比如：show）如果调用局部内部类所声明的方法（比如：method）中的局部变量（比如：num）必须为final的
 * JDK7及之前版本，要求此局部变量显式的声明为final的
 * JDK8及以后版本，可以省略final
 * @date: 2022/5/9 21:00
 * @version: JDK17
 */
public class InnerClassTest {
    public void method() {
        //局部变量其实是final的
        int num = 10;
        class AA {
            public void show() {
                //num=10;
                System.out.println(num);
            }
        }
    }
}
