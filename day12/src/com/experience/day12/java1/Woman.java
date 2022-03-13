package java1;
/*
 * @author: Aaron.Li
 * @date: 2022 - 02 - 27 - 下午1:34
 * @project: newJavaProject
 * @version: JDK17.0.2
 */

/**
 * @ClassName Woman
 * @Description Person子类，多态性的使用
 * @Author Aaron-Li
 * @Date 2022 - 02 - 27 - 下午1:34
 * @Version JDK17
 */
public class Woman extends Person{
    boolean isBeauty;
    public void goShopping(){
        System.out.println("逛商场");
    }
    public void eat(){
        System.out.println("少吃肉！");
    }
    public void walk(){
        System.out.println("窈窕走路！");
    }
}
