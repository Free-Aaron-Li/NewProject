package java3;

import java.util.Date;

/*
 * @Description:
 * @version: JDK17
 * @Author: Aaron.Li
 * @Date: 2022-03-02 15:29:39
 * @LastEditTime: 2022-03-19 09:31:22
 */

/*
 * @author: Aaron.Li
 * @date: 2022 - 03 - 02 - 下午3:29
 * @project: NewProject
 * @version: JDK17.0.2
 */
/*
 * @ClassName EqualsTest
 * @Description ==和equals的区别
 * 面试题：==和equals()区别：
 * 一、回顾==的使用
 * ==：运算符
 * 1.可以使用在基本数据类型变量和引用数据类型变量中
 * 2.如果比较的是基本数据类型变量，比较两个变量保存的数据是否相等。（不一定类型要相同）；如果比较的是引用类型
 * 变量，比较的是地址值。比较两个对象的地址值是否相同，即两个引用是否指向同一个对象实体。
 * 补充：==符号使用时，必须保证符号左右两边的变量类型一致。
 *
 * 二、equals()方法的使用：
 * 1.是一种方法，而非运算符
 *
 * 2.只能适用于引用数据类型
 *
 * 3.Object类中的equals()的定义：
 *      public boolean equals(Object obj) {
 *       return (this == obj);
 *   }
 *      说明：Object类中定义的equals()和==的作用是相同的，比较是地址值。比较两个对象的地址值是否相同，
 * 即两个引用是否指向同一个对象实体。
 *
 * 4.像String、Date、File、包装类等都重写了Object类中的equals方法，重写以后比较的不是两个引用是否相容，
 * 而是比较两个对象的“实体内容”是否相同。
 *
 * 5.通常情况下，我们自定义的类如果使用equals()的话，也通常是比较两个对象的“实体内容”是否相同，那么，我们就
 * 对Object类中的equals()进行重写。
 * @Author Aaron-Li
 * @Date 2022 - 03 - 02 - 下午3:29
 * @Version JDK17
 */
public class EqualsTest {

    public static void main(String[] args) {
        // 基本数据类型
        int i = 10;
        int j = 10;
        double d = 10.0;
        System.out.println(i == j);// true
        System.out.println(i == d);// true
        char c = 10;
        System.out.println(i == c);// true
        char c1 = 'A';
        char c2 = 65;
        System.out.println(c1 == c2);// true
        // 引用数据类型
        Customer test = new Customer("tom", 21);
        Customer testOne = new Customer("tom", 21);
        String testThree = new String("Aaron.li");
        String testFour = new String("Aaron.li");
        System.out.println(test == testOne);// false，两个地址值不同，不指向同一个实体。
        System.out.println(test);
        System.out.println(testOne);
        System.out.println(testThree == testFour);// false
        System.out.println("**********");
        // 没有重写equals()方法之前，false，这里的是Object中的equals，重写后为true
        System.out.println(test.equals(testOne));
        System.out.println(testThree.equals(testFour));// true
        Date date = new Date(32432525324L);
        Date date1 = new Date(32432525324L);
        System.out.println(date.equals(date1));// true
    }

}
