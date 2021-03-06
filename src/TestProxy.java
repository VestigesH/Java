import sun.nio.ch.Net;

interface Network{           //定义Nexwork接口
    public void browse();    //定义浏览的抽象方法
}
class Real implements Network{     //真实的上网操作
    @Override
    public void browse() {         //覆写抽象方法

        System.out.println("浏览上网信息");
    }
}
class Proxy implements Network{    //代理上网
    private Network network;
    public Proxy(Network network){   //设置代理的真实操作
        this.network = network;      //设置代理的子类
    }
    public void check(){             //与上网具体相关的操作
        System.out.println("检查用户是否合法");
    }

    @Override
    public void browse() {
        this.check();                        //可以同时调用多个与具体业务相关的操作
        this.network.browse();               //调用真实上网操作
    }
}
public class TestProxy {
    public static void main(String[] args) {
        Network net = null;           //定义接口对象
        net = new Proxy(new Real());  //实例化代理，同时转入代理的真实操作
        net.browse();                 //客户只关心上网浏览一个功能
    }
}
