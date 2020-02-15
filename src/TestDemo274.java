abstract class A274{      //定义一个抽象类
    public void fun(){     //此为普通方法
        this.print();      //在普通方法中直接调用抽象方法
    }
    public abstract void print();//此为抽象方法
}
class X274 extends A274{            //抽象类必须有子类
    public void print(){
        System.out.println("jvhfuijsdfkeord");
    }
}
public class TestDemo274 {
    public static void main(String[] args) {
        A274 a = new X274();      //通过子类实例化抽象类对象
        a.fun();   //抽象类中的普通方法
    }
}
