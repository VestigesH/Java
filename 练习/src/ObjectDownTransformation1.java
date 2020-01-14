class A126{
    public void print(){
        System.out.println("A , public void print(){}");
    }
}
class B126 extends A126{
    public void print(){
        System.out.println("B , public void print(){}");
    }
}
//对象向下转型(强制完成)
public class ObjectDownTransformation1 {
    public static void main(String[] args) {
        A126 a = new B126();
        B126 b = (B126) a;
        b.print();
    }
}
