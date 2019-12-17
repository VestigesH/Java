public class commonFactor {
    public static void main(String[] args) {
        int a = 27;
        int b = 18;
        //求最大公约数
        //设两个整数为x和y，且x>y,余数z=x%y。当余数不为0时，把除数赋给x做被除数，把余数赋给y做除数,再求得新余数，若还不为0再重复直到余数为0，此时y就是最大公约数
        int bigger,smaller ,i;
        bigger = a > b ? a : b;
        smaller = a > b ? b : a;
        i = bigger % smaller;
        while(i != 0){
            bigger = smaller;
            smaller = i;
            i = bigger % smaller;
        }
        System.out.println(smaller);
    }
}

