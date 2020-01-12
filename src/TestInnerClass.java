class Outer{    //外部类
    private String msg = "Hello World!";
    class Inner{    //定义一个内部类
        public void print(){
            System.out.println(msg);
        }
    }
    public void fun(){
        new Inner().print();       //实例化内部类对象，并且调用print()方法
    }

}
public class TestInnerClass {
    public static void main(String[] args) {
        Outer out = new Outer();      //实例化外部类对象
        out.fun();                    //调用外部类方法
    }
}
