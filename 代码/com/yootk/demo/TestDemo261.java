package com.yootk.demo;

public class TestDemo261 {
    public static void main(String[] args) {
        int num = 10;
        //假设中间可能经历了20行代码来操作num的内容，期望的内容应该是20
        assert num == 20 : "num的内容不是20";   //进行断言操作
        System.out.println("num = " + num);
    }
}
