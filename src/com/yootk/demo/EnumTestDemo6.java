//枚举实现接口2
package com.yootk.demo;
interface IMessage3{
    public String getTitle();
}
enum Color6 implements IMessage3{
    RED("红色"){                   //适应匿名内部类的方式实现接口
        @Override
        public String getTitle() {
            return this + "-red";
        }
    },
    GREEN("绿色"){
        @Override
        public String getTitle() {
            return this + "-green";
        }
    },
    BLUE("蓝色"){
        @Override
        public String getTitle() {
            return this + "-blue";
        }
    };
    private String title;            //属性
    private Color6(String title){    //构造方法 不能使用public声明
        this.title = title;
    }
    public String toString(){            //覆写toString()方法
        return  this.title;
    }

}
public class EnumTestDemo6 {
    public static void main(String[] args) {
        IMessage3 msg = Color6.RED;            //实例化接口对象
        System.out.println(msg.getTitle());
    }
}
