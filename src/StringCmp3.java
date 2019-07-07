public class StringCmp3 {
    public static void main(String args[]){
        String stra = "hello";
        String strb = new String("hello");
        String strc = strb;
        System.out.println(stra == strb);
        System.out.println(stra == strc);
        System.out.println(strb == strc);
    }
}
