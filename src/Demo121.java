class A121{
    public A121(){
        System.out.println("A,A的构造方法");
    }
}
class B121 extends A121{
    public B121(){
        System.out.println("B,B的构造方法");
    }
}
public class Demo121 {
    public static void main(String[] args) {
        new B121();
    }
}
