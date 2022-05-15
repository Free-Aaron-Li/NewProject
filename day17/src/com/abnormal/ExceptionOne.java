package com.abnormal;

import org.junit.jupiter.api.Test;

/**
 * @projectName: newJavaProject
 * @className: ExceptionOne
 * @author: AaronLi
 * @description: 异常处理：抓抛模型
 * 过程一：“抛”
 * 程序在正常执行的过程中，一旦出现异常，就会在异常代码处生成一个对应代码的对象。
 * 并将此对象抛出，抛给程序调用者。一旦抛出对象以后，其后的代码就不再执行。
 * <ul>
 *     关于异常对象的产生：
 *     <ul type="1">
 *       <li>系统自动生成的异常对象</li>
 *       <li>手动的生成一个异常对象，并抛出(throw)</li>
 *     </ul>
 * </ul>
 * 过程二：“抓”
 * 可以理解为异常处理方式：①try-catch-finally ②throws
 * <p>
 * <p>
 * 二、try-catch-finally的使用
 * try{
 * //可能出现异常的代码
 * }catch(异常类型1 变量名1){
 * //处理异常的方式1
 * }catch(异常类型1 变量名1){
 * //处理异常的方式1
 * }
 * ……
 * finally{
 * //一定会执行的代码
 * }
 * <p>
 * <p>
 * 说明：
 * <ul>
 * <li> 1.finally是可选都
 * <li>2.使用try将可能出现异常的代码包装起来，在执行过程中，一旦出现异常，就会生成一个对应异常类的对象，根据此对象的类型，去catch中进行匹配。
 * <li>3.一旦try中的异常对象匹配到某一个catch时，就进入catch中进行异常的处理。一旦处理完成，就跳出当前的try-catch结构（在没有写finally的情况）。继续执行其后的代码。
 * <li>4.catch中的异常类型如果没有子父类关系，则谁声明在上，谁声明在下无所谓。如果catch中的异常类型如果满足子父类关系，则要求子类一定声明在父类的上面。否则，报错。
 * <li>5.常用的异常处理方式，①返回string getMessage(); ② printStackTrace()
 * <li>6.<em>在try结构中声明的变量，在其结构外无法调用。</em>
 * <li>7.try-catch-finally结构可以相互嵌套
 * </ul>
 * </p>
 * 体会1：使用try-catch-finally处理编译时异常，是使得程序在编译时就不报错，但是运行时仍然可能报错。相当于我们使用try-catch-finally结构，将一个编译时可能出现的异常，延迟至运行时再出现。<br>
 * 体会2：开发中，由于运行时异常比较常见，所以我们通常就不针对运行时异常编写try-catch-finally，针对于编译时异常，我们一定要考虑异常的处理。
 * @date: 2022/5/14 19:50
 * @version: JDK17
 */
public class ExceptionOne {

    //NumberFormatException(数字格式化异常)
    @Test
    public void testFour() {
        String str = "123";
        str = "abc";
        try {
            int num = Integer.valueOf(str);
            System.out.println("hello----1");
        } catch (NullPointerException e) {
            System.out.println("出现了空指针异常！！");
        } catch (NumberFormatException e) {
            System.out.println("出现了数值转换异常！！");
            System.out.println("hello----2");

            //getMessage() 返回String
            System.out.println(e.getMessage());

            //printStackTrace()
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("出现了异常");
        }
        System.out.println("hello----3");
    }
}
