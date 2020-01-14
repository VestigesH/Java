class A4{
    public void fun(){
        System.out.println("A类中的fun()方法");
    }
}
class B4 extends A4{
    public void fun(){
        System.out.println("B类中的fun()方法");
    }
}
class C4 extends A4{
    public void fun(){
        System.out.println("C类中的fun()方法");
    }
}
public class DefineMoreSubclasses {
    public static void main(String[] args) {
        B4 b4 = new B4();
        b4.fun();
        C4 c4 = new C4();
        c4.fun();
    }
}
