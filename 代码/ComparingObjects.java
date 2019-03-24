class Bookc{
     private String title;
     private double price;
     public Bookc(String title,double price){
         this.title = title;
         this.price = price;
     }
     public boolean compare(Bookc book){
         if(book == null){
             return false;
         }
         if(this == book){
             return true;
         }
         if (this.title.equals(book.title) && this.price ==price){
             return true;
         }else{
             return false;
         }
     }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
public class ComparingObjects {
    public static void main(String[] args) {
        Bookc b1 = new Bookc("Java开发",89.9);
        Bookc b2 = new Bookc("Java开发",89.9);
        if(b1.compare(b2)){
            System.out.println("是同一个对象！");
        }else{
            System.out.println("不是同一个对象！");
        }
    }
}

