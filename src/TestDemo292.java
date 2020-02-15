interface A292 {
    public static final String MSG = "YOOTK";//全局常量
    public abstract void print();       //抽象方法
}
interface B292{
    public abstract void get();//抽象方法
}
class X292 implements A292,B292{         //X实现了A和B两个接口
    public void print(){
        System.out.println("A接口的抽象方法");      //覆写了A接口的抽象方法
    }
    public void get(){
        System.out.println("B接口的抽象方法");      //覆写了A接口的抽象方法
    }
}
public class TestDemo292 {
    public static void main(String[] args) {
        //此时X类是A和B两个接口的子类，所以此类对象可以同时实现两个接口的向上转型
        X292 x = new X292();          //实例化子类对象
        A292 a = x;                   //向上转型
        B292 b = x;                   //向上转型
        a.print();                    //调用被覆写过的方法
        b.get();                      //调用被覆写过的方法
        System.out.println(A292.MSG); //直接访问全局常量
    }
}
