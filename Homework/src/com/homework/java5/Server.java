package com.homework.java5;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * @projectName: untitled1
 * @className: Server
 * @author: AaronLi
 * @description: nothing
 * @date: 2022/6/20 下午8:46
 * @version: JDK17
 */

public class Server {//ChatServer类
    private int port = 8800;// 默认服务器端口

    public Server() {

    }

    // 创建指定端口的服务器
    public Server(int port) {//构造方法
        this.port = port;//将方法参数赋值给类参数
    }

    // 提供服务
    public void service() {
        try {
            ServerSocket server = new ServerSocket(port);
            Socket socket = server.accept();
            try {
                // 读取客户端传过来信息的DataInputStream
                DataInputStream in = new DataInputStream(socket.getInputStream());
                // 向客户端发送信息的DataOutputStream
                DataOutputStream out = new DataOutputStream(socket.getOutputStream());
                Scanner scanner = new Scanner(System.in);
                while (true) {
                    // 读取来自客户端的信息
                    String accpet = in.readUTF();
                    //输出来自客户端的信息
                    System.out.println(accpet);
                    String send = scanner.nextLine();

                    System.out.println("服务器：" + send);
                    //把服务器端的输入发给客户端
                    out.writeUTF("服务器：" + send);
                }
            } finally {// 建立连接失败的话不会执行socket.close();
                socket.close();
                server.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Server().service();
    }
}
