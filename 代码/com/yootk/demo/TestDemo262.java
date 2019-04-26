//定义 AddException
package com.yootk.demo;
class AddException extends Exception{   // 此异常类要强制处理
    public AddException(String msg){
        super(msg);   //调用父类构造
    }
}
public class TestDemo262 {
    public static void main(String[] args) {
        int num = 20;
        try {
            if (num > 10) {  //出现了错误，应该产生异常
                throw new AddException("数值传递的过大了");
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
