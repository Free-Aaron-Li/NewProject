package java1;
/*
 * @author: Aaron.Li
 * @date: 2022 - 02 - 27 - 下午2:11
 * @project: newJavaProject
 * @version: JDK17.0.2
 */

/**
 * @ClassName AnimalTest
 * @Description 多态性的使用举例一
 * @Author Aaron-Li
 * @Date 2022 - 02 - 27 - 下午2:11
 * @Version JDK17
 */
public class AnimalTest {
    public static void main(String[] args) {
        AnimalTest test = new AnimalTest();
        //多态性的体现：
        test.func(new Dog());//Animal animal=new Dog();
        test.func(new Cat());
    }

    public void func(Animal animal) {
        animal.eat();
        animal.shout();
    }
}

class Animal {
    public void eat() {
        System.out.println("进食！");
    }

    public void shout() {
        System.out.println("叫！");
    }
}

class Dog extends Animal {
    public void eat() {
        System.out.println("吃狗粮！");
    }

    public void shout() {
        System.out.println("汪！");
    }
}

class Cat extends Animal {
    public void eat() {
        System.out.println("吃猫粮！");
    }

    public void shout() {
        System.out.println("喵！");
    }
}
