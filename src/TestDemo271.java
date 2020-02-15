//利用static定义的内部抽象类为外部抽象类
abstract class A271{    //定义一个抽象类
    static abstract class B271{ //static定义的内部类属于外部类
        public abstract void print();
    }
}
class X extends A271.B271 {     //继承static内部抽象类
    public void print() {
        System.out.println("sdsjdheufehfjieoif");
    }
}
public class TestDemo271 {
    public static void main(String[] args) {
        A271.B271  ab = new X();    //向上转型
        ab.print();
    }
}
