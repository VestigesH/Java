//使用可变参数定义方法
public class TestVariableParameter {
    public static void main(String[] args) {
        //可变参数支持接收数组
        System.out.println(add(new int[]{1, 2, 3}));
        System.out.println(add(new int[]{10, 20}));
        //或者使用","区分不同的参数，接收的时候还是数组
        System.out.println(add(1, 2, 3));
        System.out.println(add(10, 20));
        System.out.println(add());
    }

    /**
     *  实现任意多个整型数据的相加操作
     * @param data 由于要接收多个整型数据，所以使用数组完成接收
     * @return  多个整型数据的累加结果
     */
    public static int add(int ... data){
        int sum = 0;
        for(int x = 0; x < data.length; x++){
            sum += data[x];
        }
        return sum;
    }
}
