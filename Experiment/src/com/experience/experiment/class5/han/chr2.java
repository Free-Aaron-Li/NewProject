/*
 * @Description: 
 * @version: JDK17
 * @Author: Aaron.Li
 * @Date: 2022-03-09 20:47:49
 * @LastEditTime: 2022-03-09 20:52:46
 */
package han;

import java.util.Scanner;

public class chr2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name = scanner.next();
        System.out.println("请输入成绩：");
        String grade = scanner.next();
        System.out.println("“" + name + "同学你好！你的成绩为" + grade + "分！”");
    }
}
