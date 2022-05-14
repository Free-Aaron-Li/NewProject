package com.abnormal;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


/**
 * @projectName: newJavaProject
 * @className: FinallyTest
 * @author: AaronLi
 * @description: <p>
 * 关于try-catch-finally中finally的使用
 * <ul type="1">
 *     <li>finally是可选的</li>
 *     <li>finally中声明的一定会被执行的代码，即使catch中出现异常了，try中由return语句，catch中的代码也不会改变</li>
 *     <li><em>像数据库连接、输入输出流、网络编程Socket等资源，JVM是不能自动回收的，我们需要自己手动的进行资源的释放。此时的资源释放，就需要声明在finally中</em></li>
 *
 * </ul>
 * @date: 2022/5/14 20:54
 * @version: JDK17
 */
public class FinallyTest {
    @Test
    public void testOne() {
        try {
            int a = 10;
            int b = 0;
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            e.printStackTrace();

            //finally()中的代码一定会执行
            //int[]arr=new int[10];
            //System.out.println(arr[10]);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("我好帅丫~~~");
        }
    }

    @Test
    public void testTwo() {
        int num = method();
        System.out.println(num);
    }

    public int method() {
        try {
            int[] arr = new int[10];
            System.out.println(arr[10]);
            return 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            return 2;
        } finally {
            System.out.println("我一定会被执行！！！");
            return 3;
        }
    }

    @Test
    public void testThree() {
        FileInputStream files = null;
        try {
            File file = new File("hello1.txt");
            files = new FileInputStream(file);
            int data = files.read();
            while (data != -1) {
                System.out.print((char) data);
                data = files.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            //这里的IOException是输入输出异常（读写异常）
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                //这里添加if语句是防止出现空指针现象，因为finally结构中程序必须执行,有可能出现没有这个文件的现象
                //if (files != null)
                files.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
        }
    }
}
