package com.exercise.day16.day14;

/**
 * @projectName: newJavaProject
 * @className: MainTest
 * @author: AaronLi
 * @description: 关于main方法的认识和使用说明：
 * 1.main()方法作为程序的入口
 * 2.main()方法也是一个普通的静态方法
 * 3.main()方法可以作为控制台
 * @date: 2022/3/31 20:52
 * @version: JDK17
 */
public class MainTest {
    public static void main(String[] args) {
       Main.main(new String[100]);
    } 
}
class Main{
    public static void main(String[] args) {
        args=new String[100];
        for (int i = 0; i < args.length; i++) {
            args[i]="args_"+i;
            System.out.println(args[i]);
        }
    }
}
