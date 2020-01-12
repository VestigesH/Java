class A122{
    String info = "hello";
}
class B122 extends A122{
    int info = 10;     //名称相同，发生属性覆盖
    public void print(){
        System.out.println(super.info);
        System.out.println(this.info);
    }
}
public class TestDemo122 {
    public static void main(String[] args) {
        B122 b = new B122();
        b.print();
    }
}

