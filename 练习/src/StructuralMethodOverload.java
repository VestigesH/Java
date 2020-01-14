class Book5{
    private String title;
    private double price;
    public Book5(){
        System.out.println("无参构造");
    }
    public Book5(String t){
        title = t;
        System.out.println("有一个参数的构造");
    }
    public Book5(String t,double p){
        title = t;
        price = p;
        System.out.println("有两个参数的构造");
    }
    public void setTitle(String t){
        title = t;
    }
    public void setPrice(double p){
        price = p ;
    }
    public String setTitle(){
        return title;
    }
    public double setPrice(){
        return price;
    }
    public void getInfo(){
        System.out.println("图书名称："+ title +",价格："+price);
    }
}
public class StructuralMethodOverload {
    public static void main(String args[]){
        Book5 book = new Book5("Java 开发");
        book.getInfo();
    }
}
