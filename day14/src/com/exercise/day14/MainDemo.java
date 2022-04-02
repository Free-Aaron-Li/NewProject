package com.exercise.day14;

/**
 * @projectName: newJavaProject
 * @className: MainDemo
 * @author: AaronLi
 * @description: 在Run--->edit configurations-->program arguments中可以设置对主函数设置参数
 * @date: 2022/3/31 21:13
 * @version: JDK17
 */
public class MainDemo {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("*********"+args[i]);
        }
    }
}
