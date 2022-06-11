package com.homework.java4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestTwo {
    public static void main(String[] args) {
        Statement statement = null;
        Connection connection = null;
        ResultSet resultSet = null;
        try {
            // 一、装载驱动
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 二、建立数据库的连接
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/student?", "root", "123456");
            String sql = "insert into student values (6,'冬冬',25,'12345678916')";
            String sqlOne = "update student set name='李勇',age=22 where id=6";
            String sqlTwo = "delete  from student where id=6";
            statement = connection.createStatement();
//			statement.executeUpdate(sql);
//			statement.execute(sqlOne);
            statement.execute(sqlTwo);
        } catch (SQLException e) {
            System.out.println("Exception" + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Exception" + e.getMessage());
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception e) {
                System.out.println("Exception" + e.getMessage());
            }
        }
    }
}
