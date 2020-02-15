//使用int和Integer
public class Practise7 {
    public static void main(String[] args) {
        Integer obj = new Integer(10);      //将基本数据类型装箱
        int temp = obj.intValue();                 //将基本数据类型拆箱
        System.out.println(temp * 2);
    }
}
