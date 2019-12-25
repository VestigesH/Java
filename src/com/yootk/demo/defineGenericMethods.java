package com.yootk.demo;

public class defineGenericMethods {
    public static void main(String[] args) {
        String str = fun("WWW.yootk.com");
        System.out.println(str.length());
    }
    public static <T> T fun(T t){
        return t;
    }
}
