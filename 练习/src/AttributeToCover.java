class A8{
    String info = "Hello";
}
class B8 extends A8{
    int info = 100;
    public void print(){
        System.out.println(super.info);
        System.out.println(this.info);
    }
}
public class AttributeToCover {
    public static void main(String[] args) {
        B8 b8 = new B8();
        b8.print();
    }
}
