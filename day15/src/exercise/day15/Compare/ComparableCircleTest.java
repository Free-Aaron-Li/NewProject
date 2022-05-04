package exercise.day15.Compare;

/**
 * @projectName: newJavaProject
 * @className: ComparableCircleTest
 * @author: AaronLi
 * @description: nothing
 * @date: 2022/5/4 19:55
 * @version: JDK17
 */
public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle One = new ComparableCircle(3.4);
        ComparableCircle Two = new ComparableCircle(3.5);
        int compareValue = One.compareTo(Two);
        if (compareValue > 0) {
            System.out.println("One对象大");
        } else if (compareValue < 0) {
            System.out.println("Two对象大");
        } else {
            System.out.println("二者一样大");
        }
        int compareValueOne = One.compareTo(new String("AA"));
        System.out.println(compareValueOne);
    }
}
