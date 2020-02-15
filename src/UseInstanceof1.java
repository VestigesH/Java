class A151{
    public void print(){
        System.out.println("A,public void print(){}");
    }
}
class B151 extends A151{
    public void print(){
        System.out.println("B,public void print(){}");
    }
    public void funB151(){
        System.out.println("B,扩充的funB151()方法");
    }
}
public class UseInstanceof1 {
    public static void main(String[] args) {
        fun(new B151());      //对象向上转型
    }
    public static void fun(A151 a){
        a.print();
        if(a instanceof  B151){          //如果a是B151类的实例
            B151 b = (B151) a;           //向下转型
            b.funB151();                 //调用子类扩充的方法
        }
    }
}
