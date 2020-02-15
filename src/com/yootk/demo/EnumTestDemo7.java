//定义抽象方法并覆写
package com.yootk.demo;
enum Color7{
    RED("红色"){
        public String getTitle(){
            return this + "-red";
        }
    },
    GREEN("绿色"){
        public String getTitle(){
            return this + "-green";
        }
    },
    BLUE("蓝色"){
        public String getTitle(){
            return this + "-blue";
        }
    };
    private String title;
    private Color7(String title){
        this.title = title;
    }
    public String toString(){
        return this.title;
    }
    public abstract String getTitle();           //定义抽象方法
}
public class EnumTestDemo7 {
    public static void main(String[] args) {
        System.out.println(Color7.RED.getTitle());
    }
}
