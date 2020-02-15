package com.yootk.demo;
//此时设置的T在Point类定义上只表示一个标记，在使用的时需要为其设置具体的表现
class Point2<T>{                          //定义坐标，Type = 简写为T，是一个类型标记
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
//不设置泛型类型
public class TestPoint2 {
    public static void main(String[] args) {
        //第一步：根据需要设置数据，假设此时的作用是传递作用
        Point2 p = new Point2();        //将使用Object类型描述泛型
        p.setX(10);                     //设置坐标数据，向上转型为Object
        p.setY(20);                     //设置坐标数据，向上转型为Object
        //第二步：根据设置好的坐标取出数据进行操作
        Integer x = (Integer) p.getX();
        Integer y = (Integer) p.getY();
        System.out.println("x 坐标：" + x + ", y 坐标：" + y);
    }
}
