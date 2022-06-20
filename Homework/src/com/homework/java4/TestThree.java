package com.homework.java4;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @projectName: newJavaProject
 * @className: TestThree
 * @author: AaronLi
 * @description: nothing
 * @date: 2022/6/11 14:10
 * @version: JDK17
 */
public class TestThree {
    public static void test(int id) {
        PreparedStatement statement = null;
        Connection connection = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 二、建立数据库的连接
           connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/student?", "root", "123456");
           statement=connection.prepareStatement("SELECT * WHERE id=?");
           statement.setInt(1,id);
           statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        test(1);
    }
}
