package com.yootk.demo;

public class TestDemo401 {
    public static void main(String[] args) {
        System.out.println("1.除法计算开始。");
        try {
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);
            System.out.println("2.除法计算：" + (x / y));
            System.out.println("!!!");
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println("##########不论是否出现异常，我都执行");
        }
        System.out.println("3.除法计算结束");
    }
}
