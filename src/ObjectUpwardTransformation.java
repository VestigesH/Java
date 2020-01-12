class A125{
    public void print(){
        System.out.println("A , public void print(){}");
    }
}
class B125 extends A125{
    public void print(){
        System.out.println("B , public void print(){}");
    }
}
//对象向上转型(自动完成)
public class ObjectUpwardTransformation {
    public static void main(String[] args) {
        A125 a= new B125();                  //实例化的是子类对象，对象向上转型
        a.print();                           //调用被子类覆写过的方法
    }
}
