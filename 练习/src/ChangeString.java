public class ChangeString {
    public static void main(String[] args) {
        int num = 100;
        String str = num + "";
        System.out.println(str.replaceAll("0","9"));
    }
}
