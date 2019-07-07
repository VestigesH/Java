public class TestDemo42 {
    public static void main(String[] args) {
        Double obj = new Double(10.2);//装箱
        double t = obj.doubleValue();        //拆箱
        System.out.println(t * 2);
    }
}
