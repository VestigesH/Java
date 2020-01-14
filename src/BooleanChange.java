public class BooleanChange {
    public static void main(String[] args) {
        String str = "true";
        boolean flag = Boolean.parseBoolean(str);
        if(flag)
        {
            System.out.println("** 满足条件");
        }else{
            System.out.println("**  不满足条件");
        }
    }
}
