package com.homework.java5;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/**
 * @projectName: untitled1
 * @className: Client
 * @author: AaronLi
 * @description: nothing
 * @date: 2022/6/20 下午8:39
 * @version: JDK17
 */
public class Client {
    //默认本机
    private String host = "localhost";
    //端口号8800
    private int port = 8800;

    public Client() {

    }

    //提供host和port
    public Client(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public void chat() {
        try {
            // 连接到服务器
            Socket socket = new Socket(host, port);

            try {
                DataInputStream in = new DataInputStream(socket.getInputStream());
                DataOutputStream out = new DataOutputStream(socket.getOutputStream());

                //输入
                Scanner scanner = new Scanner(System.in);

                //读取
                while (true) {

                    //读取控制台输入的内容
                    String send = scanner.nextLine();
                    //输出键盘输出内容提示 ，也就是客户端向服务器端发送的消息
                    System.out.println("客户端：" + send);
                    //将客户端的信息传递给服务器
                    out.writeUTF("客户端：" + send);
                    String accpet = in.readUTF();// 读取来自服务器的信息
                    System.out.println(accpet);//输出来自服务器的信息
                }
            } finally {
                socket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        new Client().chat();
    }
}

