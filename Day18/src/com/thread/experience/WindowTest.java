package com.thread.experience;

/**
 * @projectName: untitled1
 * @className: WindowTest
 * @author: AaronLi
 * @description:
 * <p>例子：创建三个窗口买票，总票数为100张</p>
 * <p>存在线程安全问题，待解决</p>
 * <p>使用继承Thread类的方式多线程</p>
 * @date: 2022/6/28 下午6:22
 * @version: JDK17
 */
class Window extends Thread {

    //票
    private static int ticket = 100;

    @Override
    public void run() {
        while (true) {
            if (ticket > 0) {
                System.out.println(getName() + "：" + "买票，票号为：" + ticket);
                ticket--;
            } else {
                break;
            }
        }
    }
}

public class WindowTest {
    public static void main(String[] args) {
        Window window1 = new Window();
        Window window2 = new Window();
        Window window3 = new Window();

        window1.setName("窗口1");
        window2.setName("窗口2");
        window3.setName("窗口3");

        window1.start();
        window2.start();
        window3.start();
    }
}
