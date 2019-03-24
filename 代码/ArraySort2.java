public class ArraySort2 {
    public static void main(String args[]){
        int data [] = new int[] {2,1,9,0,5,3,7,6,8};
        ArraySort2 as = new ArraySort2();
        as.sort(data);
        print(data);
    }
    public void sort(int arr[]){
        for(int x = 0;x < arr.length;x++){
            for(int y = 0;y <arr.length - 1;y++){
                if(arr[y] > arr[y+1]){
                    int t = arr[y];
                    arr[y] = arr[y+1];
                    arr[y+1] = t;
                }
            }
        }
    }
    public static void print (int temp[]){
        for(int x = 0; x< temp.length; x++){
            System.out.print(temp[x]+"、");
        }
        System.out.println();
    }
}
