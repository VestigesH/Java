import java.util.Scanner;
public class JudgmentNumberAreDividedByThreeNumbers {
    public static void main(String[] args) {
        System.out.println("请输入要进行判断的数字：");
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        if((n % 3 == 0) && (n % 5 ==0) && (n % 7)==0) {
            System.out.println(n+"能被3，5，7同时整除！");
        } else {
            System.out.println(n+"不能被3，5，7同时整除！");
        }
    }
}
