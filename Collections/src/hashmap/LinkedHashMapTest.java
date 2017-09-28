package hashmap;

import org.junit.Test;

import java.util.*;

/**
 * @author: zhangyongbin
 * @Time: 9/14/2017.
 * @Description:
 */
public class LinkedHashMapTest {
    public static void linkedHashMapTest() {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("name", "louis");
        linkedHashMap.put("age", "24");
        linkedHashMap.put("sex", "male");

        Iterator iterator = linkedHashMap.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

    public static void hashMapTest() {
        HashMap<String, String>  hashMap= new LinkedHashMap();
        hashMap.put("name", "louis");
        hashMap.put("age", "24");
        hashMap.put("sex", "male");

        Iterator iterator = hashMap.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

    @Test
    public void test(){
        linkedHashMapTest();
        System.out.println();
        hashMapTest();
    }
}
