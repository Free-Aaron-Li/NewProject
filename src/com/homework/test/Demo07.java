package com.homework.test;

/**
 * @projectName: newJavaProject
 * @className: Demo07
 * @author: AaronLi
 * @description: nothing
 * @date: 2022/6/11 16:10
 * @version: JDK17
 */
public class Demo07 {
    public static void main(String args[]) {
        StringCat s = new StringCat ("Hello ", "China!");
        System.out.println(s.toString());
    }
}
class StringCat {
    String s1, s2;
    public StringCat (String str1, String str2) {
        s1 = str1;
        s2 = str2;
    }
    public String toString() {
        return s1 + s2;
    }

}
