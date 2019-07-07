class A7{
    public void print(){
        System.out.println("kkkkkkkkkkkkkkk");
    }
}
class B7 extends A7{
    public void print(){
        super.print();
        System.out.println("lllllllllllllllll");
    }
}
public class UseSuper {
    public static void main(String[] args) {
        B7 b7= new B7();
        b7.print();
    }
}
