package java4;

import org.junit.Test;

/*
 * @Description: JUnitTest测试
 * @version: JDK17
 * @Author: Aaron.Li
 * @Date: 2022-03-11 01:12:16
 * @LastEditTime: 2022-03-11 01:35:35
 */
/*
 * 1.创建Java类，进行单元测试
 * 
 * 2.此时的Java类：①此类是public的 ②此类提供公共的无参的构造器
 * 
 * 3.类中单元测试方法：
 * 此时的单元测试方法：方法的权限是public，没有返回值，没有形参
 * 
 * 4.此单元测试方法上需要声明注解：@Test,并在单元测试类中导入：import org.junit.Test;
 * 
 * 5.声明好单元测试以后，就可以在方法体内测试相关的代码。
 */
public class JUnitTest {
    int num = 10;

    @Test
    public void testEquals() {
        String testOne = "MM";
        String testTwo = "MM";
        System.out.println(testOne.equals(testTwo));
        System.out.println(num);
    }

    @Test
    public void testToString(){
        String testOne="MM";
        System.out.println(testOne.toString());
    }
}
