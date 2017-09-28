package hashmap;

import java.util.*;

/**
 * @author: zhangyongbin
 * @Time: 9/14/2017.
 * @Description:
 */
public class SameKeyAddValue {
    public static void main(String[] args) {
        Map<String, List<String>> hashMap = new HashMap<String, List<String>>();
        List<String> list = new ArrayList<String>();
        list.add("《狂人日记》");
        list.add("《狂人日记》");
        list.add("《狂人日记》");
        list.add("《狂人日记》");
        hashMap.put("小王", list);
        Map<String, Map<String, Integer>> mapList = add(hashMap);
        System.out.println(mapList.get("小王").get("《狂人日记》"));
    }
    public static Map<String, Map<String, Integer>> add(
            Map<String, List<String>> input) {
        Map<String, List<String>> maplist = new HashMap<String, List<String>>();
        Map<String, Integer> temp = new HashMap<String, Integer>();
        temp.put("《狂人日记》", 0);
        Map<String, String> map = new HashMap<String, String>();
        map.put("小王", "《狂人日记》");
        Map<String, Map<String, Integer>> map2 = new HashMap<String, Map<String, Integer>>();
        map2.put("小王", temp);
        Set<String> names = map2.keySet();
        Set<String> names2 = input.keySet();
        for (String str : names) {
            for (String str2 : names2) {
                if (str.equals(str2)) {
                    for (String str3 : input.get(str2)) {
                        temp.put(str3, map2.get(str).get(str3) + 1);
                        map2.put(str, temp);
                    }
                }
            }
        }
        return map2;
    }
}
