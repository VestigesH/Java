public class StringToByteArrayConversion {
    public static void main(String args[]){
        String str = "helloworld";
        byte[] data = str.getBytes();              //将字符串变为字节数组
        for(int x = 0;x<data.length;x++){
            data[x] -= 32;
        }
        System.out.println(new String(data));                        //全部转换
        System.out.println(new String(data,5,5));   //部分转换
    }
}
