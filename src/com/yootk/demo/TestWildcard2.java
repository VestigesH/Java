//使用通配符"?"解决参数传递问题
package com.yootk.demo;

class Message1 <T>{
    private T msg;

    public T getMsg() {
        return msg;
    }

    public void setMsg(T msg) {
        this.msg = msg;
    }
}
public class TestWildcard2 {
    public static void main(String[] args) {
        Message1 <Integer> m1 = new Message1<Integer>();
        Message1 <String> m2 = new Message1<String>();
        m1.setMsg(100);
        m2.setMsg("www.yootk.com");
        fun(m1);          //引用传递
        fun(m2);          //引用传递
    }
    public static void fun(Message1 <?> temp){      //不能设置，但可以取出
        System.out.println(temp.getMsg());
    }
}
