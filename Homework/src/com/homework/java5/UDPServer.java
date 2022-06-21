package com.homework.java5;

/**
 * @projectName: untitled1
 * @className: UDPServer
 * @author: AaronLi
 * @description: nothing
 * @date: 2022/6/20 下午8:20
 * @version: JDK17
 */
import java.io.IOException;//导入IOException类
import java.net.DatagramPacket;//导入DatagramPacket类
import java.net.DatagramSocket;//导入DatagramSocket类
import java.net.InetAddress;//导入InetAddress类
import java.util.Scanner;//导入Scanner类

/*
 * 服务器端，实现基于UDP的用户登陆
 */
public class UDPServer {
    public static void main(String[] args) throws IOException {

        // 1.创建服务器端DatagramSocket，指定端口
        DatagramSocket socket = new DatagramSocket(8800);

        // 2.创建数据报，用于接收客户端发送的数据
        byte[] data = new byte[1024];//创建字节数组，指定接收的数据包的大小
        DatagramPacket packet = new DatagramPacket(data, data.length);

        // 3.接收客户端发送的数据
        System.out.println("****服务器端已经启动，等待客户端发送数据***");//输出提示信息
        while(true) {
            socket.receive(packet);

            // 4.读取数据
            String info = new String(data, 0, packet.getLength());//创建字符串对象
            System.out.println("这里是服务端，客户端：" + info);

            /*
             * 向客户端响应数据
             */
            // 1.定义客户端的地址、端口号、数据

            //获取发送端的地址
            InetAddress address = packet.getAddress();
            //获取 发送端进程所绑定的端口
            int port = packet.getPort();

            Scanner scanner = new Scanner(System.in);
            String send = scanner.nextLine();
            byte[] data2 = send.getBytes();
            // 2.创建数据报，包含响应的数据信息
            DatagramPacket packet2 = new DatagramPacket(data2, data2.length,address,port);

            // 3.响应客户端
            socket.send(packet2);
        }

    }
}

