package com.yootk.demo;  //简化处理
class MyMath3{
    public static int div(int x, int y){
        System.out.println("==========计算开始==============");
        int result = 0;
        try {
            result = x / y;
        }finally {
            System.out.println("==========计算结束===============");
        }
        return result;
    }
}
public class TestDemo403 {
    public static void main(String[] args) {
        try {
            System.out.println(MyMath3.div(10,0));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
