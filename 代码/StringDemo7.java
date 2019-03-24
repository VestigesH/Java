public class StringDemo7 {
    public static void main(String[] args) {
        String str = "yootk";
        System.out.println(initcap(str));
    }
    public static String initcap(String temp){
        return temp.substring(0,1).toUpperCase()+temp.substring(1);
    }
}
