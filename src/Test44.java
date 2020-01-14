public class Test44 {
    public static void main(String[] args) {
        Integer obj = 10;//自动装箱
        int t = obj;//自动拆箱
        obj++;
        System.out.println(t * obj);
    }
}
