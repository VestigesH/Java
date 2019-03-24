public class DeclareTwoObjects {
    public static void main(String args[]) {
        Book bookA = new Book();                         //声明并实例化第一个对象
        Book bookB = new Book();                         //声明并实例化第二个对象
        bookA.title = "Java 开发" ;                      //设置第一个对象的属性内容
        bookA.price = 89.9 ;                             //设置第一个对象的属性内容
        bookB.title = "JSP 开发";                        //设置第二个对象的属性内容
        bookB.price = 69.9 ;                             //设置第二个对象的属性内容
        bookA.getInfo();                                 //调用类中的方法输出信息
        bookB.getInfo();                                 //调用类中的方法输出信息
    }
}
