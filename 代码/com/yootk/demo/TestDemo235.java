package com.yootk.demo;
class MyMath1{
    public static int div(int x, int y) throws Exception{
        System.out.println("=========计算开始=========");
        int result = 0;
        try {
            result = x / y;
        }finally {
            System.out.println("=========计算结束=========");
        }
        return result;
    }
}
public class TestDemo235 {
    public static void main(String[] args) {
        try {
            System.out.println(MyMath.div(10,0));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
