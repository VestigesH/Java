//枚举实现接口1
package com.yootk.demo;
interface IMessage2{
    public String getTitle();
}
enum Color5 implements IMessage2{
    RED("红色"),GREEN("绿色"), BLUE("蓝色");
    private String title;
    private Color5(String title){
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }
    public String toString(){               //覆写toString方法
        return this.title;
    }
}
public class EnumTestDemo5 {
    public static void main(String[] args) {
        IMessage2 msg = Color5.RED;                //实例化接口对象
        System.out.println(msg.getTitle());
    }
}
