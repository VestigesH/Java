class A10{
    public void print(){
        System.out.println("A、public void print(){}");
    }
}
class B10 extends A10{
    public void print(){
        System.out.println("B、public void print(){}");
    }
    public void funB10(){
        System.out.println("B、扩充的funB()方法");
    }
}
public class SubclassesExtendSuperclassMethods {
    public static void main(String[] args) {
        fun(new B10());                          //向上转型，只能调用父类中定义的方法
    }
    public static void fun(A10 a10) {
        B10 b10=(B10) a10;                       //要调用子类的特殊操作，需要向下转型
        b10.funB10();                            //调用子类的扩充方法
    }
}
