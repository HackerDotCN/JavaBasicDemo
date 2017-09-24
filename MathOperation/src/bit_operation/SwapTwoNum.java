package bit_operation;

import org.junit.Test;

/**
 * Author: zhang
 * Time: 9/15/2017
 * Description: 不开辟新的的空间交换两个数字
 * 有点类似脑筋急转弯，但是程序员的确要聪明人啊！
 * 《Cracking the coding interview》上还有其他解法
 */
public class SwapTwoNum {
    public static void swapByXor(int a,int b) {
//        int a=5;
//        int b=2;
        System.out.println("通过异或方式交换:");
        System.out.println("交换前：a="+a+", b="+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("交换后：a="+a+", b="+b);
    }

    @Test
    public void test(){

    }
}
