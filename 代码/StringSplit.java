public class StringSplit {
    public static void main(String[] args) {
        String str = "hello yootk nihao mldn";
        String result[] = str.split(" ");
        for(int x = 0;x < result.length;x++){
            System.out.println(result[x]+"、");
        }
    }
}
