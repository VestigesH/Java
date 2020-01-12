class Array123{
     int data[];
     int foot;

    /**
     * 构造本类对向时需要设置大小，如果设置的长度小于0则维持一个大小
     * @param len
     */
    public Array123(int len){
        if(len > 0){
            this.data = new int[len];
        }else{
            this.data = new int[1];
        }
    }

    /**
     * 向数组中增加元素
     * @param num 要增加的数据
     * @return  如果数据增加成功返回true，如果数组中保存数据已满则返回false
     */
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
class SortArray extends Array123{   //定义排序子类
    public SortArray(int len){
        super(len);                 //明确调用父类的有参构造，为父类中的data属性初始化
    }

    /**
     * 因为父类中getData()方法不能满足排序的操作要求，但为了保存这个方法名称，所以进行覆写
     * 在本方法中要使用java.util.Arrays.sort()来实现数组的排序操作
     * @return   排序后的数据
     */
    @Override
    public int[] getData() {
        java.util.Arrays.sort(super.getData());   //排序
        return super.getData();                   //返回排序后的数据
    }
}
public class DefineTestSortSubclass {
    public static void main(String[] args) {
        SortArray arr = new SortArray(3);
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
