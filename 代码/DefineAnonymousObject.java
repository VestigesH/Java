class Book6{
    private String title;
    private double price;
    public Book6(String t,double p){
        title = t;
        price = p;
    }
    public void setTitle(String t){
        title = t;
    }
    public void setPrice(double p){
        price = p;
    }
    public String getTitle(){
        return title;
    }
    public double getPrice(){
        return price;
    }
    public void getInfo(){
        System.out.println("图书名称："+ title + ",价格："+price);
    }
}
public class DefineAnonymousObject {                                    //定义匿名对象
    public static void main(String args[]){
        new Book6("Java 开发",69.8).getInfo();
    }
}
