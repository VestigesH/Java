//返回枚举中的全部内容
package com.yootk.demo;
enum Color3{
    RED, GREEN, BLUE;
}
public class EnumTestDemo3 {
    public static void main(String[] args) {
        for(Color3 c: Color3.values()){
            System.out.println(c.ordinal() + " - " + c.name());
        }
    }
}
