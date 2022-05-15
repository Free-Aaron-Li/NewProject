# exercise包：

## EcmDef: 关于异常的所有特性的实践

 <p>编写应用程序EcmDef.java，接收命令行的两个参数，要求不能输入负数，计算两数相减</p>
 <ul type="1">
      对数据类型不一致(NumberFormatException)、缺少命令行参数(ArrayIndexOutOfBoundsException)、除0(ArithmeticException)及
      输入负数(EcDef自定义异常)进行异常处理<br>
      提示：<br>
     <li>在主类(EcmDef)中定义异常方法(ecm)完成两数相减功能。</li>
      <li>在main()方法中使用异常处理语句进行异常处理。</li>
      <li>在程序中，自定义对应输入负数的异常类(EcDef)</li>
      <li>运行时接受参数java EcmDef 20 10 //args[0]="20' args[1]="10"</li>
     <li>Interger类的static方法parseInt(String s)将s转换成对应的int值。如：int a=Interger.parseInt("314"); //a=314;</li>
  </ul>

# test包：

## StudentTest:

异常抛出方法throw和自定义异常MyException的调用

# 其他：

### ErrorTest:

关于Error异常的测试和查看,基本上不会用到，可以看看

### ExceptionOne

#### 关于异常中try-catch的重点介绍和实践

异常处理：抓抛模型
过程一：“抛”
程序在正常执行的过程中，一旦出现异常，就会在异常代码处生成一个对应代码的对象。
并将此对象抛出，抛给程序调用者。一旦抛出对象以后，其后的代码就不再执行。
<ul>
     关于异常对象的产生：
     <ul type="1">
       <li>系统自动生成的异常对象</li>
       <li>手动的生成一个异常对象，并抛出(throw)</li>
     </ul>
 </ul>
 过程二：“抓”
 可以理解为异常处理方式：①try-catch-finally ②throws
 <p>
 <p>
 二、try-catch-finally的使用
 try{
 //可能出现异常的代码
 }catch(异常类型1 变量名1){
 //处理异常的方式1
 }catch(异常类型1 变量名1){
//处理异常的方式1
 }
 ……
 finally{
 //一定会执行的代码
 }
 <p>
 <p>
 说明：
 <ul>
 <li> 1.finally是可选的
 <li>2.使用try将可能出现异常的代码包装起来，在执行过程中，一旦出现异常，就会生成一个对应异常类的对象，根据此对象的类型，去catch中进行匹配。
 <li>3.一旦try中的异常对象匹配到某一个catch时，就进入catch中进行异常的处理。一旦处理完成，就跳出当前的try-catch结构（在没有写finally的情况）。继续执行其后的代码。
 <li>4.catch中的异常类型如果没有子父类关系，则谁声明在上，谁声明在下无所谓。如果catch中的异常类型如果满足子父类关系，则要求子类一定声明在父类的上面。否则，报错。
 <li>5.常用的异常处理方式，①返回string getMessage(); ② printStackTrace()
 <li>6.<em>在try结构中声明的变量，在其结构外无法调用。</em>
 <li>7.try-catch-finally结构可以相互嵌套
 </ul>
 </p>
 体会1：使用try-catch-finally处理编译时异常，是使得程序在编译时就不报错，但是运行时仍然可能报错。相当于我们使用try-catch-finally结构，将一个编译时可能出现的异常，延迟至运行时再出现。<br>
 体会2：开发中，由于运行时异常比较常见，所以我们通常就不针对运行时异常编写try-catch-finally，针对于编译时异常，我们一定要考虑异常的处理。

### ExceptionTest:

#### 常见的异常类型

了解异常体系结构
![异常体系](img.png)
一、异常体系结构<br>
&nbsp;java.lang.Throwable<br>
&emsp;java.lang.Error:一般不编写针对性的代码<br>
&emsp;java.lang.Exception:可以进行异常的处理<br>

|     编译时异常（checked)     | 运行时异常（unchecked） | |
|:----------------------:|    :----:   |:---:|
|      IOException       | NullPointerException    |
| ClassNotFoundException |ClassCasException     |
|                        |NumberFormatException|
|                        |InputMismatchException|
|                        | ArithmeticException|

### ExceptionTwo:

异常处理的方式二：throws+异常类型
<p></p>
 <ul type="1">
     <li>”throws+异常类型“写在方法的声明处。指明此方法执行时，可能会抛出的异常类型。一旦当方法体执行时，出现异常，仍会在异常代码处生成一个异常类的对象，此对象满足throw后异常类型时，就会被抛出
     异常代码的后续代码不会执行。</li>
     <li>体会：try-catch-finally：真正的将异常处理掉，throws的方法只是将异常抛给了方法的调用者，并没有真正将异常处理掉</li>
    <li>开发中如何选择使用try-catch-finally还是使用throws?
    <ul type="a">
        <li>如果父类中被重写的方法没有throws方法处理异常，则子类重写的方法也不能使用throws，意味着如果子类重写的方法中有异常，必须使用try-catch-finally方式处理。</li>
        <li>执行的方法中先后又调用了另外的方法，这几个方法是递进的关系，建议用throws方式进行处理。而执行方法a可以考虑使用try-catch-finally方式处理。</li>
     </ul>
     </li>
 </ul>
### FinalTest:

##### 关于try-catch-finally中finally的使用

<ul type="1">
    <li>finally是可选的</li>
    <li>finally中声明的一定会被执行的代码，即使catch中出现异常了，try中由return语句，catch中的代码也不会改变</li>
    <li><em>像数据库连接、输入输出流、网络编程Socket等资源，JVM是不能自动回收的，我们需要自己手动的进行资源的释放。此时的资源释放，就需要声明在finally中</em></li>

</ul>

### MyException:

<p>如何自定义异常类？</p>
  <ul type="1">
     <li>1.继承于现有的异常类，如：RuntimeException -> Exception</li>
      <li>提供全局常量：serialVersionUID</li>
      <li>提供重载的构造器</li>
  </ul>

### OverrideTest:

<p>方法重写的规则之一：</p>
 * 子类重写的方法抛出的异常类型不大于父类被重写的方法抛出的异常类型