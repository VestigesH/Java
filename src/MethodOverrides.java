class A3{
    public void fun(){
        System.out.println("A类中的fun()方法");
    }
}
class B3 extends A3{
    public void fun(){
        System.out.println("B类中的fun()方法");
    }
}
public class MethodOverrides {
    public static void main(String[] args) {
        B3 b3 = new B3();
        b3.fun();
    }
}
