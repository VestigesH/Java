package com.yootk.demo;
//此时设置的T在Point类定义上只表示一个标记，在使用的时需要为其设置具体的表现
class Point1<T>{                          //定义坐标，Type = 简写为T，是一个类型标记
    private T x;                         //此属性的类型不知道，由Point类使用时动态决定
    private T y;                         //此属性的类型不知道，由Point类使用时动态决定

    public void setX(T x) {
        this.x = x;
    }

    public void setY(T y) {
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public T getY() {
        return y;
    }
}
//将泛型类型设置为整型
public class TestPoint1 {
    public static void main(String[] args) {
        Point1 <Integer> p = new Point1<Integer>();
        p.setX(10);
        p.setY(20);
        int x = p.getX();
        int y = p.getY();
        System.out.println("x 坐标：" + x + ", y 坐标：" + y);
    }
}
