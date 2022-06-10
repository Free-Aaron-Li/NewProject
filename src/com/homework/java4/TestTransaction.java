package com.homework.java4;

import java.sql.*;

/**
 * @projectName: newJavaProject
 * @className: TestTranslation
 * 事务
 * @author: AaronLi
 * @description: nothing
 * @date: 2022/6/10 22:24
 * @version: JDK17
 */
public class TestTransaction {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            //建立连接
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student?useUnicode=true&characterEncoding=UTF-8", "root", "123456");

            //关闭自动提交
            connection.setAutoCommit(false);
            //建立statement
            statement = connection.createStatement();
            statement.addBatch("insert into student values (3, '王五', 22,'12345678913')");
            statement.addBatch("insert into student values (4, '赵六', 21,'12345678915')");
            statement.addBatch("insert into student values (5, '王大', 21,'12345678917')");
            statement.executeBatch();
            //确定事务
            connection.commit();
            //开启自动提交
            connection.setAutoCommit(true);
            //遍历SQL语句
            String sql = "select * from student";

            resultSet = statement.executeQuery(sql);

            // 遍历记录集
            while (resultSet.next()) {
                System.out.println("id is " + resultSet.getInt("id") + ", name is "
                        + resultSet.getString("name") + ", age is "
                        + resultSet.getInt("age") + ", phone number is "
                        + resultSet.getString("phone"));
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Exception" + e.getMessage());
        } catch (SQLException e) {
            e.printStackTrace();
            try {
                if (connection != null) {
                    connection.rollback();
                    System.out.println("回滚数据");
                    connection.setAutoCommit(true);
                }
            } catch (SQLException e1) {
                e1.printStackTrace();
            } finally {
                try {
                    if (statement != null) {
                        statement.close();
                    }
                    if (connection != null) {
                        connection.close();
                    }
                    if(resultSet!=null){
                        resultSet.close();
                    }
                } catch (SQLException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }
}
