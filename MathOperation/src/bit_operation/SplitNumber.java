package bit_operation;

import java.util.Arrays;

/**
 * Author: zhang
 * Time: 9/15/2017
 * Description: http://blog.csdn.net/pearyangyang/article/details/48808089
 */

public class SplitNumber {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(toUgroupArray(22)));
    }

    /**
     * 以2的次方开始的转换成整型数组，字符串数组
     *
     * @param sum 传入派系的值，可以是一个派系的值，也可以是多个派系相加的值
     *            2^1 + 2^2 这种
     *            突然忘记移位操作也是一种指数幂的运算
     * @return
     */
    private static int[] toUgroupArray(int sum) {
        if (sum < 0) {
            System.out.println("you have an eroor code");
        } else if (sum == 0) {
            System.out.println("you have no choise code");
        } else {
            String binaryCode = Integer.toBinaryString(sum);
            System.out.println("binary code:" + binaryCode);
            int index = binaryCode.length() - 1;
            String str = "";
            for (int i = 0; i < binaryCode.length(); i++) {
                if (binaryCode.charAt(i) == '1') {
                    str = str + index + ",";
                }
                index--;
            }
            str = str.substring(0, str.length() - 1);
            System.out.println(str);
            String[] strArray = str.split(",");
            int[] result = new int[strArray.length];
            //也可以返回一个字符数组
            //String[] result2 = new String[strArray.length];
            for (int i = 0; i < strArray.length; i++) {
                //result[i] = (int)Math.pow(2, Double.parseDouble(strArray[i]));
                result[i] = 2 << (Integer.parseInt(strArray[i]) - 1);
            }
            return result;
        }
        return null;
    }

}
