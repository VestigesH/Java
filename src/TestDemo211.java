 abstract  class A211{
    public void fun(){
        System.out.println("存在有方法体的方法！");
    }
    public abstract void print();
}
class B211 extends A211{
    public void print(){
        System.out.println("Hello World ");
    }
}
public class TestDemo211 {
    public static void main(String[] args) {
        A211 a = new B211();
        a.print();
    }
}
