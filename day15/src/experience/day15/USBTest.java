package experience.day15;

/**
 * @projectName: newJavaProject
 * @className: USBTest
 * @author: AaronLi
 * @description:
 * 接口的使用
 * 1.接口的使用也满足多态性
 *
 * @date: 2022/5/3 16:31
 * @version: JDK17
 */
public class USBTest {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Flash flash = new Flash();
        computer.transferDate(flash);//声明的是USB，实现的是USB的对象
    }
}

class Computer {
    public void transferDate(USB usb) {
        usb.start();
        System.out.println("具体传输的细节");
        usb.stop();
    }
}

interface USB {
    //常量：定义了长、宽、最大最小传输速度等
    void start();

    void stop();
}

class Flash implements USB {

    @Override
    public void start() {
        System.out.println("U盘开始工作");
    }

    @Override
    public void stop() {
        System.out.println("U盘结束工作");
    }
}

class Printer implements USB {

    @Override
    public void start() {
        System.out.println("打印机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("打印机结束工作");
    }
}