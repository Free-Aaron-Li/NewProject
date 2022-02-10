package com.everythingwuhu.experiment.exer2;
/*
 * @author: Aaron.Li
 * @date: 2022 - 02 - 10 - 下午4:47
 * @project: untitled1
 * @version: JDK17.0.2
 */

/**
 * @ClassName Customer
 * @Description exer1加强版
 * @Author Aaron-Li
 * @Date 2022 - 02 - 10 - 下午4:47
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

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public BankAccount getAccount() {
        return account;
    }
}
