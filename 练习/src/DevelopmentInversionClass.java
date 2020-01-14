class Array124{
    private int data[];
    private int foot;

    /**
     * 构造本类对向时需要设置大小，如果设置的长度小于0则维持一个大小
     * @param len
     */
    public Array124(int len){
        if(len > 0){
            this.data = new int[len];
        }else{
            this.data = new int[1];
        }
    }
    public boolean add(int num){
        if (this.foot < this.data.length){
            this.data[this.foot++] = num;
            return true;
        }
        return false;
    }

    /**
     * 取得所有的数组内容
     * @return  数组对象引用
     */
    public int[] getData(){
        return this.data;
    }
}
class  ReverseArray extends Array124{
     public ReverseArray(int len){
         super(len);
     }
     public int[] getData(){
         int center = super.getData().length / 2;
         int head = 0;
         int tail = super.getData().length - 1;
         for(int x = 0; x < center; x++ ){
             int temp = super.getData()[head];
             super.getData()[head] = super.getData()[tail];
             super.getData()[tail] = temp;
             head++;
             tail--;
         }
         return super.getData();
     }
}
public class DevelopmentInversionClass {
    public static void main(String[] args) {
        ReverseArray arr = new ReverseArray(3);
        System.out.println(arr.add(20) + ",");
        System.out.println(arr.add(10) + ",");
        System.out.println(arr.add(30) + ",");
        System.out.println(arr.add(100) + ",");
        int[] temp = arr.getData();
        for(int x = 0; x < temp.length; x++){
            System.out.println(temp[x] + ",");
        }
    }
}
