package alphanumeric_judge;

/**
 * Author: zhang
 * Time: 10/13/2017
 * Description:
 *  判断字符是否为数字或字母
 */
public class AlphanumericTest {
    public static void main(String[] args) {
        String str = "12d";
        String str2 = "123";
        System.out.println(isNumeric(str));
        System.out.println(isNumeric(str2));

        System.out.println(Character.isLetter('c'));
        System.out.println(Character.isLetter('5'));
    }

    public static boolean isNumeric(String str) {
        for (int i = str.length(); --i >= 0; ) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
