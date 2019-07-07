public class TestDemo45 {
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
