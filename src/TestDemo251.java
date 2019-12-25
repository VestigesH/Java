class MyMath1{  //类中没有属性
    public static int add(int x, int y){
        return x + y;
    }
}
public class TestDemo251 {
    public static void main(String[] args) {
        System.out.println(MyMath1.add(10,20));  //直接调用
    }
}
