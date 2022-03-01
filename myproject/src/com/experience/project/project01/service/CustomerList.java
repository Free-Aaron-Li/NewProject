package com.experience.project.project01.service;
/*
 * @author: Aaron.Li
 * @date: 2022 - 02 - 13 - 下午10:28
 * @project: untitled1
 * @version: JDK17.0.2
 */

import com.experience.project.project01.bean.Customer;

/**
 * @ClassName CustomerList
 * @Description CustomerList为Customer对象的管理模块，内部用数组管理一组Customer对象，
 * 并提供相应的添加、修改、删除和遍历方法，供CustomerView调用
 * @Author Aaron-Li
 * @Date 2022 - 02 - 13 - 下午10:28
 * @Version JDK17
 */
public class CustomerList {
    private Customer[] customers;   //由于保存客户对象的数组
    private int total = 0;          //记录已保存客户的数量

    /**
     * 构造器，用来初始化customers数组；
     *
     * @param totalCustomer :指定customers数组的最大值
     */
    public CustomerList(int totalCustomer) {
        customers = new Customer[10];
    }

    /**
     * @author Aaron-Li
     * @Description 将指定的客户添加到数组中
     * @Date 下午11:15 -2022/2/15
     * @Param customer
     * @Return true:添加成功；false：添加失败;
     */
    public boolean addCustomer(Customer customer) {
        if (total >= customers.length) {
            return false;
        } else {
            customers[total++] = customer;
            return true;
        }
    }

    /**
     * @param cust
     * @author Aaron-Li
     * @Description 修改指定索引位置的客户信息
     * @Date 下午11:22 -2022/2/15
     * @Param index
     * @Return true:修改成功，false：修改失败
     */
    public boolean replaceCustomer(int index, Customer cust) {
        if (index < 0 || index >= total) {
            return false;
        } else {
            customers[index] = cust;
            return true;
        }
    }

    /**
     * @author Aaron-Li
     * @Description 删除指定索引位置的客户
     * @Date 下午11:30 -2022/2/15
     * @Param index
     * @Return true:删除成功，false:删除失败；
     */
    public boolean deleteCustomer(int index) {
        if (index < 0 || index >= total) {
            return false;
        } else {
            for (int i = index; i < total - 1; i++) {
                customers[i] = customers[i + 1];
            }
            //最后有数据的元素需要置空
//            customers[total-1]=null;
//            total--;
            //或者
            customers[--total] = null;
            return true;
        }
    }

    /**
     * @author Aaron-Li
     * @Description 获取所有客户的信息
     * @Date 下午11:41 -2022/2/15
     * @Param a
     * total
     * @Return a
     */
    public Customer[] getAllCusomers() {
        Customer[] custs = new Customer[total];
        for (int i = 0; i < total; i++) {
            custs[i] = customers[i]; //赋地址值？
        }
        return custs;
    }


    /**
     * @author Aaron-Li
     * @Description 获取指定索引位置上的客户
     * @Date 下午11:58 -2022/2/15
     * @Param index
     * @Return 如果找到了元素，则返回；如果没有找到，则返回null;
     */
    public Customer getCustomer(int index) {
        if (index < 0 || index >= total) {
            return null;
        }
        return customers[index];
    }

    /**
     * @author Aaron-Li
     * @Description 获取存储的客户的数量
     * @Date 上午12:01 -2022/2/16
     * @Return 返回total
     */
    public int getTotal() {
        return total;
    }
}
