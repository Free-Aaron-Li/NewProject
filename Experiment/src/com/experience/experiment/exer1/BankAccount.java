package com.experience.experiment.exer1;
/*
 * @author: Aaron.Li
 * @date: 2022 - 02 - 10 - 下午3:54
 * @project: untitled1
 * @version: JDK17.0.2
 */

/**
 * @ClassName BankAccount
 * @Description 关于银行的类模拟账户
 * @Author Aaron-Li
 * @Date 2022 - 02 - 10 - 下午3:54
 * @Version JDK17
 */
public class BankAccount {
    private int id;//帐号
    private double balance;//余额
    private double annualInterestRate;//年利率

    public BankAccount(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void withdraw(double amount) {//取钱
        if (balance < amount) {
            System.out.println("余额不足，取款失败");
            return;
        }
        balance -= amount;
        System.out.println("成功取出：" + amount);
    }

    public void deposit(double amount) {//存钱
        if (amount > 0) {
            System.out.println("成功存入：" + amount);
            balance+=amount;
        }
    }
}
