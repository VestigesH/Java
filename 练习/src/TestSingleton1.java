class Singleton1{
    private final static Singleton1 instance = new Singleton1();
    private Singleton1(){

    }

    public void print() {
        System.out.println("Hello World");
    }
    public static Singleton1 getInstance() {
        return instance;
    }
}
public class TestSingleton1 {
    public static void main(String[] args) {
        Singleton1 inst = null;
        inst = Singleton1.getInstance();
        inst.print();
    }
}
