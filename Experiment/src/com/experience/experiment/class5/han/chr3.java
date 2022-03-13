/*
 * @Description: 
 * @version: JDK17
 * @Author: Aaron.Li
 * @Date: 2022-03-09 20:53:15
 * @LastEditTime: 2022-03-09 22:14:47
 */
package han;

import java.util.Scanner;

public class chr3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("请输入单词：");
            String wordOne = scanner.nextLine();
            char[] word = new char[wordOne.length()];
            for (int i = 0; i < wordOne.length(); i++) {
                word[i] = wordOne.charAt(i);
            }
            if (word[0] > 97) {
                int num = word[0] - 32;
                word[0] = (char) num;
            }
            for (int i = 1; i < word.length; i++) {
                if (word[i] < 97) {
                    int numOne = word[i] + 32;
                    word[i] = (char) numOne;
                }
            }
            for (int i = 0; i < word.length; i++) {
                System.out.print(word[i]);
            }
        }
    }
}
