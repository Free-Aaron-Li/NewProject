package com.thread.experience;

/**
 * @projectName: untitled1
 * @className: ThreadMethodTest
 * @link:
 * @author: AaronLi
 * @description:
 * <p>测试Thread中的常用方法</p>
 * <ol type="1" start="1">
 *     <li>start()：启动当前线程；调用当前线程的run()</li>
 *     <li>run()：通常需要重写Thread类中的此方法，将创建线程要执行的操作声明在此方法中</li>
 *     <li>currentThread()：静态方法，返回执行当前代码的线程</li>
 *     <li>getName()：获取当前线程的名字</li>
 *     <li>setName()：设置当前线程的名字</li>
 *     <li>yield()：释放当前cpu的执行权</li>
 *     <li>join()：在线程A中调用线程B的join()方法，此时线程A就进入阻塞状态，直到线程B完全执行完以后，
 *     线程A才结束阻塞状态</li>
 *     <li>stop()：已过时。当执行此方法时，强制结束当前线程。</li>
 *     <li>sleep(long millitime)：让当前线程“睡眠”指定的millitime毫秒。在指定的millitime毫秒内，当前
 *     线程是阻塞状态</li>
 *     <li>isAlive()：判断当前线程是否存活</li>
 *     </ol>
 *     <p>线程优先级</p>
 *     <ol type="1" start="1">
 *         <li>MAX_PRIORITY:10、MIN_PRIORITY:1、NORM_PRIORITY:5</li>
 *         <li>如何获取和设置当前线程的优先级
 *         <p>getPriority()：获取线程的优先级</p>
 *         <p>setPriority(int p)：设置线程的优先级</p>
 *         <p>说明：高优先级的线程要抢占低优先级CPU的执行权，但是只是从概率上讲，高优先级的线程
 *         高概率的情况下被执行。并不意味着只有高优先级的线程执行完以后，低优先级的线程才执行。
 *         </p>
 *         </li>
 *         </ol>
 * @date: 2022/6/27 下午5:22
 * @version: JDK17
 */

class HelloThread extends Thread {
    //给线程命名：1.通过构造器，显式调用父类构造方法
    public HelloThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                //try {
                //    sleep(10);
                //} catch (InterruptedException e) {
                //    throw new RuntimeException(e);
                //}

                System.out.println(getName() + "：" + getPriority() + "," + i);
            }

            if (i % 40 == 0) {
                Thread.yield();
            }
        }
    }
}

public class ThreadMethodTest {
    public static void main(String[] args) {
        HelloThread helloThread = new HelloThread("Thread:1");

        //helloThread.setName("线程1");

        //设置分线程的优先级
        helloThread.setPriority(Thread.MAX_PRIORITY);
        helloThread.start();

        //给主线程命名
        Thread.currentThread().setName("主线程");

        //设置主线程优先级
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);

        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + "：" + Thread.currentThread().getPriority() + "," + i);
            }

            //if (i == 21) {
            //    try {
            //        helloThread.join();
            //    } catch (InterruptedException e) {
            //        throw new RuntimeException(e);
            //    }
            //}
        }
        System.out.println(helloThread.isAlive());
    }
}
