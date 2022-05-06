package com.experience.java8.experience;

/**
 * @projectName: newJavaProject
 * @className: CompareA
 * @author: AaronLi
 * @description: nothing
 * @date: 2022/5/6 20:40
 * @version: JDK17
 */
public interface CompareA {
    //当然，方法都是public，都是可以省略的
    //静态方法
    static void method1(){
        System.out.println("CompareA：北京");
    }
    //默认方法
    default void method2(){
        System.out.println("CompareA：上海");
    }
    default void method3(){
        System.out.println("Compare：上海");
    }
}
