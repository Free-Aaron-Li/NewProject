
/*
 * @Description:
 * @Version: JDK17
 * @Author: Aaron.Li
 * @Date: 2022-03-20 15:15:03
 * @LastEditors: Aaron.Li
 * @LastEditTime: 2022-03-20 16:14:57
 */
public class TestOne {
    public static void main(String[] args) {
        PrintWords p = new PrintWords();
        Thread t = new Thread(p);
        t.start();
        p.run();
    }
}

class PrintWords implements Runnable {
    int i = 0;
    String str[] = { "Yes", "No" };

    public void run() {
        while (i < 2) {
            System.out.println("Y or N " + str[i++]);
        }
    }

    public void run(int j) {
        while (j >= 1) {
            System.out.println("Hello " + j--);
        }
    }
}
