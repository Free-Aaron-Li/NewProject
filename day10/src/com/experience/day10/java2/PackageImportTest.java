package com.experience.day10.java2;
/*
 * @author: Aaron.Li
 * @date: 2022 - 02 - 12 - 下午5:48
 * @project: untitled1
 * @version: JDK17.0.2
 */

import com.experience.experiment.exer2.Bank;

import java.util.*;

import static java.lang.Math.*;
import static java.lang.System.*;

/**
 * @ClassName PackageImportTest
 * @Description
 * 一、package关键字的使用
 * 1.为了更好的实现项目中类的管理，提供包的概念
 * 2.使用package声明类或接口所属的包，声明在源文件的首行
 * 3.包，属于标识符，遵循标识符的命名规则、规范（都是小写）、“见名知意”
 * 4.每“.”一次，代表一层文件目录
 * 补充：同一个包下，不能命名同名的接口、类;不同的包下，可以命名同名的接口、类。
 * 二、Import关键字
 * import：导入
 * 1.在源文件中显式的使用import结构导入指定包下的*类、接口*。
 * 2.声明在包的声明和类的声明之间
 * 3.如果需要导入多个结构，则并列写出即可
 * 4.可以使用“xxx.*”的方式，表示导入xxx包下的所有结构
 * 5.如果使用的类或接口是java.lang包下定义的，则可以省略import结构
 * 6.如果使用的类或接口是在本包下定义的，则可以省略import结构
 * 7. 如果在源文件中，使用了不同包下的同名的类，则必须至少有一个类需要以全类名的方式显示
 * 8.如果使用“xxx.*”方式表明可以调用xxx包下的所有结构，但是如果使用的是xxx子包下的结构，则仍需要显式导入
 * 9.import static：导入指定类或接口的静态结构*（属性或方法）*
 * @Author Aaron-Li
 * @Date 2022 - 02 - 12 - 下午5:48
 * @Version JDK17
 */
public class PackageImportTest {
    public static void main(String[] args) {
       String into= Arrays.toString(new int[]{1,2,3});
        Bank bank=new Bank();
        ArrayList list = new ArrayList();
        //全类名方式显示
        com.experience.experiment.exer1.BankAccount one=new com.experience.experiment.exer1.BankAccount(0,1000,0.0123);
        //out指向“import static java.lang.System.*;"
        out.println("hello");
        //同理：
        long num=round(123.456);
    }
}