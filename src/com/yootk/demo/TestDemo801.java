package com.yootk.demo;
//利用foreach循环实现输出
public class TestDemo801 {
    public static void main(String[] args) {
        int data[] = new int[]{1,2,3,4,5};   //定义数组
        for(int x : data){                   //循环次数由数组长度决定
            //每一次循环实际上都表示数组的角标增长，会取得一个数组的内容，并且将其设置给x
            System.out.println(x + "、");  //x就是每一个数组元素的内容
        }
    }
}
