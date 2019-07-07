import com.sun.jmx.snmp.internal.SnmpSubSystem;

class A1{
    public A1(){
        System.out.println("A,A类的构造方法");
    }
}
class B1 extends A1{
    public B1(){
        super();//若父类中没有无参构造方法，必须使用super(),且必须出现在首行
        System.out.println("B,B类的构造方法");
    }
}
public class ObserveTheInstantiationActionObject {
    public static void main(String[] args) {
        new B1();
    }
}
