public class CountLetterNumber {
    public static void main(String[] args) {
        String str1 = "want you to know one thing";
        String str2 = "want you to know one thing";
        int sum1 = 0,sum2 = 0;
        while(str1.indexOf("n") != -1) {
            sum1++;
            str1 = str1.substring(str1.indexOf("n")+1);
        }
        while(str2.indexOf("o") != -1) {
            sum2++;
            str2 = str2.substring(str2.indexOf("o")+1);
        }
        System.out.println("n出现的次数为："+sum1);
        System.out.println("o出现的次数为："+sum2);
    }
}
