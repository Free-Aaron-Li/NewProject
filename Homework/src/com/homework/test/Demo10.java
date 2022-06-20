package com.homework.test;

/**
 * @projectName: newJavaProject
 * @className: Demo10
 * @author: AaronLi
 * @description: nothing
 * @date: 2022/6/11 16:12
 * @version: JDK17
 */
public class Demo10 {
    public static void main(String[] args) {
        InstrumentTest t = new InstrumentTest();
        t.testPlay(new Piano());
        t.testPlay(new Violin());
    }

}
abstract class Instrument {
    public abstract void play();
}
class Piano extends Instrument {
    public void play() {
        System.out.println("piano play");
    }
}
class Violin extends Instrument {
    public void play() {
        System.out.println("violin play");
    }
}

class InstrumentTest {
    public void testPlay(Instrument instrument) {
        instrument.play();
    }
}

