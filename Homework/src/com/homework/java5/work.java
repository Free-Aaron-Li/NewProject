package com.homework.java5;

/**
 * @projectName: untitled1
 * @className: work
 * @author: AaronLi
 * @description: nothing
 * @date: 2022/6/20 下午6:32
 * @version: JDK17
 */
public class work {
    public static void main(String[] args) {
        Object obj = new Object();

        Line line = new Line(obj);
        Even even = new Even(obj);

        //创建线程
        Thread thread1 = new Thread(line);
        Thread thread2 = new Thread(even);

        thread1.setName("---------------------");
        thread2.setName("偶数线程");

        //开始线程
        thread2.start();
        thread1.start();

    }
}

//划线线程
class Line implements Runnable{
    final Object obj;
    public Line(Object obj) {
        this.obj = obj;
    }

    @Override
    public void run() {
        synchronized(obj)  {
            for (int i =0 ; i < 100 ; i ++) {
                if (i % 2 != 0) {
                    System.out.println(Thread.currentThread().getName());
                    obj.notify();
                    try {
                        obj.wait();
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

    }
}

//偶数线程
class Even implements Runnable{

    final Object obj;
    public Even(Object obj) {
        this.obj = obj;
    }
    @Override
    public void run() {
        synchronized (obj){
            for (int i =0 ; i <= 100 ; i ++) {
                if (i % 2 == 0) {
                    System.out.println(Thread.currentThread().getName() + " 偶数-->" + i);

                    obj.notify();
                    try {
                        obj.wait();
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}