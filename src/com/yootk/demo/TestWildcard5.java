//泛型接口
//实现方法一：在子类中继续设置泛型标记
package com.yootk.demo;

interface IMessage <T>{
    public void print(T t);
}
class MessageImpl<S> implements IMessage<S>{
    @Override
    public void print(S s) {

    }
}
public class TestWildcard5 {
    public static void main(String[] args) {
        IMessage<String> msg = new MessageImpl<String>();
        System.out.println("ddjiedjeidowidod");
    }
}
