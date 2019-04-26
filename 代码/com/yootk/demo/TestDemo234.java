package com.yootk.demo;
class MyMath{
    public static int div(int x, int y) throws  Exception{
        System.out.println("=========计算开始=========");
        int result = 0;
        try {
            result = x / y;
        }catch (Exception e){
            throw e;
        }finally {
            System.out.println("=========计算结束=========");
        }
        return result;
    }
}
public class TestDemo234 {
    public static void main(String[] args) {
        try {
            System.out.println(MyMath.div(10,0));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
