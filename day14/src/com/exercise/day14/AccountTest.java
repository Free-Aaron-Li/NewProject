package com.exercise.day14;

/**
 * @projectName: newJavaProject
 * @className: AccountTest
 * @author: AaronLi
 * @description: TODO
 * @date: 2022/3/30 14:12
 * @version: JDK17
 */
public class AccountTest {
    public static void main(String[] args) {
        Account testOne = new Account();
        Account testTwo = new Account("123456", 666);
        Account.setInterestRate(0.012);
        Account.setMinBalance(100);
        System.out.println(testOne);
        System.out.println(testTwo);
        System.out.println(testOne.getInterestRate());
        System.out.println(testOne.getMinBalance());
    }
}
