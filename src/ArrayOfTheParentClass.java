class Array122{
    private int data[];
    private int foot;

    /**
     * 构造本类对向时需要设置大小，如果设置的长度小于0则维持一个大小
     * @param len
     */
    public Array122(int len){
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
public class ArrayOfTheParentClass {
    public static void main(String[] args) {
        Array122 arr = new Array122(3);
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
