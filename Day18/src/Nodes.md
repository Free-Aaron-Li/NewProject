# 多线程

## 1.基本概念：程序，进程，线程

### 程序(program)：

是为完成特定任务、用某种语言编写的一组指令的集合。即指 <span style="color:#e44f26">一段静态的代码</span>,静态对象。

### 进程(process)：

是程序的一次执行过程，或是<span style="color:#e88e82">正在运行的一个程序</span>。是一个动态的过程：
有它自己的产生、存在和消亡。——生命周期
<p></p>
<span style="color:#e44f26">进程作为资源分配的单元</span>，系统在运行时会为每个进程分配不同的内存空间。

### 线程(thread)：

进程可以进一步细分为线程，是一个程序内部的一条执行路径。
> 若一个进程同一时间并行执行多个线程，就是支持多线程  
> <span style="color:#e44f26">线程作为调度和执行的单元</span>，每个线程拥有独立的运行栈喊程序计数器（pc），线程切换的开销小。  
> 一个进程中的多个线程共享相同的内存/内存地址空间->它们从同一堆中分配对象，可以访问相同的变量和对象，这就是的线程间通讯更简便、高效、但多个线程操作共享的系统资源可能就会带来<span style="color:#e44f26">
> 安全隐患</span>

## 2.<span style="color:#e88e82">线程的创建和使用</span>

### 创建多线程的两种方式

#### 创建线程方法一

<ol type="I" start="1">
    <li>创建一个继承于Thread类的子类</li>
    <li>重写Thread类的run()方法 -->此线程执行的操作声明在run()方法中</li>
   <li>创建Thread类的子类对象</li>
   <li>通过此对象调用start()方法</li>
   <p>例子：遍历100以内所有偶数</p>
   </ol>

#### 创建线程方法二

<p>创建多线程的方式二：实现Runnable接口</p>
  <ol type="1" start="1">
     <li>创建一个实现了Runnable接口的类</li>
     <li>在实现类中实现Runnable接口中的抽象方法：run()</li>
     <li>创建实现类的对象</li>
     <li>将此对象作为对象传递到Thread类的构造器，创建Thread类的对象</li>
     <li>通过Thread类的对象调用start()</li>
     </ol>

### 创建线程的两种方式比较

<p>开发中：优先选择：实现Runnable接口的方式</p>
<p>原因：</p>
<ol type="1" start="1">
    <li>实现的方式没有类的单继承性的局限性</li>
    <li>实现的方式更适合来处理多个线程有共享数据的情况</li>
</ol>
<p>联系：</p>
&emsp; public class Thread implements Runnable{}
<p>相同点：</p>

> 都需要重写run()方法，将线程要执行的逻辑声明在run()方法中。  
> 目前两种方式，要想启动线程，都是调用的Thread类中的start()。

### Thread类中的常用的方法

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

### 线程优先级

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
<p>线程通讯：wait()、notify()、notifyAll()，此三个方法定义在Object类中的。</p>

## 3.线程的生命周期

### JDK中用Thread.State类定义了线程的几种状态
要想实现多线程，必须在主线程中创建新的线程对象。Java语言使用Thread类及其子类的对象来表示线程，在它
的一个完整生命周期中通常要经历的五个状态：
<ul>
<li>新建：当一个Thread类或其子类的对象被声明并创建时，新生的线程对象处于新建状态</li>
<li>就绪：处于新建状态的线程被start()后，将进入线程队列等待CPU时间片，此时它已经具备了运行的条件，只是
没有分配到CPU资源</li>
<li>运行：当就绪的线程被调度并获得CPU资源时，便进入运行状态，run()方法定义了线程的操作和功能</li>
<li>阻塞：在某种特殊情况下，被人为挂起或执行输入输出操作时，让出CPU并临时终止自己的执行，进入阻塞
状态</li>
<li>死亡：线程完成了它的全部工作或线程被提前强制性地终止或出现异常导致结束 </li>
</ul>
## 4.<span style="color:#e88e82">线程的同步</span>

## 5.线程的通信

## 6.JDK5.0新增线程创建方式

## 7.线程的分类

<p>Java中的线程分为两类：一种是<span style="color:#e88e82">守护线程</span>,一种是<span style="color:#e88e82">用户线程</span></p>

> 它们几乎每个方面都是相同的，唯一的区别是判断JVM何时离开。    
> 守护线程是用来服务用户线程的，通过在start()方法前调用<span style="color:#e88e82">thread.setDaemon(true)</span>可以把一个用户线程变成一个守护线程。  
> Java垃圾回收就是一个典型的守护线程。
> 若JVM中都是守护线程，当前JAM将退出。  
> 形象理解：<span style="color:#084886">兔死狗烹，鸟尽弓藏</span>

# 源码查看

### 创建线程方法一

### ThreadTest.java

<ol type="I" start="1">
    <li>创建一个继承于Thread类的子类</li>
    <li>重写Thread类的run()方法 -->此线程执行的操作声明在run()方法中</li>
   <li>创建Thread类的子类对象</li>
   <li>通过此对象调用start()方法</li>
   <p>例子：遍历100以内所有偶数</p>
   </ol>

### 创建线程方法二

### ThreadTest1.java

<p>创建多线程的方式二：实现Runnable接口</p>
  <ol type="1" start="1">
     <li>创建一个实现了Runnable接口的类</li>
     <li>在实现类中实现Runnable接口中的抽象方法：run()</li>
     <li>创建实现类的对象</li>
     <li>将此对象作为对象传递到Thread类的构造器，创建Thread类的对象</li>
     <li>通过Thread类的对象调用start()</li>
     </ol>

### 创建线程的两种方式比较

<p>开发中：优先选择：实现Runnable接口的方式</p>
<p>原因：</p>
<ol type="1" start="1">
    <li>实现的方式没有类的单继承性的局限性</li>
    <li>实现的方式更适合来处理多个线程有共享数据的情况</li>
</ol>
<p>联系：</p>
&emsp; public class Thread implements Runnable{}
<p>相同点：</p>

> 都需要重写run()方法，将线程要执行的逻辑声明在run()方法中。  
> 目前两种方式，要想启动线程，都是调用的Thread类中的start()。

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
