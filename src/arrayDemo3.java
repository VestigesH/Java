public class arrayDemo3 {
    public static void main(String[] args) {
        int data[] = new int[]{1,2,3};    //开辟数组
        change(data);                     //引用传递，等价于：int temp[] = data;
        for (int x = 0; x < data.length; x++){
            System.out.println(data[x] + ",");
        }
    }
    public static void change(int temp[]){    //此方法定义在主类中，并由主类直接调用
        for (int x = 0; x < temp.length; x++){  //将数组的内容乘以2保存
            temp[x] *= 2;
        }
    }
}
