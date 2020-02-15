//扩充枚举类型
package com.yootk.demo;
enum Color4{
    RED("红色"), GREEN("绿色"), BLUE("蓝色");
    private String title;
    private Color4(String title){
        this.title = title;
    }

    public String toString() {            //覆写toString方法
        return title;
    }
}
public class EnumTestDemo4 {
    public static void main(String[] args) {
        for(Color4 c: Color4.values()){        //取得全部枚举类型
            System.out.println(c + ",");       //直接取得对象调用toString
        }
    }
}
