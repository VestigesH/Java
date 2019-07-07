public class ArraySort1 {
    public static void main(String args[]){
        int data[] = new int[] {2,1,9,0,5,3,7,6,8};
        System.out.print("排序前的数据：");
        print(data);
        for(int x = 0;x < data.length;x++){
            for(int y = 0;y < data.length - 1;y++){
                if(data[y] > data[x]+1){
                    int t = data [y];
                    data[y] = data [y+1];
                    data [y+1] = t;
                }
            }
        }
        System.out.print("排序后的数据：");
        print(data);
    }
    public static void print(int temp[]){
        for(int x = 0;x< temp.length;x++){
            System.out.print(temp[x]+"、");
        }
        System.out.println();
    }
}
