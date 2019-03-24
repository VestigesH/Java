public class SimplifyUnderstandingArrayPassing {
    public static void main(String args[]){
        int data[] = new int []{1,2,3};
        int temp[]=data ;                             //引用传递
        for(int x = 0;x<data.length;x++){             //修改数组内容
            temp[x] *= 2;                             //将数组的内容乘以2
        }
        for(int x=0;x<data.length;x++){
            System.out.print(data[x]+"、");
        }
    }
}
