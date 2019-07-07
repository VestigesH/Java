class Array{
    private int data[];
    private int foot;
    public Array(int len){
        if(len>0){
            this.data=new int[len];
        }else{
            this.data=new int[1];
        }
    }
    public boolean add(int num){
        if(this.foot<this.data.length){
            this.data[this.foot++]=num;
            return true;
        }
        return false;
    }

    public int[] getData() {
        return this.data;
    }
}
public class DevelopTheSuperClassOfAnArray {
    public static void main(String[] args) {
        Array arr = new Array(3);
        System.out.println(arr.add(20)+"、");
        System.out.println(arr.add(10)+"、");
        System.out.println(arr.add(30)+"、");
        System.out.println(arr.add(100)+"、");
        int[] temp = arr.getData();
        for(int x=0;x<temp.length;x++){
            System.out.println(temp[x]+"、" );
        }
    }
}
