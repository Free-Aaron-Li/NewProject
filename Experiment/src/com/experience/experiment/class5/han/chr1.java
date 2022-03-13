/*
 * @Description: 
 * @version: JDK17
 * @Author: Aaron.Li
 * @Date: 2022-03-09 20:31:42
 * @LastEditTime: 2022-03-09 20:47:11
 */
package han;

import java.util.Scanner;

public class chr1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入名字：");
        String name = scanner.next();
        // 这里我用的是String类中的方法substring方法，String从根本上来讲就是char类型数组，所以我调用
        // substring方法就是定位数组,如果你想要看详细方法原理，可以看：http://c.biancheng.net/view/830.html
        System.out.println("姓：" + name.substring(0, 1));
        System.out.println("名：" + name.substring(1, 2));
    }

}
