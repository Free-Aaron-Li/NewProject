package han;

/*
 * @Description: 
 * @version: JDK17
 * @Author: Aaron.Li
 * @Date: 2022-03-09 20:04:14
 * @LastEditTime: 2022-03-09 22:08:53
 */
import java.util.Scanner;

public class math {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个四位数：");
        int num = scanner.nextInt();
        int thousand = num / 1000;
        int hundred = num % 1000 / 100;
        int ten = num % 1000 % 100 / 10;
        int one = num % 1000 % 100 % 10;
        int numOne = thousand + hundred * 10 + ten * 100 + one * 1000;
        System.out.println(numOne);

    }
}
/*
 * @Description:
 * 
 * @version: JDK17
 * 
 * @Author: Aaron.Li
 * 
 * @Date: 2022-03-09 20:04:14
 * 
 * @LastEditTime: 2022-03-09 20:04:15
 */
