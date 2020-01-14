class Outer2{
    private String msg = "Hello World!";
    class Inner2 {
        public void print() {
            System.out.println(Outer2.this.msg);
        }
    }
}
public class TestDemo259 {
    public static void main(String[] args) {
        Outer2.Inner2 in = new Outer2().new Inner2();   //实例化内部类对象
        in.print();
    }
}
