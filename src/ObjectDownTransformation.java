class W1{
    public void print(){
        System.out.println("kkkkkkkkkk");
    }
}
class Y1 extends W1{
    public void print(){
        System.out.println("llllllllll");
    }
}
public class ObjectDownTransformation {
    public static void main(String[] args) {
        W1 w1 = new Y1();
        Y1 y1 =(Y1) w1;
        y1.print();
    }
}
