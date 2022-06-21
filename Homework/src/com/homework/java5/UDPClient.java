package com.homework.java5;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * @projectName: untitled1
 * @className: UDPClient
 * @author: AaronLi
 * @description: nothing
 * @date: 2022/6/20 下午8:19
 * @version: JDK17
 */

public class UDPClient {//公共类
    public static void main(String[] args) throws IOException {
        // 1.定义服务器的地址、端口号、数据
        InetAddress address = InetAddress.getByName("localhost");
        int port = 8800;
        while(true) {
            Scanner scanner = new Scanner(System.in);
            String send = scanner.nextLine();
            byte[] data = send.getBytes();

            //2.创建数据报，包含发送的数据信息
            DatagramPacket packet = new DatagramPacket(data, data.length, address, port);

            // 3.创建DatagramSocket对象
            DatagramSocket socket = new DatagramSocket();

            // 4.向服务器端发送数据报
            socket.send(packet);

            /*
             * 接收服务器端响应的数据
             */
            byte[] data2 = new byte[1024];

            // 1.创建数据报，用于接收服务器端响应的数据
            DatagramPacket packet2 = new DatagramPacket(data2, data2.length);

            // 2.接收服务器响应的数据
            socket.receive(packet2);

            //3.读取数据
            String reply = new String(data2, 0, packet2.getLength());
            System.out.println("这里是客户端 服务端：" + reply);

            //4.关闭资源
            socket.close();
        }
    }
}
