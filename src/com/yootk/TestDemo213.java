package com.yootk;

public class TestDemo213 {
    public static void main(String[] args) {
        System.out.println("1.除法运算开始。");
        try {
            System.out.println("2.除法运算：" + (10 / 0));
        }catch (ArithmeticException e) {    //处理算数异常
            e.printStackTrace();//输出异常的完整信息
        }
        System.out.println("3.除法运算结束。");
    }
}
