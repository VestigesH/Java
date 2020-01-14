public class StringDemo12 {
    public static void main(String[] args) {
        String str = "helloworld";

        //字符串查找
        if(str.contains("l")){
            System.out.println("可以查询到数据");
        }
        System.out.println(str.indexOf("world"));
        System.out.println(str.indexOf("l"));
        System.out.println(str.indexOf("l",5));
        System.out.println(str.lastIndexOf("l"));

        String str1 = "##@@hello**";
        System.out.println(str1.startsWith("##"));//是否以##开头
        System.out.println(str1.startsWith("@@",2));//从第二个索引是否以@@开头
        System.out.println(str1.endsWith("**"));//是否以**结尾


        //字符串替换
        String resultA = str.replaceAll("l","_");//全部替换
        String resultB = str.replaceFirst("l","_");//替换首个满足条件的内容
        System.out.println(resultA);
        System.out.println(resultB);



        //字符串截取
        String resultC = str.substring(5);//从指定索引截取到结尾
        String resultD = str.substring(0,5);//截取部分子字符串
        System.out.println(resultC);
        System.out.println(resultD);


        //字符串的拆分
        String str2 = "hello yootk nihao mldn";
        String result[] = str2.split(" ");//以空格为间隔拆分
        for(int x = 0; x < result.length; x++){
            System.out.println(result[x] + ",");
        }


        //字符串的连接
        String str3 = "hello".concat("world");
        System.out.println(str3);


        //字符串转大写与转小写
        String str4 = "(*(*Hello(*(*";
        System.out.println(str4.toUpperCase());
        System.out.println(str4.toLowerCase());


        //去掉字符串左右两边空格
        String str5 = "   hello world  ";
        System.out.println("[" + str5 + "]");
        System.out.println("[" + str5.trim() + "]");


        //取得字符串长度
        System.out.println(str.length());


        //判断是否为空字符串
        System.out.println(str.isEmpty());
        System.out.println("".isEmpty());
    }
}
