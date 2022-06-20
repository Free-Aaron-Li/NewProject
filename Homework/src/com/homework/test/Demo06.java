package com.homework.test;

/**
 * @projectName: newJavaProject
 * @className: Demo06
 * @author: AaronLi
 * @description: nothing
 * @date: 2022/6/11 16:09
 * @version: JDK17
 */
public class Demo06 {
    private static int tryReturn() {
        int num = 10;
        try {
            num++;
            System.out.println("in try block : num=" + num);
            return num;
        } catch (Exception e) {
            num++;
            System.out.println("in catch block : num=" + num);
        } finally {
            num++;
            System.out.println("in finally block : num=" + num);
        }
        return num;
    }

    public static void main(String[] args) {
        int returnNum = tryReturn();
        System.out.println("in main returnNum=" + returnNum);
    }

}
