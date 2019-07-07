//使用完整异常处理结构
package com.yootk;

public class TestDemo214 {
    public static void main(String[] args) {
        System.out.println("1.除法计算开始。");
        try {
            System.out.println("2.除法计算：" + (10 / 0));
            System.out.println("111111111");
        }catch (ArithmeticException e){
            e.printStackTrace();
        }finally {
            System.out.println("### 不管出不出现异常，我都执行");
        }
        System.out.println("3.除法计算结束。");
    }
}
