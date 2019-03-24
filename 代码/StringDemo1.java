public class StringDemo1 {
    public static void main(String args[]){
        String str = "123423432";
        if(isNumber(str)){
            System.out.println("字符串由数字组成！");
        }else{
            System.out.println("字符串由非数字组成！");
        }
    }
    public static boolean isNumber(String temp){
        char[] data=temp.toCharArray();                //将数组变成字符数组，可以取出每一位字符进行判断
        for(int x = 0;x<data.length;x++){
            if(data[x]>'9' || data[x]<'0'){
                return false;
            }
        }
        return true;
    }
}
