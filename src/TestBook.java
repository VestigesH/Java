//this的使用（调用本类普通方法）
class Booka{
    private String name;
    private double price;
    public Booka(String name, double price){
        this.name = name;
        this.price = price;
    }
    public void print(){
        System.out.println("DDEDEDEFf");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public String getInfo(){
        this.print();   //调用本类方法
        return "书名：" + name + "价格：" + price;
    }
}
public class TestBook {
    public static void main(String[] args) {
        Booka booka = new Booka("Java开发",89.9);
        System.out.println(booka.getInfo());
    }
}
