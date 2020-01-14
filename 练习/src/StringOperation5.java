import java.util.Scanner;

public class StringOperation5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入身份证号：");
        String IDNumber = sc.next();
        System.out.println("截取出的出生日期为：");
        System.out.println(IDNumber.substring(6,14));
    }
}
