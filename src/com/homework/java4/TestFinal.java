package com.homework.java4;

import java.sql.*;
import java.util.Scanner;

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
    private static void traverse() {
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
            System.out.println();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e1) {
            throw new RuntimeException(e1);
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
    public static void inquire(int age) {

        PreparedStatement prepareStatement = null;
        ResultSet resultSet = null;
        try {
            prepareStatement = getConnection().prepareStatement("SELECT * FROM student WHERE age>?");
            prepareStatement.setInt(1, age);
            resultSet = prepareStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println("学号：" + resultSet.getInt("id") + "\t姓名： "
                        + resultSet.getString("name") + "\t年龄："
                        + resultSet.getInt("age") + "\t电话号码："
                        + resultSet.getString("phone"));
            }
            System.out.println();
        } catch (ClassNotFoundException e1) {
            throw new RuntimeException(e1);
        } catch (SQLException e) {
            throw new RuntimeException(e);
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
     * @param id
     * @return:
     * @date: 2022/6/11 0:03
     * @description: 删除一条记录
     */
    public static void delete(int id) {
        PreparedStatement statement = null;
        try {
            statement = getConnection().prepareStatement("DELETE FROM student WHERE id=?");
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (ClassNotFoundException e1) {
            throw new RuntimeException(e1);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                    statement = null;
                }
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        }
    }

    /**
     * @param
     * @return:
     * @date: 2022/6/11 13:41
     * @description: 修改记录
     */
    public static void revise(int id) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("name修改为：");
        String name = scanner.next();
        System.out.println("age修改为：");
        int age = scanner.nextInt();
        System.out.println("phone修改为：");
        String phone = scanner.next();
        PreparedStatement statement = null;
        try {
            statement = getConnection().prepareStatement("UPDATE student SET id=?,name=?,age=?,phone=? WHERE id =?");
            statement.setInt(1, id);
            statement.setString(2, name);
            statement.setInt(3, age);
            statement.setString(4, phone);
            statement.setInt(5, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e1) {
            throw new RuntimeException(e1);
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                    statement = null;
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    //主方法
    public static void main(String[] args) {
        try {
            //建立连接
            getConnection();

            //遍历结果集
            traverse();

            System.out.println();

            //查询大于age的结果
            inquire(21);

            //修改一条记录
            revise(5);

            //删除一条记录
            delete(5);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
