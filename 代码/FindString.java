public class FindString {
    public static void main(String args[]){
        String str = "helloworld";
        System.out.println(str.indexOf("world"));
        System.out.println(str.indexOf("l"));
        System.out.println(str.indexOf("l",5));
        System.out.println(str.lastIndexOf("l"));
    }
}
