package experience.day15;

/**
 * @projectName: newJavaProject
 * @className: USBTest
 * @author: AaronLi
 * @description:
 * 接口的使用
 * 1.接口的使用也满足多态性
 *
 * 2.接口，实际上定义了一种规范
 *
 * 3.开发中，体会面向接口编程
 *
 * @date: 2022/5/3 16:31
 * @version: JDK17
 */
public class USBTest {
    public static void main(String[] args) {
        Computer computer = new Computer();
        //1.创建了接口的非匿名实现类的非匿名对象
        System.out.println("******");
        Flash flash = new Flash();
        computer.transferDate(flash);//声明的是USB，实现的是USB的对象
        //2.创建了接口的非匿名实现类的匿名对象
        System.out.println("******");
        computer.transferDate(new Printer());
        //3.创建了接口的匿名实现类的非匿名对象
        System.out.println("******");
        USB phone = new USB() {
            @Override
            public void start() {
                System.out.println("手机开始工作");
            }

            @Override
            public void stop() {
                System.out.println("手机结束工作");
            }
        };
        computer.transferDate(phone);
        //创建了接口的匿名实现类的匿名对象
        System.out.println("*******");
        computer.transferDate(new USB() {
            @Override
            public void start() {
                System.out.println("匿名实现类中的start方法");
            }

            @Override
            public void stop() {
                System.out.println("匿名实现类中的stop方法");
            }
        });
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