package com.templatemethod.project;

/**
 * @projectName: newJavaProject
 * @className: TemplateMethodTest
 * @author: AaronLi
 * @description:
 * @date: 2022/5/2 20:21
 * @version: JDK17
 */
public class TemplateMethodTest {
    public static void main(String[] args) {
    BankTemplateMethod testOne=new DrawMoney();
    testOne.process();
    BankTemplateMethod testTwo=new ManageMoney();
    testTwo.process();
    }
}

abstract class BankTemplateMethod {
    //具体方法 不变的
    public void takeNumber() {
        System.out.println("取号排队！");
    }

    public abstract void transact();

    public void evaluate() {
        System.out.println("反馈评分！");
    }

    //将模板方法、基本操作整合在一起，子类一般不能重写
    public final void process() {
        this.takeNumber();
        this.transact();//这里通过子类，重写方法，就像一排商品，想要实现那个功能，就通过选择不同子类实现
        this.evaluate();
        System.out.println("*********");
    }
}
class DrawMoney extends BankTemplateMethod{

    @Override
    public void transact() {
        System.out.println("我要取钱！！！");
    }
}
class ManageMoney extends BankTemplateMethod{
    @Override
    public void transact() {
        System.out.println("我要理财！！！我这里有2000000000人民币！！！");
    }
}
