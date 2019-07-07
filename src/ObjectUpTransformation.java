class W{
    public void print(){
        System.out.println("kkkkkkkkkk");
    }
}
class Y extends W{
    public void print(){
        System.out.println("llllllllll");
    }
}
public class ObjectUpTransformation {
    public static void main(String[] args) {
        W w = new Y();
        w.print();
    }
}
