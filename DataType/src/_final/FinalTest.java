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
        String c = b + 2;
        String e = d + 2;
        System.out.println((a == c));
        System.out.println((a == e));
    }
}
