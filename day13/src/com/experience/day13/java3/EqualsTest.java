import com.experience.day13.java3.Customer;

/*
 * @Description: 
 * @version: JDK17
 * @Author: Aaron.Li
 * @Date: 2022-03-02 15:29:39
 * @LastEditTime: 2022-03-08 19:43:16
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
 *
 * 二、equals()方法的使用：
 * 1.是一种方法，而非运算符
 * 2.只能适用于引用数据类型
 *
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
        System.out.println(i == d);
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
        System.out.println(test == testOne);// false
        System.out.println("*********");
        System.out.println(test.equals(testOne));// false
        System.out.println(testThree.equals(testFour));// true
    }
}
