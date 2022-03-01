package com.experience.project.project01.ui;
/*
 * @author: Aaron.Li
 * @date: 2022 - 02 - 13 - 下午10:31
 * @project: untitled1
 * @version: JDK17.0.2
 */

import com.experience.project.project01.bean.Customer;
import com.experience.project.project01.service.CustomerList;
import com.experience.project.project01.util.CMUtility;

/**
 * @ClassName CustomerView
 * @Description CustomerView为主模块，负责菜单的显示和处理用户操作
 * @Author Aaron-Li
 * @Date 2022 - 02 - 13 - 下午10:31
 * @Version JDK17
 */
public class CustomerView {
    private CustomerList customerList = new CustomerList(10);

    public CustomerView() {
        Customer customer = new Customer("张三", '男', 22, "23456789021", "34817@qq.com");
        customerList.addCustomer(customer);
    }
/**
 * Description: 用户操作界面
 */
    public void enterMainMenu() {
        boolean isFlag = true;
        while (isFlag) {
            System.out.println("\n---------------客户信息管理软件---------------");
            System.out.println("                 1.添加客户：");
            System.out.println("                 2.修改客户：");
            System.out.println("                 3.删除客户：");
            System.out.println("                 4.客户列表：");
            System.out.println("                 5.退出\n");
            System.out.print("请选择（1～5）：");
            char menu = CMUtility.readMenuSelection();
            switch (menu) {
                case '1': {
                    addNewCustomer();
                    break;
                }
                case '2': {
                    modifyCustomer();
                    break;
                }
                case '3': {
                    deleteCustomer();
                    break;
                }
                case '4': {
                    listAllCustomers();
                    break;
                }
                case '5': {
                    System.out.println("退出");
                    System.out.println("确认是否退出（Y/N）：");
                    char isExit = CMUtility.readConfirmSelection();
                    if (isExit == 'Y') {
                        isFlag = false;
                    }
                    break;
                }
            }
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
        System.out.println("------------------添加客户------------------\n");
        System.out.print("姓名：");
        String name = CMUtility.readString(10);
        System.out.print("性别：");
        char gender = CMUtility.readChar();
        System.out.print("年龄：");
        int age = CMUtility.readInt();
        System.out.print("电话：");
        String phone = CMUtility.readString(13);
        System.out.print("邮箱：");
        String email = CMUtility.readString(30);
        //将上述数据封装到对象中
        Customer customer = new Customer(name, gender, age, phone, email);
        boolean isSuccess = customerList.addCustomer(customer);
        if (isSuccess) {
            System.out.println("-----------------添加成功------------------\n");
        } else {
            System.out.println("------------客户目录已满，添加失败------------\n");
        }
    }

    /**
     * @author Aaron-Li
     * @Description 修改客户操作
     * @Date 上午11:14 -2022/2/16
     * @Param a
     * @Return a
     */
    private void modifyCustomer() {
        System.out.println("------------------修改客户------------------\n");
        Customer cust;
        int number;
        for (; ; ) {
            System.out.print("请选择待修改客户的编号（-1返回）：");
            number = CMUtility.readInt();
            if (number == -1) {
                return;
            }
            cust = customerList.getCustomer(number - 1);
            if (cust == null) {
                System.out.println("无法找到指定客户");
            } else {//找到相应客户
                break;
            }
        }
        //修改客户信息
        System.out.print("姓名（" + cust.getName() + "）：");
        String name = CMUtility.readString(10, cust.getName());
        System.out.print("性别（" + cust.getGender() + "）：");
        char gender = CMUtility.readChar(cust.getGender());
        System.out.print("年龄（" + cust.getAge() + "）：");
        int age = CMUtility.readInt(cust.getAge());
        System.out.print("电话（" + cust.getPhone() + "）：");
        String phone = CMUtility.readString(13, cust.getPhone());
        System.out.print("邮箱（" + cust.getEmail() + "）：");
        String email = CMUtility.readString(30, cust.getEmail());
        Customer newCust = new Customer(name, gender, age, phone, email);
        boolean isReplaced = customerList.replaceCustomer(number - 1, newCust);
        if (isReplaced) {
            System.out.println("------------------修改完成------------------\n");
        } else {
            System.out.println("------------------修改失败------------------\n");
        }//其实不必添加else,程序执行不到这一步。为了完整性，添加而已。
    }

    /**
     * @author Aaron-Li
     * @Description 删除客户操作
     * @Date 上午11:14 -2022/2/16
     * @Param a
     * @Return a
     */
    private void deleteCustomer() {
        System.out.println("------------------删除客户------------------\n");
        int number;
        for (; ; ) {
            System.out.print("请选择待删除客户的编号（-1返回）：");
            number = CMUtility.readInt();

            if (number == -1) {
                return;
            }
            Customer customer = customerList.getCustomer(number - 1);
            if (customer == null) {
                System.out.println("无法找到指定客户");
            } else {
                break;
            }
        }
        //找到指定客户
        System.out.println("是否确认删除（Y/N）");
        char isDelete = CMUtility.readConfirmSelection();
        if (isDelete == 'Y') {
            boolean deleteSuccess =customerList.deleteCustomer(number - 1);
            if (deleteSuccess){
                System.out.println("------------------删除成功------------------\n");
            }else{
                System.out.println("------------------删除失败------------------\n");
            }//同修改客户，else也是无法执行的
        }
    }

    /**
      * @author Aaron-Li
      * @Description 显示客户列表操作
      * @Date 上午11:14 -2022/2/16
      * @Param a
      * @Return a
      */
    private void listAllCustomers() {
        System.out.println("------------------客户列表------------------\n");
        int total = customerList.getTotal();
        if (total == 0) {
            System.out.println("没有客户记录！");
        } else {
            System.out.println("编号\t\t姓名\t\t性别\t\t年龄\t\t\t电话\t\t\t\t邮箱");
            Customer[] custs = customerList.getAllCusomers();
            for (int i = 0; i < total; i++) {
                Customer cust = custs[i];
                System.out.println((i + 1) + "\t\t" + cust.getName() + "\t\t" + cust.getGender() + "\t\t" + cust.getAge() + "\t\t" + cust.getPhone() + "\t\t" + cust.getEmail());
            }
        }
        System.out.println();
        System.out.println("-----------------客户列表完成----------------");
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
