public class Test10 {
    public static void main(String[] args) {
        String str1 = "1111";
        String str2 = "1111";
        String str3 = new String("1111");
        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
    }
}
