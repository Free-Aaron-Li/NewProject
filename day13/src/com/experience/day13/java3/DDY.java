package com.experience.day13.java3;

import com.experience.day13.java1.Person;

/*
 * @author: Aaron.Li
 * @date: 2022 - 03 - 06 - 下午3:49
 * @project: NewProject
 * @version: JDK17.0.2
 */
/*
 * @ClassName DDY
 * @Description
 * @Author Aaron-Li
 * @Date 2022 - 03 - 06 - 下午3:49
 * @Version
 */
public class DDY {
    public static void main(String[] args) {
        Person1 test = new Person1();
        test.speakHello();
    }
}
class  Person1 {
    public void speakHello() {
        Person1 test = new Person1();
        test.speakHello();
        System.out.println("您好，很高兴认识您");
        System.out.println("nice to meet you");
    }
}

