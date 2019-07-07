//应用异常处理格式
package com.yootk;

public class TestDemo212 {
    public static void main(String[] args) {
        System.out.println("1.除法运算开始。");
        try {
            System.out.println("2.除法运算：" + (10 / 0));
        }catch (ArithmeticException e) {
            System.out.println("出现异常了");
        }
        System.out.println("3.除法运算结束。");
    }
}
