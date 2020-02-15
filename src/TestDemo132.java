//instanceof关键字：可判断某一个对象是否指定类的实例
class A132{
    public void print(){
        System.out.println("A,public void print(){}");
    }
}
class B132 extends A132{
    public void print(){
        System.out.println("B,public void print(){}");
    }
}
public class TestDemo132 {
    public static void main(String[] args) {
        A132 a = new B132();//对象向上转型
        System.out.println(a instanceof A132);
        System.out.println(a instanceof B132);
        System.out.println(null instanceof A132);
    }
}
