import org.junit.Test;

/*
 * @Description:
 * 包装类的使用：
 * 1.Java提供了8种基本数据类型对应的包装类，使得基本数据类型变量具有类的特征
 *
 * 2.掌握:基本数据类型，包装类和String三者之间的转换
 * @version: JDK17
 * @Author: Aaron.Li
 * @Date: 2022-03-11 17:20:27
 * @LastEditTime: 2022-03-14 14:09:48
 */
public class WrapperTest {
    // 包装类--->基本数据类型：调用
    // String类型--->基本数据类型、包装类：调用包装类的passXxx()
    @Test
    public void testFive() {
        String strOne = "123";
        // 这是错误的
        // int numOne=(int)strOne;
        int numOne=Integer.parseInt(strOne);
        System.out.println(numOne+1);
    }

    // 基本数据类型、包装类--->String类型：调用String重载的valueOf(Xxx xxx)
    @Test
    public void testFour() {
        int numOne = 10;
        // 方式1：连接运算
        String strOne = numOne + "";
        System.out.println(strOne);
        // 方式2：调用String的valueOf(Xxx xxx)
        float floatOne = 12.3f;
        String strTwo = String.valueOf(floatOne);
        System.out.println(strTwo);

        String strFour="true";
        boolean booleanOne=Boolean.parseBoolean(strFour);
        System.out.println(booleanOne);

        Double doubleOne = new Double(12.4);
        String strThree = String.valueOf(doubleOne);
        System.out.println(strThree);// "12.4"
    }

    /**
     * JDK 5.0新特性：自动装箱和自动拆箱
     *
     * @param obj
     */
    @Test
    public void testThree() {
        // int numOne = 10;
        // // 基本数据类型--->包装类的对象
        // method(numOne);

        // 自动装箱：基本数据类型--->包装类
        int numTwo = 100;
        Integer intOne = numTwo;
        boolean booleanOne = true;
        Boolean booleanTwo = booleanOne;
        System.out.println(intOne + " " + booleanTwo);

        // 自动拆箱：包装类--->基本数据类型
        System.out.println(intOne.toString());
        int numThree = intOne;
        System.out.println(numThree);
    }

    public void method(Object obj) {

    }

    // 包装类--->基本数据类型:调用包装类Xxx的XxxValue()
    @Test
    public void testTwo() {
        // Integer intOne = new Integer(12);
        // int i1 = intOne.intValue();
        // System.out.println(i1 + 1);

        // Float floatOne = new Float(12.3);
        // float f1 = floatOne.floatValue();
        // System.out.println(f1 + 3);
    }

    // 基本数据类型--->包装类，调用包装类的构造器
    @Test
    public void testOne() {
        // int numOne = 10;
        // Integer intOne = new Integer(numOne);
        // System.out.println(intOne.toString());
        // Integer intTwo = new Integer("123");
        // System.out.println(intTwo);
        // Float floatOne = new Float(12.3);
        // System.out.println(floatOne);
        // Boolean booleanOne = new Boolean(true);
        // Boolean booleanTwo = new Boolean("true");
        // Boolean booleanThree = new Boolean("true123");
        // System.out.println(booleanOne + " " + booleanTwo + " " + booleanThree);
        // Order order = new Order();
        // System.out.println(order.isMale);// false
        // System.out.println(order.isFemale);// null
    }
}

class Order {
    boolean isMale;
    Boolean isFemale;
}