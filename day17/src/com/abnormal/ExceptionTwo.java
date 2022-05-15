package com.abnormal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @projectName: newJavaProject
 * @className: ExceptionTwo
 * @author: AaronLi
 * @description: <p>
 * 异常处理的方式二：throws+异常类型
 * <p></p>
 * <ul type="1">
 *     <li>”throws+异常类型“写在方法的声明处。指明此方法执行时，可能会抛出的异常类型。一旦当方法体执行时，出现异常，仍会在异常代码处生成一个异常类的对象，此对象满足throw后异常类型时，就会被抛出
 *     异常代码的后续代码不会执行。</li>
 *     <li>体会：try-catch-finally：真正的将异常处理掉，throws的方法只是将异常抛给了方法的调用者，并没有真正将异常处理掉</li>
 *     <li>开发中如何选择使用try-catch-finally还是使用throws?
 *     <ul type="a">
 *        <li>如果父类中被重写的方法没有throws方法处理异常，则子类重写的方法也不能使用throws，意味着如果子类重写的方法中有异常，必须使用try-catch-finally方式处理。</li>
 *        <li>执行的方法中先后又调用了另外的方法，这几个方法是递进的关系，建议用throws方式进行处理。而执行方法a可以考虑使用try-catch-finally方式处理。</li>
 *     </ul>
 *     </li>
 * </ul>
 * @date: 2022/5/15 11:22
 * @version: JDK17
 */
public class ExceptionTwo {
    static FileInputStream files = null;

    public static void testOne() throws FileNotFoundException, IOException {
        File file = new File("hello.txt");
        files = new FileInputStream(file);
        int data = files.read();
        while (data != -1) {
            System.out.print((char) data);
            data = files.read();
        }
        files.close();
    }

    public static void testTwo() throws IOException {
        testOne();
    }

    public static void main(String[] args) throws IOException {
        try {
            testTwo();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
