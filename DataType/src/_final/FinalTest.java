package _final;

/**
 * @author: zhangyongbin
 * @Time: 2017/8/29/0029.
 * @Description:
 */
public class FinalTest {
    public static void main(String[] args)  {
        String a = "hello2";
        final String b = "hello";
        String d = "hello";
        System.out.println((a == (b + 2)));
        System.out.println((a == (d + 2)));
    }
}
