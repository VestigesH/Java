//定义颜色的枚举类
package com.yootk.demo;
enum Color{
    RED, GREEN, BLUE;
}
public class EnumTestDemo {
    public static void main(String[] args) {
        Color red = Color.RED;//    直接取得对象
        System.out.println(red);
    }
}
