public class arrayDemo {
    public static void main(String[] args) {
        int data[] = new int[3];
        data[0] = 10;
        data[1] = 20;
        data[2] = 30;
        int temp[] = data;      //数组引用传递
        temp[0] = 99;           //修改数组内容
        for (int i = 0; i < data.length; i++){
            System.out.println(data[i] + ",");
        }
    }
}
