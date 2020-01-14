//功能一：实现类实例化对象个数的统计
class Bookb{
    private static int num = 0;
    public Bookb(){
        num++;
        System.out.println("这是第" + num + "个产生的对象！");
    }
}
public class TestDemo252 {
    public static void main(String[] args) {
        new Bookb(); new Bookb(); new Bookb();
        new Bookb(); new Bookb(); new Bookb();
    }
}
