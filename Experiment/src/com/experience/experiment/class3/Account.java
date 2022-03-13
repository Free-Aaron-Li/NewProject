package com.experience.experiment.class3;
/*
 * @author: Aaron.Li
 * @date: 2022 - 02 - 26 - 下午4:47
 * @project: newJavaProject
 * @version: JDK17.0.2
 */

/**
 * @ClassName Account
 * @Description 类的继承
 * @Author Aaron-Li
 * @Date 2022 - 02 - 26 - 下午4:47
 * @Version JDK17
 */
public class Account {
    private int id;//账号
    private double balance;//余额
    private double annualInterestRate;//年利率

    public Account() {

    }

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    /**
     * Description: 月利率
     */
    public double getMonthlyIntertest() {
        return annualInterestRate / 12.0;
    }

    /**
     * Description: 提款
     */
    public void withdraw(double amount) {
        if (balance < amount) {
            System.out.println("余额不足！" + "\n" + "您的账户余额为：" + balance + "\n");
        } else {
            balance -= amount;
        }
    }

    /**
     * Description: 存款
     */
    public void deposit(double amount) {
        balance += amount;
        System.out.println("您的账户余额为：" + balance + "\n" + "月利率为：" + getMonthlyIntertest());
    }
}
