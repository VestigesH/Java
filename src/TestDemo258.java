//访问内部类的私有属性
class Outer1{                                 //外部类
    private String msg = "Hello World!";
    class Inner1{                             //定义一个内部类
        private String info = "世界 你好！";  //内部类的私有属性
        public void print(){
            System.out.println(msg);          //直接访问外部类的私有属性
        }
    }
    public void fun(){
        Inner1 in = new Inner1();              //内部类对象
        System.out.println(in.info);           //直接利用内部类对象访问内部类中定义的私有属性
    }
}
public class TestDemo258 {
    public static void main(String[] args) {
        Outer1 out = new Outer1();             //实例化外部类对象
        out.fun();                             //调用外部类方法
    }
}
