class Book2{                            //定义一个新的类
    /**
     * Book类无参数构造方法
     */
    public Book2(){                      //构造方法
        System.out.println("*************************");
    }
}
public class DefineConstructors {
    public static void main(String args[]){
        Book2 book = null;                           //声明对象不调用构造
        book = new Book2();                          //实例化对象调用构造
    }
}
