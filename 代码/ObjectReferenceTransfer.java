public class ObjectReferenceTransfer {
    public static void main(String args[]){
        Book bookA = new Book();                    //声明并实例化第一个对象
        Book bookB = null ;                          //声明第二个对象
        bookA.title = "Java 开发";                   //设置第一个对象的属性内容
        bookA.price = 89.9;
        bookB = bookA;                               //引用传递
        bookB.price = 69.8 ;                         //利用第二个对象设置属性内容
        bookA.getInfo();                             //调用类中的方法输出信息
    }
}
