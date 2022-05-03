package com.proxymethod;

/**
 * @projectName: newJavaProject
 * @className: NetworkTest
 * @author: AaronLi
 * @description: 接口的应用：代理模式
 * @date: 2022/5/3 19:51
 * @version: JDK17
 */
public class NetWorkTest {
    public static void main(String[] args) {
        Server server = new Server();
        ProxySever proxySever = new ProxySever(server);
        proxySever.brows();
    }
}

interface NetWork {
    public void brows();
}

//被代理类
class Server implements NetWork {

    @Override
    public void brows() {
        System.out.println("真实的服务器访问网络");
    }
}

//代理类
class ProxySever implements NetWork {
    private NetWork work;

    public ProxySever(NetWork work) {
        this.work = work;
    }

    public void check() {
        System.out.println("联网之前的检查工作");
    }

    @Override
    public void brows() {
        check();

        work.brows();
    }
}