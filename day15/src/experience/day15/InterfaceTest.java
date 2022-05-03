package experience.day15;

/**
 * @projectName: newJavaProject
 * @className: InterfaceTest
 * @author: AaronLi
 * @description: 接口的使用
 * 1.接口使用interface来定义
 * 2.Java中，接口和类是并列的两个结构
 * 3.如何定义接口，定义接口中的成员
 *
 * 3.1 JDK7及以前：
 * 只能定义全局常量和抽象方法
 * >全局常量：public static final的，但是书写时可以省略！！
 * >抽象方法：public abstract的
 * 3.2 JDK8：
 * >除了定义全局常量和抽象方法以外，还可以定义静态方法、默认方法。
 *
 * 4.接口中是不能定义构造器的！！！。意味着接口不可以实例化！！！
 * 5.Java开发中，都是让类实现(implements)接口。
 * 如果实现类覆盖了接口中所有抽象方法，则此实现类就可以实例化。
 * 如果实现类没有覆盖所有的抽象方法，则此是实现类为抽象类。
 * 6.Java类可以实现多个接口 ---->弥补了Java单继承性的局限性。
 * 格式：class AA extends BB implements CC,DD,EE{}
 * 7.接口与接口之间可以继承，且为多继承
 * ****************************************************
 * 8.接口的具体使用，体现多态性。
 * 9.接口，实际上可以看做是一种规范。
 *
 * 面试题：抽象类与接口有那些异同？
 *
 * @date: 2022/5/3 14:52
 * @version: JDK17
 */
public class InterfaceTest {
    public static void main(String[] args) {
        System.out.println(Flyable.MAX_SPEED);//体现出为静态常量
        System.out.println(Flyable.MIN_SPEED);
        //Flyable.MAX_SPEED=1000;//体现出接口中常量为final
        Plane plane = new Plane();
        plane.fly();
    }
}

interface Attackable {

}

interface Flyable {
    //全局常量
    //public static final int MAX_SPEED = 7900;
    //public static final int MIN_SPEED = 1;
    //书写时可以不用写public static final,但仍然时全局常量
    int MAX_SPEED = 7900;
    int MIN_SPEED = 1;

    //抽象方法
    public abstract void fly();

    //省略了public abstract
    void stop();
}

class Plane implements Flyable {

    @Override
    public void fly() {
        System.out.println("通过引擎起飞！！！");
    }

    @Override
    public void stop() {
        System.out.println("驾驶员减速停止！！！");
    }
}

abstract class kite implements Flyable {

}
class Bullet implements Flyable,Attackable,CC{

    @Override
    public void fly() {

    }

    @Override
    public void stop() {

    }
//接口与接口多继承，实例化也会都应该继承接口所有的方法。
    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }
}

//*************************************************************************************

interface One{
   void method1();
}
interface Two{
   void method2();
}
interface CC extends One,Two{

}