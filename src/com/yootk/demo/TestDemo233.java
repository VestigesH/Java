package com.yootk.demo;

public class TestDemo233 {
    public static void main(String[] args) {
        try {    //直接抛出一个自定义的异常类对象
             throw new Exception("自己定义的异常!");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
