public class ArrayReference {
    public static void main(String args[]){
        int data [] = new int [3];
        data [0] = 10;
        data [1] = 20;
        data [2] = 30;
        int temp[] = data ;           //数组引用传递
        temp[0] = 99;                 //修改数组的内容
        for(int x = 0;x<data.length ;x++){
            System.out.println(data[x]+"、");
        }
    }
}
