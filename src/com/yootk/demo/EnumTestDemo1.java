//利用多例设计模式实现类似枚举地操作
package com.yootk.demo;
class Color1{
    private String title;
    private static final Color1 RED = new Color1("红色");
    private static final Color1 GREEN = new Color1("绿色");
    private static final Color1 BLUE = new Color1("蓝色");
    private Color1(String title){
        this.title = title;
    }
    public static Color1 getInstance(int ch){
        switch (ch){
            case 1:
                return RED;
            case 2:
                return GREEN;
            case 3:
                return BLUE;
                default:
                    return null;
        }
    }

    @Override
    public String toString() {
        return this.title;
    }
}
public class EnumTestDemo1 {
    public static void main(String[] args) {
        Color1 red = Color1.getInstance(1);
        System.out.println(red);
    }
}
