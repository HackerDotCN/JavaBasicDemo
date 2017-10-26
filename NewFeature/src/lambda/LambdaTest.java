package lambda;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: zhangyongbin
 * @Time: 10/26/2017.
 * @Description:
 * foreach语句是for语句特殊情况下的增强版本，简化了编程，提高了代码的可读性和安全性（不用怕数组越界）。
 * 相对老的for语句来说是个很 好的补充。提倡能用foreach的地方就不要再用for了
 */
public class LambdaTest {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 30);
        map.put("D", 40);
        map.put("E", 50);
        map.put("F", 60);

        map.forEach((k, v) -> System.out.println("Item : " + k + " Count : " + v));
        System.out.println("=========分割线=========");
        map.forEach((k, v) -> {
            System.out.println("Item : " + k + " Count : " + v);
            if ("E".equals(k)) {
                System.out.println("Hello E");
            }
        });
        System.out.println("=========分割线=========");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Item : " + entry.getKey() + " Count : " + entry.getValue());
        }
    }
}
