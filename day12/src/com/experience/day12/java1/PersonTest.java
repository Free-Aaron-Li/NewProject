package java1;
/*
 * @author: Aaron.Li
 * @date: 2022 - 02 - 27 - 下午1:36
 * @project: newJavaProject
 * @version: JDK17.0.2
 */

/**
 * @ClassName PersonTest
 * @Description 多态性的测试
 * @Author Aaron-Li
 * @Date 2022 - 02 - 27 - 下午1:36
 * @Version JDK17
 */

/**
 * 面向对象特征之三：多态性（是一个运行时行为）
 * 1.理解多态性：可以理解为一个事物的多种形态。
 * 2.何为多态性？对象多态性：父类的引用指向子类的对象（或子类的对象赋给父类的引用）
 * 3.多态的使用：虚拟方法调用
 * 有了对象的多态以后，我们在编译期，只能调用父类中声明的方法，但在运行期，但在运行期，我们实际执行的是子类重写父类的方法。
 * 总结：编译看左边，运行看右边。
 * 4.多态性使用前提：①类的继承关系 ②方法的重写
 * 5.对象的多态性，只适用于方法，不适用属性（编译和运行都看左边）。
 */
public class PersonTest {
    public static void main(String[] args) {
        Person test = new Person();
        test.eat();
        System.out.println("****************");
        Man man = new Man();
        man.eat();
        man.age = 25;
        man.earnMoney();
        System.out.println("****************");
        //*************************************
        //对象多态性：父类的引用指向子类的对象
        Person testOne = new Man();
        //Person testTwo=new Woman();
        //多态的使用：当调用子父类同名同参数的方法时，实际执行的子类重写父类的方法————虚拟方法调用
        testOne.eat();
        testOne.walk();
        //testOne.earnMoney();(⊙﹏⊙)b
        System.out.println(testOne.id);//1001
    }
}
