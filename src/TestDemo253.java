//功能二：实现属性的自动设置
class Booke{
    private String title;
    private static int num = 0;
    public Booke(){    //无参构造   自动命名
        this("NOTITLE - "   + num ++);
    }

    public Booke(String title) {     //有参构造 设置title内容
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}

public class TestDemo253 {
    public static void main(String[] args) {
        System.out.println(new Booke("Java").getTitle());
        System.out.println(new Booke().getTitle());
        System.out.println(new Booke().getTitle());
    }
}
