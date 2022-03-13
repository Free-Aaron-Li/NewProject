/*
 * @Description: Object类中toString()的使用
 * @version: JDK17
 * @Author: Aaron.Li
 * @Date: 2022-03-10 13:16:48
 * @LastEditTime: 2022-03-10 18:22:27
 */
package com.experience.day13.java3;

/*
 * Object类中toString（）的使用：
 * 
 * 1.当我们输出一个对象的引用时，实际上就是调用当前对象的toString()
 * 
 * 2.Object类中toString()的定义：
 * public String toString() {//这里@前面部分是返回类名，后面部分得到一个堆空间的位置hash值，并以十六进制输出
 * return getClass().getName() + "@" + Integer.toHexString(hashCode());
 * }
 * 例：com.experience.day13.java3.Customer@251a69d7
 * 
 * 3.像String、Date、File、包装类等都重写了Object类中的toString()方法。使得在调用对象的toString()时，
 * 返回“实体内容”信息。
 * 
 * 4.自定义类也可以重写toString()方法，当调用此方法时，返回对象的“实体内容”。
 * 
 */
public class ToStringTest {
    public static void main(String[] args) {
        Customer testOne = new Customer("tom", 21);
        System.out.println(testOne.toString());// 重写toString方法以前，输出地址值
        System.out.println(testOne);// 输重写toString方法以前，出地址值
        String str = new String("MM");
        System.out.println(str);// 重写过toSting()方法

    }
}
