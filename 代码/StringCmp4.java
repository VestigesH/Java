public class StringCmp4 {
    public static void main(String args[]){
        String stra = "Hello";
        String strb = "HEllo";
        System.out.println(stra.compareTo(strb));
        if(stra.compareTo(strb)>0){
            System.out.println("大于");
        }
    }
}
