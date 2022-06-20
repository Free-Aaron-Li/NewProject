package com.homework.test;

/**
 * @projectName: newJavaProject
 * @className: Demo09
 * @author: AaronLi
 * @description: nothing
 * @date: 2022/6/11 16:12
 * @version: JDK17
 */
public class Demo09 {
    public static void main(String args[]) {
        String s1 = new String("I am A Student"),
                s2 = new String("I am a student");
        if (s1.equals(s2)) {
            System.out.println("s1与s2的内容相同");
        } else {
            System.out.println("s1与s2的内容不相同");
        }

        String s3 = new String("510922200310224243");
        if (s3.substring(0, 2).equals("51")) {
            System.out.println("是四川省的身份证号码");
        }else{
            System.out.println("不是四川省的身份证号码");
        }

        String s4 = new String("hi"), s5 = new String("Hello");
        if (s4.compareTo(s5) > 0){
            System.out.println("s4>s5");
        } else {
            System.out.println("s4<s5");
        }

        int loc = 0;
        String path = "c:\\exam\\java\\T4_3.java";
        loc = path.indexOf('\\');
        System.out.println("loc:" + loc);

        String s6 = new String("1"), s7 = new String("5.6");
        int n1 = Integer.parseInt(s6);
        double n2 = Double.parseDouble(s7);
        double result = n1 + n2;
        System.out.println(result);
    }

}
