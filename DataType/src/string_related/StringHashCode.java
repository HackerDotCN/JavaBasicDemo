package string_related;

/**
 * Author: zhang
 * Time: 8/17/2017
 * Description:
 */
    public class StringHashCode {
    public static void main(String[] args) {
        String str = "hello";
//        Object str2 = "hello";
        System.out.println(str.hashCode());
        str = str + "world!";
        System.out.println(str.hashCode());
    }
}
