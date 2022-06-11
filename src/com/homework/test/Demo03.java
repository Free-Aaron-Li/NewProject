package com.homework.test;

import java.util.Arrays;

/**
 * @projectName: newJavaProject
 * @className: Demo03
 * @author: AaronLi
 * @description: nothing
 * @date: 2022/6/11 16:05
 * @version: JDK17
 */
public class Demo03 {
    private static int[] tryReturn() {
        int numArray[] = {10,100};
        try {
            numArray[0]++;
            System.out.println("in try block : numArray=" + Arrays.toString(numArray));
            return numArray;
        } catch (Exception e) {
            numArray[0]++;
            System.out.println("in catch block : numArray=" + Arrays.toString(numArray));
        } finally {
            numArray[0]++;
            System.out.println("in finally block : numArray=" + Arrays.toString(numArray));
        }
        return numArray;
    }

    public static void main(String[] args) {
        int returnNumArray[] = tryReturn();
        System.out.println("in main returnNumArray = " + Arrays.toString(returnNumArray));
    }

}
