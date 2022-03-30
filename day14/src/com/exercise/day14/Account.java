package com.exercise.day14;

/**
 * @projectName: newJavaProject
 * @className: Account
 * @author: AaronLi
 * @description: 编写一个类实现银行账户的概念，包含的属性“账户”、“密码”、“存款余额”、“利率”、“最下余额”。
 * 定义封装这些属性的方法。账号要自动生成。
 * 编写主类，使用银行账户类，输入、输出3个储户的上述信息。
 * 考虑：哪些属性可以设计成static属性。
 * @date: 2022/3/30 13:53
 * @version: JDK17
 */
public class Account {
    private int id = 0;
    private String password = "000000";
    private int balance = 0;
    private static double interestRate = 0;
    private static double minBalance = 0;
    private static int init = 1001;//用于生成id使用

    public Account() {
        id=init++;
    }



    public Account(String password, int balance) {
        this();
        this.password = password;
        this.balance = balance;
    }

    public int getNumber() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public int getBalance() {
        return balance;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static double getMinBalance() {
        return minBalance;
    }

    public void setNumber(int number) {
        this.id = number;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public static void setMinBalance(double minBalance) {
        Account.minBalance = minBalance;
    }

    public static void setInterestRate(double interestRate) {
        Account.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                '}';
    }
}
