package hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Author: zhang
 * Time: 9/28/2017
 * Description:
 */
public class ConcurrentHashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "001");
        hashMap.put(2, "002");
        ConcurrentHashMap<Integer, String> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put(1, "001");
        concurrentHashMap.put(2, "002");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println("key:"+entry.getKey());
        }
        for (Map.Entry<Integer,String> entry: concurrentHashMap.entrySet()) {
            System.out.println("concurrentHashMap key:"+entry.getKey());
        }
    }
}
