package com.experience.java8.exercise;

/**
 * @projectName: newJavaProject
 * @className: Man
 * @author: AaronLi
 * @description: nothing
 * @date: 2022/5/6 21:23
 * @version: JDK17
 */
public class Man extends Father implements Filial, Spoony {//必须要选择一个方法

    //如果继承了父亲，那么就可以不用选择ヽ(*。>Д<)o゜
    public void help() {
        System.out.println("我该救谁呢？");
        Filial.super.help();
        Spoony.super.help();
    }

}

class Father {
    public void help() {
        System.out.println("儿子，就我媳妇！");
    }
}

interface Filial {//孝顺的

    default void help() {
        System.out.println("老妈，我来救你了！");
    }
}

interface Spoony {//痴情的

    default void help() {
        System.out.println("媳妇，别怕，我来了！");
    }
}
