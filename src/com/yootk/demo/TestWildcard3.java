//设置泛型上限
package com.yootk.demo;
class Message2<T extends Number>{
    private T msg;

    public T getMsg() {
        return msg;
    }

    public void setMsg(T msg) {
        this.msg = msg;
    }
}
public class TestWildcard3 {
    public static void main(String[] args) {
        Message2<Integer> m1 = new Message2<Integer>();     //Integer是Number的子类
        m1.setMsg(100);
        fun(m1);                                              //引用传递
    }
    public static void fun(Message2<? extends Number> temp){    //定义泛型上限
        System.out.println(temp.getMsg());
    }
}
