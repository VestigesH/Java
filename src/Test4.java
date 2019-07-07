class Bookd{
    private String title;
    private double price;
    private static String pub ="清华大学出版社";
    public Bookd(String  title,double price){
        this.title = title;
        this.price = price;
    }
    public static void setPub(String p) {
        pub = p;
    }
    public String getInfo(){
        return "图书名称："+this.title+",价格："+this.price+",出版社："+this.pub;
    }
}
public class Test4 {
    public static void main(String[] args) {
        Bookd.setPub("北京大学出版社");
        Bookd ba = new Bookd("Java开发",89.9);
        Bookd bb = new Bookd("Android开发",12.9);
        Bookd bc = new Bookd("JSp",79.9);
        System.out.println(ba.getInfo());
        System.out.println(bb.getInfo());
        System.out.println(bc.getInfo());
    }
}
