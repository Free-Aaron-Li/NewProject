/*
 * @Description: 
 * @version: JDK17
 * @Author: Aaron.Li
 * @Date: 2022-03-10 20:53:05
 * @LastEditTime: 2022-03-10 21:18:11
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle test = new Circle(2, "white", 1.0);
        Circle testOne = new Circle(2, "white", 1.0);
        System.out.println("颜色是否相同：" + test.getColor().equals(testOne.getColor()));
        System.out.println("半径是否相同；" + test.equals(testOne));
        System.out.println(test);
        System.out.println(testOne.toString());
    }
}
