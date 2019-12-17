public class caseConversion {
    public static void main(String[] args) {
        char c = 'A';      //大写字母
        int num = c;       //需要将字符变为int型才可以使用加法运算
        num += 32;         //变为小写字母的编码
        c = (char) num;    //将int变为char型
        System.out.println(c);
    }
}
