package com.yootk.demo;
//设置泛型的下限
class Message3<T>{
    private T msg;

    public T getMsg() {
        return msg;
    }

    public void setMsg(T msg) {
        this.msg = msg;
    }
}
public class TestWildcard4 {
    public static void main(String[] args) {
        Message3 <String> m1 = new Message3<String>();
        m1.setMsg("jiedjeijfeiowdow");
        fun(m1);
    }
    public static void fun(Message3 <? super String> temp){//定义泛型下限
        System.out.println(temp.getMsg());
    }
}
