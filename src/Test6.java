class A6{
    public void fun(){
        this.print();
    }
    private void print(){
        System.out.println("kkkkkkkk");
    }
}
class B6 extends A6{
    public void print(){
        System.out.println("lllllllll");
    }
}
public class Test6 {
    public static void main(String[] args) {
        B6 b6 = new B6();
        b6.fun();
    }
}
