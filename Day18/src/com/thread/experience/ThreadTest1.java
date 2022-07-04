package com.thread.experience;

/**
 * @projectName: untitled1
 * @className: ThreadTest1
 * @author: AaronLi
 * @description:
 * <p>创建多线程的方式二：实现Runnable接口</p>
 * <ol type="1" start="1">
 *     <li>创建一个实现了Runnable接口的类</li>
 *     <li>在实现类中实现Runnable接口中的抽象方法：run()</li>
 *     <li>创建实现类的对象</li>
 *     <li>将此对象作为对象传递到Thread类的构造器，创建Thread类的对象</li>
 *     <li>通过Thread类的对象调用start()</li>
 *     </ol>
 * @date: 2022/6/28 下午8:02
 * @version: JDK17
 */

//1.创建一个实现了Runnable()接口的类
class MyThreadOne implements Runnable {
    @Override
    //2.在实现类中实现Runnable接口中的抽象方法：run()
    public void run() {
        for (int i = 0; i < 100; i++) {
           if (i % 2==0){
               System.out.println(i);
           }
        }
    }
}
public class ThreadTest1 {
    public static void main(String[] args) {
        //3.创建实现类的对象
        MyThreadOne myThreadOne = new MyThreadOne();

        //4.将此对象作为对象传递到Thread类的构造器中，创建Thread类的对象
        Thread thread = new Thread(myThreadOne);

        //通过Thread类的对象调用start()
        thread.start();
    }
}
