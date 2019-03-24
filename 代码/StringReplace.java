public class StringReplace {
    public static void main(String args[]){
        String str = "helloworld";
        String resultA = str.replaceAll("l","_");
        String resultB = str.replaceFirst("l","_");
        System.out.println(resultA);
        System.out.println(resultB);
    }
}
