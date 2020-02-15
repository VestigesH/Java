package com.yootk.demo;

public class TestForeach {
    public static void main(String[] args) {
        int data[] = new int[]{1, 2, 3, 4, 5};
        for(int x: data){   //循环次数由数组决定
            //每一次循环实际上都表示数组的角标增长，会取得一个数组的内容，并且将其设置给x
            System.out.print(x + ",");
        }
    }
}
