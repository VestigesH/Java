import java.util.Scanner;
public class ClimbStairs {
    public static int getWay(int n){
        int  way = 0;
        return (n == 1 || n == 2) ? n : getWay(n - 1) + getWay(n - 2);
    }

    public static void main(String[] args) {
        System.out.println("请输入台阶数n：");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int way = getWay(n);
        System.out.println("爬楼梯的方法有"+  way +"种！");
    }
}
