package bit_operation;

/**
 * Author: zhang
 * Time: 9/15/2017
 * Description:
 */
public class ShiftDemo {
    public static void main(String[] args) {
        int i = -16;
        System.out.println(i>>2);  //带符号右移
        System.out.println(i>>>2); //无符号右移
    }
}
