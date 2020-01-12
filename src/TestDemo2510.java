class Outer3{
    private static String msg = "Hello World!";
    static class Inner{                           //static定义的类等同于外部类
        public void print(){
            System.out.println(Outer3.msg); //直接访问static属性
        }
    }
}
public class TestDemo2510 {
    public static void main(String[] args) {
        Outer3.Inner in = new Outer3.Inner();   //实例化“外部类”对象
        in.print();
    }
}
