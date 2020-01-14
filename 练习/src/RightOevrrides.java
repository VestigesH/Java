class A5{
    public void fun(){
        System.out.println("A类中的fun()方法");
    }
}
class B5 extends A5{
    public void fun(){
        System.out.println("B类中的fun()方法");
    }
}
public class RightOevrrides {
    public static void main(String[] args) {
        B5 b5 = new B5();
        b5.fun();
    }
}
