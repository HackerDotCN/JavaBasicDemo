

import java.util.ArrayList;
import java.util.List;

/**
 * Author: zhang
 * Time: 8/21/2017
 * Description:
 */
public class ObjectApi {
    public static void classDemo() {
        Object object = "ddd";
        List<String> stringList = new ArrayList<>();
        Class clazz = stringList.getClass();
        Class clazz2 = ArrayList.class;
        System.out.println(clazz.toString());
        System.out.println(clazz2.toString());
    }

    public static void hashCodeDemo() {
        String str = new String("abc");
        String str2 = str;
        String str3 = "abc";
        String str4 = new String("abc");
        System.out.println(str.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());
        System.out.println(str4.hashCode());
        System.out.println(str.equals(str4));
        System.out.println(str == str3 ? "str == str3" : "str != str3");
    }

    @Test
    private void test(){

    }

    public static void main(String[] args) {
        hashCodeDemo();
    }


}
