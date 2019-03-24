class Book1 {                                //定义一个新的类
    private String title;                    //书的名字
    private double price;                    //书的价格
    /**
     * 设置或修改title属性内容
     * @param t 接受要设置的数据
     */
    public void setTitle(String t) {         //设置title属性内容
        title = t;
    }
    /**
     * 设置或修改price属性内容
     * @param p 接受要设置的数据
     */
    public void setPrice(double p) {          //设置price属性内容
        if (p > 0.0) {                        //进行数据验证
            price = p;
        }
    }
    /**
     * 取得title属性内容
     * @return title属性数据
     */
    public String getTitle() {                //取得title属性内容
        return title;
    }
    /**
     * 取得price属性内容
     * @return price属性数据
     */
    public double getPrice() {                 //获得price属性内容
        return price;
    }
    /**
     * 输出对象完整信息
     */
    public void getInfo() {                     //此方法将由对象调用
        System.out.println("图书名称：" + title + "，价格：" + price);
    }
}
public class UsePrivateEncapsulateProperties{
    public static void main(String args[]){
        Book1 book = new Book1();               //声明并实例化对象
        book.setTitle("Java 开发");             //设置属性内容
        book.setPrice(-89.9);                   //设置属性内容
        book.getInfo();                         //调用方法
    }
}

