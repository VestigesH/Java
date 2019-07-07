package com.yootk.demo;

public class TestDemo501 {
    public static void main(String[] args) {
        System.out.println(add(new int[]{1,2,3}));//传递三个整型数据
        System.out.println(add(new int[]{20,30}));//传递两个整型数据
    }

    /**
     * 实现任意多个整型数据的相加操作
     * @param data  由于要接收多个整型数据，所以使用数组完成接收
     * @return     多个整型数据的接收结果
     */
    public static int add(int[] data){
        int sum = 0;
        for(int x = 0; x < data.length; x++){
            sum += data[x];
        }
        return sum;
    }
}
