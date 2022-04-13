package com.experience.experiment.class7;
/*
 * @Description:
 * @Version: JDK17
 * @Author: Aaron.Li
 * @Date: 2022-03-15 17:30:51
 * @LastEditors: Aaron.Li
 * @LastEditTime: 2022-03-22 17:44:48
 */

import java.util.Scanner;
import java.util.Vector;

/*
 * @Description:
 * 利用Vector代替数组处理：从键盘读入学生成绩（以负数代表输入结束），找出最高分，并输出学生成绩等级。
 * 提示：数组一旦创建，长度就固定不变，所以在创建数组前就需要知道它的长度。
 * 而向量类java.util.Vector可以根据需要动态伸缩。
 * 创建Vector对象：Vector v=new Vector();
 * 给向量添加元素：v.addElment(Object obj); //obj必须时对象
 * 取向量中的元素：Object obj=v.elementAt(0);
 * 注意第一个元素的下标是0，返回值是Object类型的。
 * 计算向量的长度：v.size();
 * 若是最高分相差10分内：A等；20分内：B等；30分内：C等；其他：D等。·
 * @version: JDK17
 * @Author: Aaron.Li
 * @Date: 2022-03-11 00:39:46
 * @LastEditTime: 2022-03-15 19:58:27
 */

public class ScoreTest {
    public static void main(String[] args) {
        // ①.实例化Scanner，用于从键盘获取学生成绩
        Scanner scanner = new Scanner(System.in);

        // ②.创建Vector对象：Vector v=new Vector();相当于原先数组
        Vector<Integer> vector = new Vector<Integer>();

        // ③.通过for(;;);或while(true)方式，给Vector中添加数组：v.addElement(Object obj);
        int maxScore = 0;
        for (; ; ) {
            System.out.println("请输入学生成绩（负数代表输入结束）");
            int score = scanner.nextInt();
            // ④.当输入是负数，跳出循环
            if (score < 0) {
                break;
            }
            if (score > 100) {
                System.out.println("输入的数据非法");
                continue;
            }
            vector.addElement(score);// 自动装箱
            // ⑤.获取学生成绩最大值
            if (maxScore < score) {
                maxScore = score;
            }
        }
        scanner.close();
        // ⑥.遍历Vector，得到每个学生的成绩，并与最大成绩相比，获取学生的成绩等级
        char level;
        for (int i = 0; i < vector.size(); i++) {
            Object obj = vector.elementAt(i);
            int score = (int) obj;// 自动拆箱
            switch ((maxScore - score) / 10) {
                case 0:
                    level = 'A';
                    break;
                case 1:
                    level = 'B';
                    break;
                case 2:
                    level = 'C';
                    break;
                default:
                    level = 'D';
            }
            System.out.print("Student-" + i + " score is " + score + ",level is " + level + "\n");
        }
        scanner.close();
    }

}
