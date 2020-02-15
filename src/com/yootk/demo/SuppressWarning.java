//压制多个警告信息
package com.yootk.demo;
class Booka <T>{
    private T title;

    public T getTitle() {
        return title;
    }

    public void setTitle(T title) {
        this.title = title;
    }
}
public class SuppressWarning {
    @SuppressWarnings({"rawtypes","unchecked"})
    public static void main(String[] args) {
        Booka book = new Booka();   //没有声明泛型，产生"rawtypes"警告信息
        book.setTitle("Hello");     //没有警告信息，产生"unchecked"警告信息
    }
}
