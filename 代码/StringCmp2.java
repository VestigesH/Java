public class StringCmp2 {
    public static void main(String args[]){
        String stra = "hello";
        String strb = new String("hello");
        String strc = strb;
        System.out.println(stra.equals(strb));
        System.out.println(stra.equals(strc));
        System.out.println(strb.equals(strc));
    }
}
