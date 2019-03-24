public class ArrayTransposition {
    public static void main(String args[]){
        int data[] = new int[]{1,2,3,4,5,6,7,8};
        int temp[] = new int[data.length];
        int foot = data.length-1;
        for(int x = 0;x<temp.length;x++){
            temp[x] = data[foot];
            foot--;
        }
        data = temp;
        print(data);
    }
    public static void print(int temp[]){
        for(int x = 0;x<temp.length;x++){
            System.out.print(temp[x]+"、");
        }
        System.out.println();
    }
}
