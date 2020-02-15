class MyInt1{                     //基本数据类型包装类
    private int num;              //这个类包装的是基本数据类型
    public MyInt1(int num){
        this.num = num;
    }
    public int intValue(){         ///将包装的数据内容返回
        return this.num;
    }
}
public class Practise6 {
    public static void main(String[] args) {
        MyInt1 my = new MyInt1(10);
        int temp = my.intValue();
        System.out.println(temp * 2);
    }
}
