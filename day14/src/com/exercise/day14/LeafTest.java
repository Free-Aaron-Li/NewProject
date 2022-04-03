package com.exercise.day14;

/**
 * @projectName: newJavaProject
 * @className: LeafTest
 * @author: AaronLi
 * @description: 代码块的测试
 * 总结：
 * 由父及子，静态先行
 * @date: 2022/4/3 12:46
 * @version: JDK17
 */
class Root {
    static {
        System.out.println("Root的静态代码块");
    }

    {
        System.out.println("Root的普通代码块");
    }

    public Root() {
        System.out.println("Root的无参构造器");
    }
}

class Mid extends Root {
    static {
        System.out.println("Mid的静态初代码块");
    }
    {
        System.out.println("Mid的普通代码块");
    }
    public Mid(){
        System.out.println("Mid的无参构造器");
    }
    public Mid(String msg){
        System.out.println("Mid的带参构造器，其参数值："+msg);
    }
}
class Leaf extends Mid{
    static {
        System.out.println("Leaf的静态代码块");
    }
    {
        System.out.println("Leaf的普通代码块");
    }
    public Leaf(){
        super("name");
        System.out.println("Leaf的构造器");
    }
}

public class LeafTest {
    public static void main(String[] args) {
        System.out.println("******");
        new Leaf();
        System.out.println("********");
        new Leaf();
    }
}
