package com.abnormal.test;

import com.abnormal.MyException;

/**
 * @projectName: newJavaProject
 * @className: StudentTest
 * @author: AaronLi
 * @description:
 * 异常抛出方法throw和自定义异常MyException的调用
 * @date: 2022/5/15 15:15
 * @version: JDK17
 */
public class StudentTest {
    public static void main(String[] args) {
        try {
            Student student = new Student();
            student.regist(-1001);
            System.out.println(student);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class Student {
    private int id;

    public void regist(int id) throws Exception {
        if (id > 0) {
            this.id = id;
        } else {
            //System.out.println("非法");

            //手动抛出异常对象
            //throw new RuntimeException("非法");
            //throw new Exception("您输入的数据非法！");
            throw new MyException("不能输入负数！！");
        }
    }
}
