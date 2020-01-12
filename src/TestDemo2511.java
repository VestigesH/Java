class Outer4{
    private String msg = "Hello World";
    public void fun(){
        class Inner{                    //方法中定义的内部类
            public void print(){
                System.out.println(Outer4.this.msg);
            }
        }
        new Inner().print();           //内部类实例化对象调用print()输出
    }
}
public class TestDemo2511 {
    public static void main(String[] args) {
        new Outer4().fun();
    }
}
