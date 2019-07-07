class Book {
    String title ;                                  //定义一个新的类
    double price ;                                  //书的名字
    public void getInfo() {                         //书的价格
        System.out.println("图书名称："+ title + ",价格："+ price);        //此方法将由对象调用
    }
}
public class UseCLA {
    public static void main(String args[]) {
        Book bk = new Book();                         //声明并实例化对象
        bk.title = "Java 开发";                       //操作属性内容
        bk.price = 89.9 ;                             //操作属性内容
        bk.getInfo();                                 //调用类中的getInfo()方法
    }
}
