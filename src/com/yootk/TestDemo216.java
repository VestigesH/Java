//加入多个catch进行异常处理
package com.yootk;

public class TestDemo216 {
    public static void main(String[] args) {
        System.out.println("1.除法计算开始。");
        try {
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);
            System.out.println("2.除法计算为："+ (x / y));
            System.out.println("!1111111111111111");
        }catch (ArrayIndexOutOfBoundsException e){    //处理参数不足异常
            e.printStackTrace();
        }catch (NumberFormatException e){      //处理数字转换异常
            e.printStackTrace();
        }catch (ArithmeticException e){        //处理算数异常
            e.printStackTrace();                //输出异常的完整信息
        }finally {
            System.out.println("###    不管是否出现异常我都出现");
        }
        System.out.println("3.除法计算结束。");
    }
}
