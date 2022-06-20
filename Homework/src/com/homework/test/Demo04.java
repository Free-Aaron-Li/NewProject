package com.homework.test;

import java.util.HashSet;

/**
 * @projectName: newJavaProject
 * @className: Demo04
 * @author: AaronLi
 * @description: nothing
 * @date: 2022/6/11 16:06
 * @version: JDK17
 */
public class Demo04 {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<String>();
        String[]  courseName=new String[]{"Java","C++","PHP","MySQL","Java","PHP"};
        for(String name:courseName){
            set.add(name);
        }
        System.out.println(set.size());
    }

}
