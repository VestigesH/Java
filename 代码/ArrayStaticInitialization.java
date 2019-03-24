public class ArrayStaticInitialization {
    public static void main(String args[]){
        int data [] = new int [] {1,2,3,4,5};      //数组的静态初始化
        for(int x =0 ;x< data.length;x++) {
            System.out.println(data[x]+"、");
        }
    }
}
