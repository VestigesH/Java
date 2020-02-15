 //通过内部类的方式定义抽象类子类
abstract class A273{
    public abstract void print();
    private static class B273 extends A273{ //内部抽象类子类
        public void print(){     //覆写抽象类的方法
            System.out.println("ufhirefjeorkeor");
        }
    }
    public static A273 getInstance(){         //此方法可以通过类名称直接调用
        return new B273();
    }
}
public class TestDemo273 {
    public static void main(String[] args) {
        //此时取得抽象类对象时完全不一样需要知道B273类这个子类存在
        A273 a = A273.getInstance();
        a.print();//调用被覆写过的抽象方法
    }
}
