package com.homework.java4;

import java.sql.*;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException,
            SQLException {
        // 一、装载驱动
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 二、建立数据库的连接
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/student?", "root", "123456");

        // 三、执行SQL语句
        String sql = "select * from student";
        /**
         * 1.Statement：是 Java 执行数据库操作的一个重要接口，用于在已经建立数据库连接的基础上，向数据库发送要执行的SQL语句。Statement对象，用于执行不带参数的简单SQL语句。
         */
        Statement statement = connection.createStatement();
        /**
         * 2.ResultSet：封装了结果集的对象：内部有一个可移动的光标，默认情况，指向第一条记录集的上一条记录：
         * 3.executeQuery：Statement类中方法来下达select指令以查询数据库，executeQuery()方法会把数据库响应的查询结果存放在ResultSet类对象中供我们使用。
         */
        ResultSet resultSet = statement.executeQuery(sql);

        // 四、遍历记录集
        while (resultSet.next()) {
            System.out.println("id is " + resultSet.getInt("id") + ", name is "
                    + resultSet.getString("name") + ", age is "
                    + resultSet.getInt("age") + ", phone number is "
                    + resultSet.getString("phone"));
        }

        //五、关闭资源
        //关闭资源顺序：①关闭结果集、②关闭命令、③关闭连接
        resultSet.close();
        statement.close();
        connection.close();
    }
}
