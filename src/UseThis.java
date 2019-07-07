class BookA{
    private String title;
    private double price;
    public BookA(){
        System.out.println("一个新的BookA类对象产生");
    }
    public BookA(String title){
        this();
        this.title = title;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public BookA (String title, double price ){
        this(title);
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getInfo(){
        return "书名："+title +",价格："+price;
    }
}
public class UseThis {
    public static void main(String[] args) {
       BookA bookA = new BookA("Java 开发",79.9);
       System.out.println(bookA.getInfo());
    }
}
