package experience.day15;

/**
 * @projectName: newJavaProject
 * @className: FinalTest
 * @author: AaronLi
 * @description:
 * final:最终的
 * 1.final可以用来修饰的结构：类、方法、变量。
 *
 * 2.final用来修饰一个类：
 * 不能被其他类所继承，比如：String类、System类、StringBuffer类。
 *
 * 3.final修饰方法：
 * 表明此方法不可以被重写，比如Object类中的getClass();
 *
 * 4.final修饰变量：
 * 此时的”变量“就称为是一个常量
 * 4.1 final修饰属性：可以考虑赋值的位置有：显式初始化、代码块中初始化、构造器中初始化。
 * 4.2 final修饰局部变量1：尤其是使用final修饰形参时，表明此形参是一个常量。当我们调用此方法时，一旦赋值以后，就只能再方法体内部使用此形参
 *
 * 补充：
 * static final:
 * 用来修饰属性：全局常量
 * @date: 2022/4/3 14:46
 * @version: JDK17
 */
public class FinalTest {
    final int WIDTH=10;
    final int LEFT;
    final int RIGHT;
    {
        LEFT=1;
    }
public FinalTest(){
        RIGHT=2;
}
    public void dowidth(){//此变量变成了常量
      //  width=20;
    }
    public static void main(String[] args) {

    }
}
final class FinalA{//此类不能有子类

}
class AA{
    public void show(){//此方法不能重写

    }
}
class BB extends AA{
    public void show(){

    }
}