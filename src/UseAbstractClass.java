abstract class A9{
    public void fun(){
        System.out.println("存在有方法体的方法");
    }
    public abstract void print();
}
class B9 extends A9{
    public void print(){
        System.out.println("ooooooooo");
    }
}
public class UseAbstractClass {
    public static void main(String[] args) {
        A9 a9 = new B9();
        a9.print();
    }
}
