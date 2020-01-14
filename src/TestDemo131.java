class A131{
    public void print(){
        System.out.println("A,public void print(){}");
    }
}
class B131 extends A131{
    public void print(){
        System.out.println("B,public void print(){}");
    }
}
class C131 extends A131{
    public void print(){
        System.out.println("C,public void print(){}");
    }
}
public class TestDemo131 {
    public static void main(String[] args) {
        fun(new B131());  //对象向上转型，等价于： A31 a = new B131():
        fun(new C131());  //对象向上转型，等价于： A31 a = new C131():
    }

    /**
     * 接收A类或者其子类对象，不管传递哪个对象都要求调用print()方法
     * @param a  A31类实例化对象
     */
    public static void fun(A131 a){
        a.print();;
    }
}
