//利用静态块为static属性初始化
class Bookh{
    static String msg;   //static属性，暂不封装
    public Bookh(){      //构造方法
        System.out.println("[ A ] Bookg类的构造方法");
    }
    {                    //将代码块写在类里，称为构造块
        System.out.println("[ B ] Bookg类中的构造块");
    }
    static {                //定义静态块
        msg = "Hello".substring(0,2);
        System.out.println("[ C ] Bookg类中的静态块");
    }
}
public class TestDemo256 {
    public static void main(String[] args) {
        new Bookh();
        new Bookh();
        System.out.println(Bookh.msg);
    }
}
