public class ToggleBetweenCharacterArrayAndString {
    public static void main(String args[]){
        String str = "hello";
        char[] data =str.toCharArray();
        for(int x = 0;x<data.length;x++){
            System.out.print(data[x]+"、");
        }
    }
}
