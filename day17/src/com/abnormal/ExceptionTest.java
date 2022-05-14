package com.abnormal;

import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.Scanner;

/**
 * @projectName: newJavaProject
 * @className: ExceptionTest
 * @author: AaronLi
 * @description: 异常Exception的实践
 * 一、异常体系结构
 * java.lang.Throwable
 * |----java.lang.Error:一般不编写针对性的代码
 * |----java.lang.Exception:可以进行异常的处理
 * |----编译时异常（checked)
 * |----IOException
 * |----FileNotFoundException
 * |----ClassNotFoundException
 * |----运行时异常（unchecked）
 * |----NullPointerException
 * |----ArrayIndexOutBoundsException
 * |----ClassCasException
 * |----NumberFormatException
 * |----InputMismatchException
 * |----ArithmeticException
 * @date: 2022/5/14 16:49
 * @version: JDK17
 */
public class ExceptionTest {
    //******************************************************运行时异常**************************************************************


    //NullPointerException
    @Test
    public void testOne() {
        //one
        int[] arr = null;
        System.out.println(arr[3]);

        //two
        String str = "abc";
        str = null;
        System.out.println(str.charAt(0));
    }

    //ArrayIndexOutOfBoundsException
    @Test
    public void testTwo() {
        //one
        int[] arr = new int[10];
        System.out.println(arr[10]);

        //two
        String str = "abc";
        System.out.println(str.charAt(3));
    }

    //ClassCastException(类型转换异常)
    @Test
    public void testThree() {
        Object obj = new Date();
        String str = (String) obj;
    }

    //NumberFormatException(数字格式化异常)
    @Test
    public void testFour() {
        String str = "123";
        str = "abc";
        int num = Integer.valueOf(str);
    }

    //InputMismatchException
    @Test
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        System.out.println(score);
        scanner.close();
    }

    //ArithmeticException(算术异常)
    @Test
    public void ManTestSix() {
        int a = 10;
        int b = 0;
        System.out.println(a / b);
    }

    //**********************************************编译时异常*************************************************

    @Test
    public void testSeven() {
        //File file=new File("hello.txt");
        //FileinputStream files=new FileInputStream(file);
        //int data = files.read();
        //while (data!=-1) {
        //    System.out.println((char) data);
        //    data=files.read();
        //}
        //files.close();
    }
}
