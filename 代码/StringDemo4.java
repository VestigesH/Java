public class StringDemo4 {
    public static void main(String args[]){
        String str = "##@@hello**";
        System.out.println(str.startsWith("##"));
        System.out.println(str.startsWith("@@",2));
        System.out.println(str.endsWith("**"));
    }
}
