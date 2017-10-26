package string;

import java.util.Arrays;

/**
 * Author: zhang
 * Description:
 * Time: 8/21/2017
 */
public class String2CharArray {
    public static void main(String[] args) {
        String str = "123456";
        char[] s = str.toCharArray();
        for (char val : s) {
            System.out.print(val);
        }
        System.out.println();
        System.out.println(Arrays.toString(s));
//        System.out.println("NuRj4mRKyTcwFKj0KmCJAFpXRiHGNq".length());
    }
}
