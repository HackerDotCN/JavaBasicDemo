package get_byte_length;

import java.io.UnsupportedEncodingException;

/**
 * @author: zhangyongbin
 * @Time: 11/16/2017.
 * @Description:
 */
public class ByteLength {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String a = "123abc";
        int num = a.getBytes("utf-8").length;
        System.out.println(num);
        a = "中文";
        num = a.getBytes("utf-8").length;
        System.out.println(num);
        Boolean test = false;
        System.out.println(test);
    }
}
