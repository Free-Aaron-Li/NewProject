package com.homework.test;

import java.util.Stack;

/**
 * @projectName: newJavaProject
 * @className: Demo08
 * @author: AaronLi
 * @description: nothing
 * @date: 2022/6/11 16:11
 * @version: JDK17
 */
public class Demo08 {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<Integer>();
        int n=10;
        while(n!=0){
            int k=n%2;
            stack.push(k);
            n=n/2;
        }
        while(!stack.empty()){
            int i=stack.pop();
            System.out.print(i);
        }
    }

}
