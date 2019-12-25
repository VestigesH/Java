//定义构造块
class Bookf{
    public Bookf(){   //构造方法
        System.out.println("[ A ] Bookf类的构造方法");
    }
    {    //将代码块写在类里，称为构造块
        System.out.println("[ B ] Bookf类中的构造块");
    }
}
public class TestDemo254 {
    public static void main(String[] args) {
        new Bookf();
        new Bookf();
    }
}
