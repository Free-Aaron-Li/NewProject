/**
 * @projectName: newJavaProject
 * @className: test
 * @author: AaronLi
 * @description: nothing
 * @date: 2022/6/13 13:07
 * @version: JDK17
 */
public class test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        B bird = new B();
        C cat = new C();
        if (cat instanceof Animal) {
            System.out.println("it's good!");

        }
        BB bb = new BB(100);
        System.out.println(bb.i);
    }
}

class Animal {
}

class B extends Animal {
    public void bird() {

    }
}

class C extends B {
    public void  bird(){

    }
}

//interface Takecare {
//    protected void speakHello();          //A
//    public abstract  void cry();        	//B
//    int f();                            //C
//    abstract float g();                   //D
//}
class AA {
    public int i = 4;
    AA() {
    }
    AA(int m) {
        i = 1;
    }
}

class BB extends AA {
    BB(int m) {
        super(m);
    }
}
