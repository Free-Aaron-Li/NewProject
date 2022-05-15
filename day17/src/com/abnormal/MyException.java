package com.abnormal;

/**
 * @projectName: newJavaProject
 * @className: MyException
 * @author: AaronLi
 * @description: <p>如何自定义异常类？</p>
 * <ul type="1">
 *     <li>1.继承于现有的异常类，如：RuntimeException -> Exception</li>
 *     <li>提供全局常量：serialVersionUID</li>
 *     <li>提供重载的构造器</li>
 * </ul>
 * @date: 2022/5/15 16:27
 * @version: JDK17
 */
public class MyException extends RuntimeException {

    static final long serialVersionUID = -7034897134675766939L;

    public MyException() {

    }

    public MyException(String msg) {
        super(msg);
    }
}
