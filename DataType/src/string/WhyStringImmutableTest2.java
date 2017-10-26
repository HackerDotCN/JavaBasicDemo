package string;

/**
 * @author: zhangyongbin
 * @Time: 10/10/2017.
 * @Description:
 */

public class WhyStringImmutableTest2 {
    //不可变的String
    public static String appendStr(String s) {
        s += "bbb";
        return s;
    }

    //可变的StringBuilder
    public static StringBuilder appendSb(StringBuilder sb) {
        return sb.append("bbb");
    }

    public static void main(String[] args) {
        String s = new String("aaa");
        String ns = WhyStringImmutableTest2.appendStr(s);
        System.out.println("String aaa>>>" + s.toString());

        //StringBuilder做参数
        StringBuilder sb = new StringBuilder("aaa");
        StringBuilder nsb = WhyStringImmutableTest2.appendSb(sb);
        System.out.println("StringBuilder aaa >>>" + sb.toString());
    }
}
