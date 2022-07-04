package com.thread.experience;

/**
 * @projectName: untitled1
 * @className: WindowTest1
 * @author: AaronLi
 * @description:
 * <p>例子：创建三个窗口买票，总票数为100张</p>
 * <p>存在线程安全问题，待解决</p>
 * <p>使用实现Runnable接口的方式多线程</p>
 * @date: 2022/7/4 下午2:35
 * @version: JDK17
 */

class window1 implements Runnable {

    private int ticket = 100;

    @Override
    public void run() {
        while (true) {
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + "：买票，票号为：" + ticket);
                ticket--;
            } else {
                break;
            }
        }
    }
}

public class WindowTest1 {
    public static void main(String[] args) {
        window1 window1 = new window1();

        Thread thread1 = new Thread(window1);
        Thread thread2 = new Thread(window1);
        Thread thread3 = new Thread(window1);

        thread1.setName("窗口1");
        thread2.setName("窗口2");
        thread3.setName("窗口3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
