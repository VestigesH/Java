class Book3{
    private String title;
    private double price;
    /**
     * Book类构造方法，用于设置title与price属性的内容
     * @param t title属性内容
     * @param p price属性内容
     */
    public Book3 (String t,double p){            //定义构造方法
        setTitle(t);                             //调用本类方法
        setPrice(p);                             //调用本类方法
    }
    public void setTitle(String t){
        title = t;
    }
    public void setPrice(double p){
        price = p;
    }
    public String  getTitle(){
        return title;
    }
    public double getPrice(){
        return price;
    }
    public void getInfo(){
        System.out.println("图书名称："+ title +"，价格："+ price);
    }
}
public class AttributeAssignment {
    public static void main(String args[]) {
        Book3 book = new Book3("Java 开发", 69.8);
        book.getInfo();
    }
}
