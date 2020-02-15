package com.yootk.demo;

class Message<T>{        //类上使用泛型
    private T msg;

    public void setMsg(T msg) {
        this.msg = msg;
    }

    public T getMsg() {
        return msg;
    }
}
public class TestWildcard1 {
    public static void main(String[] args) {
        Message <String> m = new Message <String> ();
        m.setMsg("www.yootk.com");
        fun(m);    //引用传递
    }
    /**
     * 接收Message类对象，并且调用getter方法输出类中的msg属性内容
     * @param temp 接收Message类对象的引用传递，此处设置的泛型类型为String
     */
    public static void fun(Message <String> temp){
        System.out.println(temp.getMsg());
    }
}
