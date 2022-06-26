/**
 * @projectName: untitled1
 * @className: ThreadTest
 * @author: AaronLi
 * @description: 多线程的创建
 * <ol type="I" start="1">
 *     <li>创建一个继承于Thread类的子类</li>
 *     <li>重写Thread类的run()方法 -->此线程执行的操作声明在run()方法中</li>
 *     <li>创建Thread类的子类对象</li>
 *     <li>通过此对象调用start()方法</li>
 * <p>例子：遍历100以内所有偶数</p>
 * </ol>
 * @date: 2022/6/25 下午6:43
 * @version: JDK17
 */

//1.创建一个继承于Thread的子类
class MyThread extends Thread {

    //2.重写run()方法
    @Override
    public void run() {
        int k = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                k++;
                System.out.println(Thread.currentThread().getName() + "：" + "第" + k + "个偶数为" + i);
            }
        }
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        //3.创建Thread类的子类对象
        MyThread myThread = new MyThread();

        //4.通过此对象调用start()方法:①启动当前线程②调用当前线程的run()。
        myThread.start();

        //问题1：我们不能通过直接调用run()的方式启动线程
        //只是调用run()方法，并未创建一个新的线程
        // myThread.run();

        //问题2：再启动一个线程，遍历100以内的偶数
        //不可以让已经start()的线程再去执行，会报IllegalThreadStateException错误
        //myThread.start();
        //需要重新创建一个线程的对象
        MyThread myThread1 = new MyThread();
        myThread1.start();

        //如下操作仍然是在main线程下执行
        int k = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                k++;
                //Thread.currentThread().getName()：获取当前线程名
                System.out.println(Thread.currentThread().getName() + "：" + "第" + k + "个奇数为" + i);
            }
        }
    }
}
