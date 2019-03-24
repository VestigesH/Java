class Book4{
    private String title;
    private double price;
    public Book4(String t,double p){
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
    public String getInfo(){
        return "书名："+title+"价格："+price;
    }
}
public class ClassArray {
    public static void main(String args[]){
        Book4 book4[] = new Book4[3];
        book4[0] = new Book4("Java 开发",79.8);
        book4[1] = new Book4("JSP",69.8);
        book4[2] = new Book4("Android",89.8);
        for(int x = 0;x<book4.length;x++){
            System.out.println(book4[x].getInfo());
        }
    }
}
