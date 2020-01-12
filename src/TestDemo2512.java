//访问方法中定义的参数或变量
class Outer5{
    private String msg = "Hello World!";
    public void fun(int num){
        double score = 99.9;
        class Inner{
            public void print(){
                System.out.println("属性："+ Outer5.this.msg);
                System.out.println("方法参数：" + num);
                System.out.println("方法变量;" + score);
            }
        }
        new Inner().print();       //内部实例化对象调用print()输出
    }
}
public class TestDemo2512 {
    public static void main(String[] args) {
        new Outer5().fun(100);
    }
}
