class BookB{
    public void print(){
        System.out.println("this = "+this);
    }
}
public class UseThis2 {
    public static void main(String[] args) {
        BookB book = new BookB();
        System.out.println("book = "+book);
        book.print();
        System.out.println("------------------------");
        BookB book1 = new BookB();
        System.out.println("book1 = "+book1);
        book1.print();
    }
}
