package com.yootk.demo;
class MyMath2{
    public static int div(int x, int y) throws Exception{   //出现异常要交给被调用处输出
        System.out.println("==========计算开始===========");//等价于：资源打开
        int result = 0;
        try {
            result = x / y;                                 //除法计算
        } catch (Exception e){
            throw e;                                        //向上抛
        }finally {
            System.out.println("==========计算结束===========");  //等价于：资源关闭
        }
        return result;
    }
}
public class TestDemo402 {
    public static void main(String[] args) {
        try {
            System.out.println(MyMath2.div(10,0));         //被调用处处理异常
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
