package hashmap;

import java.util.*;

/**
 * Author: zhang
 * Time: 9/21/2017
 * Description:
 */

public class Freq {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        Map<String, Integer> treeMap = new TreeMap<>();
        String[] arr = {"develop", "develop", "develop", "develop", "test", "test", "operate", "product"};
//        map.put("develop",1);
//        map.put("develop",1);
//        map.put("develop",1);
//        map.put("develop",1);
//        map.put("test",1);
//        map.put("test",1);
//        map.put("operate",1);
        for (String a : arr) {
            Integer freq = hashMap.get(a);
            hashMap.put(a, (freq == null) ? 1 : freq + 1);      //三目运算符，较为简洁！
        }
        System.out.println("hashMap:" + hashMap);       //好像默认按照value大小依次输出了，其实不是这样吧

        for (String a : arr) {
            Integer freq = treeMap.get(a);
            treeMap.put(a, (freq == null) ? 1 : freq + 1);      //三目运算符
        }
        System.out.println("treeMap: " + treeMap);
    }
}
