//在非主类中使用你
class Bookg{
    public Bookg(){
        System.out.println("[ A ] Bookg类的构造方法");
    }
    {
        System.out.println("[ B ] Bookg类中的构造块");
    }
    static {   //定义静态块
        System.out.println("[ C ] Bookg类中的静态块");
    }
}
public class TestDemo255 {
    public static void main(String[] args) {
        new Bookg();
        new Bookg();
    }
}
