public class StringUppercase {
    public static void main(String args[]){
        String str = "hello";
        char[] data =str.toCharArray();
        for(int x=0;x<data.length;x++){
            data[x] -= 32;
        }
        System.out.println(new String(data));
        System.out.println(new String(data,1, 2));
    }
}
