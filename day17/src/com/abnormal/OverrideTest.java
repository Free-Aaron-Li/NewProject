package com.abnormal;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @projectName: newJavaProject
 * @className: OverrideTest
 * @author: AaronLi
 * @description: <p>方法重写的规则之一：</p>
 * 子类重写的方法抛出的异常类型不大于父类被重写的方法抛出的异常类型
 * @date: 2022/5/15 11:45
 * @version: JDK17
 */
public class OverrideTest {
    public static void main(String[] args) {
        OverrideTest test = new OverrideTest();
        test.display(new SubClass());
    }

    public void display(SuperClass s) {
        try {
            s.methodOne();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class SuperClass {
    public void methodOne() throws IOException {

    }
}

class SubClass extends SuperClass {
    public void methodTwo() throws FileNotFoundException {

    }
}
