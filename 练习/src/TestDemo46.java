public class TestDemo46 {
    public static void main(String[] args) {
        Object obj = 10;     //先自动装箱，再向上转型，此时不能进行数学运算
        //Object类不可能直接向下转型为int
        //所以要取出基本数据类型必须向下转型成制定的包装类
        int t = (Integer) obj;//向下变为Integer后自动拆箱
        System.out.println(t * 2);
    }
}
