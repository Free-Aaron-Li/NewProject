package com.proxymethod;

/**
 * @projectName: newJavaProject
 * @className: StaticProxyTest
 * @author: AaronLi
 * @description: 代理模式之明星经纪人代理
 * @date: 2022/5/3 20:27
 * @version: JDK17
 */
public class StaticProxyTest {
    public static void main(String[] args) {
        Star star = new Proxy(new RealStar());//这里是通过经纪人的方式，实际上明星只负责唱歌，其他由经纪人干。
        star.confer();
        star.signContract();
        star.bookTicket();
        star.sing();
        star.collectMoney();
    }
}

interface Star {
    void confer();//面谈

    void signContract();//签合同

    void bookTicket();//订票

    void sing();//唱歌

    void collectMoney();//收钱
}

//被代理类
class RealStar implements Star {

    @Override
    public void confer() {

    }

    @Override
    public void signContract() {

    }

    @Override
    public void bookTicket() {

    }

    @Override
    public void sing() {
        System.out.println("明星，唱歌~~~");
    }

    @Override
    public void collectMoney() {

    }
}

//代理类
class Proxy implements Star {
    private Star real;

    public Proxy(Star real) {
        this.real = real;
    }

    @Override
    public void confer() {
        System.out.println("经纪人面谈");
    }

    @Override
    public void signContract() {
        System.out.println("经纪人签合同");
    }

    @Override
    public void bookTicket() {
        System.out.println("经纪人订票");
    }

    @Override
    public void sing() {
        real.sing();
    }

    @Override
    public void collectMoney() {
        System.out.println("经纪人收钱");
    }
}