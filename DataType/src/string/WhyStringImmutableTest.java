package string;

import java.util.HashSet;

/**
 * @author: zhangyongbin
 * @Time: 10/10/2017.
 * @Description: http://blog.csdn.net/qingmengwuhen1/article/details/52175303
 */
public class WhyStringImmutableTest {
    public static void main(String[] args) {
        HashSet<StringBuilder> hs = new HashSet<StringBuilder>();
        StringBuilder sb1 = new StringBuilder("aaa");
        StringBuilder sb2 = new StringBuilder("aaabbb");
        hs.add(sb1);
        hs.add(sb2);    //这时候HashSet里是{"aaa","aaabbb"}

        HashSet<String> hashSet = new HashSet<>();
        String str1 = "aaabbb";
        String str2 = new String("aaabbb");
        hashSet.add(str1);
        hashSet.add(str2);

        StringBuilder sb3 = sb1;
        sb3.append("bbb");//这时候HashSet里是{"aaabbb","aaabbb"}
        System.out.println(hs);
        System.out.println(hashSet);
    }
}
