package com.homework.java4;

import java.sql.*;

/**
 * @projectName: newJavaProject
 * @className: TestFinal
 * @author: AaronLi
 * @description: nothing
 * @date: 2022/6/10 23:13
 * @version: JDK17
 */
public class TestFinal {
    /**
     * @param
     * @return: connection
     * @date: 2022/6/10 23:33
     * @description: 创建MySQL连接
     */
    private static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection;
        return connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student?useUnicode=true&characterEncoding=UTF-8", "root", "123456");
    }

    /**
     * @param
     * @return:
     * @date: 2022/6/10 23:34
     * @description: 遍历结果集
     */
    private static void traverse() throws SQLException {
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            String sql = "SELECT id,name,age,phone FROM student";
            statement = getConnection().createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                System.out.println("学号：" + resultSet.getInt("id") + "\t姓名：" + resultSet.getString("name") +
                        "\t年龄：" + resultSet.getInt("age") + "\t电话号码：" + resultSet.getString("phone"));
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
                if (resultSet != null) {
                    resultSet.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * @param：age
     * @return:
     * @date: 2022/6/10 23:40
     * @description: 通过PreparedStatement对象查询数据库，
     * 将student表中age>?记录显示出来
     */
    public static void Inquire(int age) throws SQLException {

        PreparedStatement prepareStatement = null;
        try {
            prepareStatement = getConnection().prepareStatement("SELECT * FROM student WHERE age>?");
            prepareStatement.setInt(3, age);
            prepareStatement.executeUpdate();
        } catch (ClassNotFoundException e1) {
            throw new RuntimeException(e1);
        } finally {
            try {
                if (prepareStatement != null) {
                    prepareStatement.close();
                    prepareStatement = null;
                }
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        }
    }

    /**
    * @param null
    * @return:
    * @date: 2022/6/11 0:03
    * @description: 删除一条记录
    */
}
