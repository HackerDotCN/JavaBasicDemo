package encoding;

import java.nio.charset.Charset;

/**
 * @author: zhangyongbin
 * @Time: 10/9/2017.
 * @Description:
 */
public class EncodingTest {
    public static void main(String[] args) {
        String myCharset =  Charset.defaultCharset().name();
        System.out.println(myCharset);
    }
}
