package com.abnormal.exercise;

import org.testng.annotations.Test;

/**
 * @projectName: newJavaProject
 * @className: EcmDef
 * @author: AaronLi
 * @description: <p>编写应用程序EcmDef.java，接收命令行的两个参数，要求不能输入负数，计算两数相减</p>
 * <ul type="1">
 *     对数据类型不一致(NumberFormatException)、缺少命令行参数(ArrayIndexOutOfBoundsException)、除0(ArithmeticException)及
 *     输入负数(EcDef自定义异常)进行异常处理<br>
 *     提示：<br>
 *     <li>在主类(EcmDef)中定义异常方法(ecm)完成两数相减功能。</li>
 *     <li>在main()方法中使用异常处理语句进行异常处理。</li>
 *     <li>在程序中，自定义对应输入负数的异常类(EcDef)</li>
 *     <li>运行时接受参数java EcmDef 20 10 //args[0]="20' args[1]="10"</li>
 *     <li>Interger类的static方法parseInt(String s)将s转换成对应的int值。如：int a=Interger.parseInt("314"); //a=314;</li>
 * </ul>
 * @date: 2022/5/15 16:47
 * @version: JDK17
 */
@Test
public class EcmDef {
    public static void main(String[] args) {
        try {
            int i = Integer.parseInt(args[0]);
            int j = Integer.parseInt(args[1]);
            int result = ecm(i, j);
            System.out.println(result);
        } catch (NumberFormatException e) {
            System.out.println("数据类型不一致!");
            ;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("缺少命令行参数！");
        } catch (ArithmeticException e) {
            System.out.println("算术异常！");
        } catch (EcDef e) {
            System.out.println(e.getMessage());
        }
    }

    //EcDef自定义异常
    public static int ecm(int i, int j) throws EcDef {
        if (i < 0 || j < 0) {
            throw new EcDef("分子或分母为负数了！！！");
        }
        return i / j;
    }
}
