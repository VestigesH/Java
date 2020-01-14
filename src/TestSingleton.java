//构造方法非私有化
class Singlenton {
    public void print() {
        System.out.println("Hello world");
    }
}
public class TestSingleton {
    public static void main(String[] args) {
        Singlenton inst = null;
        inst = new Singlenton();
        inst.print();
    }
}
