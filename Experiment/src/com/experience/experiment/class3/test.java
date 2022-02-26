package com.experience.experiment.class3;
/*
 * @author: Aaron.Li
 * @date: 2022 - 02 - 26 - 下午5:09
 * @project: newJavaProject
 * @version: JDK17.0.2
 */

/**
 * @ClassName test
 * @Description Account类测试
 * @Author Aaron-Li
 * @Date 2022 - 02 - 26 - 下午5:09
 * @Version JDK17
 */
public class test {
    public static void main(String[] args) {
//        Account test = new Account(1122,20000,0.045);
//        test.withdraw(30000);
//        test.withdraw(2500);
//        test.deposit(3000);
        CheckAccount testOne = new CheckAccount(1122,20000,0.025,5000);
        testOne.withdraw(5000);
        testOne.withdraw(18000);
        testOne.withdraw(3000);
    }
}
