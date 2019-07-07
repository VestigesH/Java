class MyInt{
    private int num;
    public MyInt(int num){
        this.num = num;
    }
    public int intValue(){
        return this.num;
    }
}
public class TestDemo47 {
    public static void main(String[] args) {
        MyInt mi = new MyInt(10);
        int t = mi.intValue();   //将对象中包装的数据取出
        System.out.println(t * 2);//只有取出包装数据后才可以进行计算
    }
}
//包装类雏形