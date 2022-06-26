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
                System.out.println("第" + k + "个偶数为" + i);
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
    }
}
