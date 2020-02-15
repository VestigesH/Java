//声明过期操作
package com.yootk.demo;
class Book{
    @Deprecated                   //此方法为过期操作
    public void fun(){            //使用会有警告，但是不会出错
    }
}
public class DeclareExpiredOperation {
    public static void main(String[] args) {
        Book book = new Book();
        book.fun();               //此方法不建议使用
    }
}
