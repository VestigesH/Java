public class SumWhile {
    public static void main(String[] args) {
        int i = 100 , sum = 0;
        while(i<=200) {
            sum += i;
            i++;
        }
        System.out.println("sum = "+sum);
    }
}
