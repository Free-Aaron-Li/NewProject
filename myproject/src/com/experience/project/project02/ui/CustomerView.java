package com.experience.project.project02.ui;
/*
 * @author: Aaron.Li
 * @date: 2022 - 02 - 13 - 下午10:31
 * @project: untitled1
 * @version: JDK17.0.2
 */

import com.experience.project.project02.bean.Customer;
import com.experience.project.project02.service.CustomerList;
import com.experience.project.project02.util.CMUtility;

/**
 * @ClassName CustomerView
 * @Description CustomerView为主模块，负责菜单的显示和处理用户操作
 * @Author Aaron-Li
 * @Date 2022 - 02 - 13 - 下午10:31
 * @Version JDK17
 */
public class CustomerView {
    private CustomerList customerList = new CustomerList(10);

    /**
     * @author Aaron-Li
     * @Description 显示用户界面操作
     * @Date 上午11:19 - 022/2/16
     * @Param a
     * @Return a
     */
    public void enterMainMenu() {
        boolean isFlag=true;
        while(isFlag) {
            System.out.println("\n---------------客户信息管理软件---------------");
            System.out.println("                 1.添加客户：");
            System.out.println("                 2.修改客户：");
            System.out.println("                 3.删除客户：");
            System.out.println("                 4.客户列表：");
            System.out.println("                 5.退出\n");
            System.out.print("请选择（1～5）：");
            char menu=CMUtility.readMenuSelection();
            switch(menu){
                case '1':{
                    addNewCustomer();
                    break;
                }
                case '2':{
                    modifyCustomer();
                    break;
                }
                case '3':{
                    deleteCustomer();
                    break;
                }
                case'4':{
                    listAllCustomers();
                    break;
                }
                case '5':{
                    System.out.println("退出");
                    System.out.println("确认是否退出（Y/N）：");
                    break;
                }
            }
           // isFlag=false;
        }
    }

    /**
     * @author Aaron-Li
     * @Description 添加客户操作
     * @Date 上午11:14 -2022/2/16
     * @Param a
     * @Return a
     */
    private void addNewCustomer() {
        System.out.println("添加客户操作");
    }

    /**
     * @author Aaron-Li
     * @Description 修改客户操作
     * @Date 上午11:14 -2022/2/16
     * @Param a
     * @Return a
     */
    private void modifyCustomer() {
        System.out.println("修改客户操作");
    }

    /**
     * @author Aaron-Li
     * @Description 删除客户操作
     * @Date 上午11:14 -2022/2/16
     * @Param a
     * @Return a
     */
    private void deleteCustomer() {
        System.out.println("删除客户操作");
    }

    /**
     * @author Aaron-Li
     * @Description 显示客户列表操作
     * @Date 上午11:14 -2022/2/16
     * @Param a
     * @Return a
     */
    private void listAllCustomers() {
        System.out.println("显示客户列表操作");
    }

    /**
     * @author Aaron-Li
     * @Description 测试
     * @Date 上午11:22 -2022/2/16
     * @Param a
     * @Return a
     */
    public static void main(String[] args) {
        CustomerView test = new CustomerView();
        test.enterMainMenu();
    }
}
