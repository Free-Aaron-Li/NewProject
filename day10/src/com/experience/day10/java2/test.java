package com.experience.day10.java2;
/*
 * @author: Aaron.Li
 * @date: 2022 - 02 - 15 - 下午11:49
 * @project: NewProject
 * @version: JDK17.0.2
 */

/**
 * @ClassName test
 * @Description
 * @Author Aaron-Li
 * @Date 2022 - 02 - 15 - 下午11:49
 * @Version
 */
public class test {
    public static void main(String[] args) {
        int[] array =new int[]{1,2,3};
        int[] array1=new int[3];
        array=array1;
        //array1[1]=3;
        System.out.println(array[1]);
        for(int i=0; i<array.length; i++){
            array1[i]=array[i];
        }
        array[1]=3;
        System.out.println(array1[1]);
    }
}
