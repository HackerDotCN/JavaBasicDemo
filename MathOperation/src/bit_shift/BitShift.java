package bit_shift;

/**
 * @author: zhangyongbin
 * @Time: 2017/9/6  0006.
 * @Description:
 */
public class BitShift {
    public static void main(String[] args) {
        int number = -7;       //原始数二进制
        printInfo(number);
        int number1 = number << 1;  //左移1位
//        System.out.print("左移一位： ");
        printInfo(number1);
        int number2 = number >> 1;  //右移一位
//        System.out.print("右移一位：");
        printInfo(number2);
        int number3 = number >>> 2;  //无符号右移
//        System.out.print("无符号右移两位:");
        printInfo(number3);
        System.out.println((int)(1.5)); //小数转成正数
        System.out.println((int)(-1.5));
        System.out.println(2147483647);
        System.out.println(Integer.MAX_VALUE+1);
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE+1));
        System.out.println(Integer.toBinaryString(0));

        int left = 2;
        int right = 2;
        //注意这里移位时要加括号保证运算的优先级
        int mid = left + ((right - left) >> 1);
        System.out.println("mid值："+mid);
        printInfo(0>>1);
    }

    /**
     * 输出一个int的二进制数
     * @param num
     */
    private static void printInfo(int num){
        System.out.println(Integer.toBinaryString(num)); //转化为二进制数字打印
    }
}
