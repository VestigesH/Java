public class useFloat {
    public static void main(String[] args) {
        float f1 = 10.2F;          //小数都是double型，所以需要强行转化为float型
        float f2 = (float) 10.2;   //小数都是double型，所以需要强行转化为float型
        System.out.println(f1 * f2);   //float * float = float;
    }
}
