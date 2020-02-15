//自动装箱与自动拆箱
public class Practise10 {
    public static void main(String[] args) {
        Integer obj = 10;
        int temp = obj;
        obj++;
        System.out.println(obj * temp);
    }
}
