package com.experience.experiment.exer1;
/*
 * @author: Aaron.Li
 * @date: 2022 - 02 - 10 - 下午4:10
 * @project: untitled1
 * @version: JDK17.0.2
 */

/**
 * @ClassName Customer
 * @Description 关于银行的类模拟用户
 * @Author Aaron-Li
 * @Date 2022 - 02 - 10 - 下午4:10
 * @Version JDK17
 */
public class Customer {
    private String firstName;
    private String lastName;
    private BankAccount account;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setAccount(BankAccount account) {
        this.account = account;
    }

    public BankAccount getAccount() {
        return account;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
