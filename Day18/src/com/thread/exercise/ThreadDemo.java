package com.thread.exercise;

/**
 * @projectName: untitled1
 * @className: ThreadDemo
 * @author: AaronLi
 * @description: 练习：创建两个分线程，其中一个线程遍历100以内的偶数，另一个线程遍历100以内的奇数
 * @date: 2022/6/26 下午10:45
 * @version: JDK17
 */
class MyThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + "偶数" + i);
            }
        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + ":" + "奇数" + i);
            }
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        MyThread2 myThread2 = new MyThread2();

        myThread1.start();
        //myThread2.start();

        //创建Thread类的匿名子类
        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName() + ":" + "奇数" + i);
                }
            }
        }.start();
    }
}
