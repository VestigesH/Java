//在switch语句上使用枚举
package com.yootk.demo;
enum Color8{
    RED, GREEN, BLUE;
}
public class UseEnum1 {
    public static void main(String[] args) {
        Color8 c = Color8.RED;
        switch (c){
            case RED:
                System.out.println("这是红色");
                break;
            case GREEN:
                System.out.println("这是绿色");
                break;
            case BLUE:
                System.out.println("这是蓝色");
                break;
        }
    }
}
