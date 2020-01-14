class A2{
    public void fun(){
        System.out.println("A类中的fun()方法");
    }
}
class B2 extends A2{

}
public class NoMethodOverridesAreImplemented {
    public static void main(String[] args) {
        B2 b2 = new B2();
        b2.fun();
    }
}
