//泛型接口
//实现方法二：在子类中不设置泛型，而为父类接口明确地定义一个泛型类型
package com.yootk.demo;
interface IMessage1<T>{
    public void print(T t);
}
class MessageImpl1 implements IMessage1<String>{

    @Override
    public void print(String s) {

    }
}
public class TestWildcard6 {
    public static void main(String[] args) {
        IMessage1<String> msg = new MessageImpl1();
        System.out.println("frkfrjfirjgrigjrrig");
    }
}
