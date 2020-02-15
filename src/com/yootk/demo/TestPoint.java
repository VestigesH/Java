package com.yootk.demo;
//此时设置的T在Point类定义上只表示一个标记，在使用的时需要为其设置具体的表现
class Point<T>{                          //定义坐标，Type = 简写为T，是一个类型标记
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

//使用Point类将泛型类型设置为String
public class TestPoint {
    public static void main(String[] args) {
        //第一步：根据需要设置数据，假设此时的作用是传递坐标
        Point <String> p = new Point<String>();      //实例化Point类数据，设置泛型类型为String
        p.setX("东经100度");                         //设置坐标数据
        p.setY("北纬20度");                          //设置坐标数据
        //第二步：根据设置好的坐标取出数据进行操作
        String x = p.getX();                         //取出坐标数据，不再需要强制转换
        String y = p.getY();                         //取出坐标数据，不再需要强制转换
        System.out.println("x 坐标：" + x + " ，y 坐标：" + y);

    }
}
