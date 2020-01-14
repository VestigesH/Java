public class SumDoWhile {
    public static void main(String[] args) {
        int i = 100 , sum = 0;
        do{
            sum += i;
            i++;
        }while(i <= 200);
        System.out.println("sum = "+sum);
    }
}
