package transfer;

/**
 * Author: zhang
 * Time: 9/15/2017
 * Description:
 */
public class TransferDemo {
    public static void main(String[] args) {
        int i = 89;
        String string = String.valueOf(i); //整型转换为字符串
        int j = Integer.parseInt(string);
        int k = Integer.valueOf(string);   //本来这里有.intvalue()但是编译器提示Java5以后不用显式的unboxing，会自动拆箱
                                           //看看源码其实这里调用的还是parseInt()
        int l = Integer.parseInt("ff",16);  //将字符串转换为指定的进制
        System.out.println(l);
    }
}
