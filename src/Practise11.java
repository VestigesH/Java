//关于数值型包装类的相等判断问题
public class Practise11 {
    public static void main(String[] args) {
        Integer obja = 10;
        Integer objb = 10;
        Integer objc = new Integer(10);
        System.out.println(obja == objb);
        System.out.println(obja == objc);
        System.out.println(objb == objc);
        System.out.println(obja.equals(objc));
    }
}
