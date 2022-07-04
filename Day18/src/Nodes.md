# 多线程

## 1.基本概念：程序，进程，线程

### 程序：

是为完成特定任务、用某种语言编写的一组指令的集合。即指 <span style="color:#e44f26">一段静态的代码</span>,静态对象。

### 进程：

是程序的一次执行过程，或是<span style="color:#e88e82">正在运行的一个程序</span>。是一个动态的过程：
有它自己的产生、存在和消亡。——生命周期
进程作为资源分配的单元，系统在运行时会为每个进程分配不同的内存空间。

### 线程：

进程可以进一步细分为线程，是一个程序内部的一条执行路径。
若一个进程同一时间并行之心
线程作为调度和执行的单元，每个线程拥有独立的运行栈喊程序计数器（pc）。

## 2.<span style="color:#e88e82">线程的创建和使用</span>

## 3.线程的生命周期

## 4.<span style="color:#e88e82">线程的同步</span>

## 5.线程的通信

## 6.JDK5.0新增线程创建方式

# 源码查看

## 创建线程方法一

### ThreadTest.java

<ol type="I" start="1">
    <li>创建一个继承于Thread类的子类</li>
    <li>重写Thread类的run()方法 -->此线程执行的操作声明在run()方法中</li>
   <li>创建Thread类的子类对象</li>
   <li>通过此对象调用start()方法</li>
   <p>例子：遍历100以内所有偶数</p>
   </ol>

## 创建线程方法二

### ThreadTest1.java

<p>创建多线程的方式二：实现Runnable接口</p>
  <ol type="1" start="1">
     <li>创建一个实现了Runnable接口的类</li>
     <li>在实现类中实现Runnable接口中的抽象方法：run()</li>
     <li>创建实现类的对象</li>
     <li>将此对象作为对象传递到Thread类的构造器，创建Thread类的对象</li>
     <li>通过Thread类的对象调用start()</li>
     </ol>

## 创建线程的两种方式比较

<p>开发中：优先选择：实现Runnable接口的方式</p>
<p>原因：</p>
<ol type="1" start="1">
    <li>实现的方式没有类的单继承性的局限性</li>
    <li>实现的方式更适合来处理多个线程有共享数据的情况</li>
</ol>
<p>联系：</p>
&emsp; public class Thread implements Runnable{}
&emsp; 相同点：都需要重写run()方法，将线程要执行的逻辑声明在run()方法中。

## 线程方法

### ThreadMethodTest.java

<ol type="1" start="1">
     <li>start()：启动当前线程；调用当前线程的run()</li>
     <li>run()：通常需要重写Thread类中的此方法，将创建线程要执行的操作声明在此方法中</li>
     <li>currentThread()：静态方法，返回执行当前代码的线程</li>
     <li>getName()：获取当前线程的名字</li>
     <li>setName()：设置当前线程的名字</li>
     <li>yield()：释放当前cpu的执行权</li>
     <li>join()：在线程A中调用线程B的join()方法，此时线程A就进入阻塞状态，直到线程B完全执行完以后，
     线程A才结束阻塞状态</li>
     <li>stop()：已过时。当执行此方法时，强制结束当前线程。</li>
     <li>sleep(long millitime)：让当前线程“睡眠”指定的millitime毫秒。在指定的millitime毫秒内，当前
     线程是阻塞状态</li>
     <li>isAlive()：判断当前线程是否存活</li>
     </ol>
     <p>线程优先级</p>
<ol type="1" start="1">
      <li>MAX_PRIORITY:10、MIN_PRIORITY:1、NORM_PRIORITY:5</li>
      <li>如何获取和设置当前线程的优先级
      <p>getPriority()：获取线程的优先级</p>
      <p>setPriority(int p)：设置线程的优先级</p>
      <p>说明：高优先级的线程要抢占低优先级CPU的执行权，但是只是从概率上讲，高优先级的线程
        高概率的情况下被执行。并不意味着只有高优先级的线程执行完以后，低优先级的线程才执行。
      </p>
      </li>
      </ol>

## 线程训练--遍历100以内奇数和偶数

### ThreadDemo.java

## 线程安全查看

### WindowTest.java

<p>例子：创建三个窗口买票，总票数为100张</p>
<p>存在线程安全问题，待解决</p>
<p>使用继承Thread类的方式多线程</p>

### WindowTest1.java

<p>例子：创建三个窗口买票，总票数为100张</p>
<p>存在线程安全问题，待解决</p>
<p>使用实现Runnable接口的方式</p>
