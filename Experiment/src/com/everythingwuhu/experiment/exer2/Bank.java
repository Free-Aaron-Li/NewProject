package com.everythingwuhu.experiment.exer2;
/*
 * @author: Aaron.Li
 * @date: 2022 - 02 - 10 - 下午4:46
 * @project: untitled1
 * @version: JDK17.0.2
 */

/**
 * @ClassName Bank
 * @Description exer1加强版
 * @Author Aaron-Li
 * @Date 2022 - 02 - 10 - 下午4:46
 * @Version JDK17
 */
public class Bank {
    private Customer[] customers;//存放多个客户的数组
    private int numberOfCustomer;//记录客户数量

    public Bank() {
        customers = new Customer[10];
    }

    /**
     * @Description 添加客户姓名
     */
    public void addCustomer(String firstName, String lastName) {
        Customer i = new Customer(firstName, lastName);
        customers[numberOfCustomer] = i;
        numberOfCustomer++;
    }

    /**
     * @Description 获取客户的个数
     */
    public int getNumberOfCustomer() {
        return numberOfCustomer;
    }

    /**
     * @Description 获取指定位置上的客户
     */
    public Customer getCustomer(int index) {
        if (index >= 0 && index < numberOfCustomer) {
            return customers[index];
        }
        return null;
    }
}
