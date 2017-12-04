package string;

/**
 * @author: zhangyongbin
 * @Time: 11/29/2017.
 * @Description:
 */
public class NullAndLengthZero {
    public static void main(String[] args) {
        //字符串非空，但是长度为0
        String s = "";
        System.out.println(s== null);
        System.out.println(s.length());
        //字符串长度为1，只有一个空格字符
        String s1 = " ";
        System.out.println(s1== null);
        System.out.println(s1.length());
        //这样的数组长度为0，同样非空
        int[] arr = {};
        System.out.println(arr == null);
        System.out.println(arr.length);
    }
}
