//使用枚举定义的方法
package com.yootk.demo;
enum Color2{
    RED, GREEN, BLUE;
}
public class EnumTestDemo2 {
    public static void main(String[] args) {
        Color2 red = Color2.RED;
        System.out.println("枚举对象序号：" + red.ordinal());
        System.out.println("枚举对象名称：" + red.name());
    }
}
