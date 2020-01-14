class A11{
    public void print(){
        System.out.println("A、public void print(){}");
    }
}
class B11 extends A11{
    public void print(){
        System.out.println("B、public void print(){}");
    }
    public void funB11(){
        System.out.println("B、扩充的funB()方法");
    }
}
public class UseInstanceof {
    public static void main(String[] args) {
        A11 a11 = new B11();              //对象向上转型
        System.out.println(a11 instanceof A11);
        System.out.println(a11 instanceof B11);
        System.out.println(null instanceof A11);
    }
}
