//没有抽象方法的抽象类
abstract class A261{
    public void print(){
        System.out.println("DERFGFRTGRTGRTG");
    }
}
class B261 extends A261{
    //抽象类必须有子类
}
public class TestDemo261 {
    public static void main(String[] args) {
        A261 a = new B261();//通过子类实例化抽象类对象
        a.print();
    }
}
