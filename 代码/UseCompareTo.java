public class UseCompareTo {
    public static void main(String args[]){
        String stra = "Hello";
        String strb = "HEllo";
        System.out.println(stra.compareTo(strb));
        //compareTo()方法是根据数据的编码差值来判断
        if(stra.compareTo(strb)>0){
            System.out.println("大于");
        }
    }
}
