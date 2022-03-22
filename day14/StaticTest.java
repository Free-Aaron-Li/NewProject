
/*
 * @Description:
 * 1.static:静态的
 * 2.static可以用来修饰：属性、方法、代码块、内部类
 *
 * 3.使用static修饰属性
 *
 * 4.使用static修饰方法
 * @Version: JDK17
 * @Author: Aaron.Li
 * @Date: 2022-03-22 18:23:16
 * @LastEditors: Aaron.Li
 * @LastEditTime: 2022-03-22 18:36:32
 */
public class StaticTest {
    public static void main(String[] args) {
        Chinese aChineseOne = new Chinese();
        aChineseOne.name = "园长";
        aChineseOne.age = 22;
        Chinese aChineseTwo = new Chinese();
        aChineseTwo="马龙";
        aChineseTwo=30;
    }
}

class Chinese {
    String name;
    int age;
}
