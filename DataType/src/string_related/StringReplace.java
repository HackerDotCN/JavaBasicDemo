package string_related;

/**
 * Author: zhang
 * Time: 9/21/2017
 * Description:
 */
public class StringReplace {
    public static void main(String[] args) {
        String strTmp = new String("ABCCCA");
        strTmp = strTmp.replaceAll("A", "X");
        System.out.println(strTmp);
    }
}
