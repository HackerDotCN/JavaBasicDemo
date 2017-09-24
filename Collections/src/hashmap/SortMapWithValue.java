package hashmap;

import java.util.*;

/**
 * Author: zhang
 * Time: 9/19/2017
 * Description:  http://bbs.csdn.net/topics/391076570
 */

public class SortMapWithValue {
    public static void main(String[] args) {
        Map<String,Integer> map = new TreeMap<>();
        map.put("图书", 4);
        map.put("音像", 6);
        map.put("素材", 9);
        map.put("音乐", 8);
        map.put("影视", 7);
        map.put("动漫", 4);
        map.put("歌曲", 3);
        map.put("图片", 2);
        map.put("图标", 6);
        ArrayList<Map.Entry<String, Integer>> entries = sortMap(map);
        for (int i = 0; i < 9; i++) {
            System.out.println(entries.get(i).getKey() + ":" + entries.get(i).getValue());
        }
    }

    private static ArrayList<Map.Entry<String, Integer>> sortMap(Map<String,Integer> map) {
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
        Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {                         //编译器提示这里可以用Lambda表达式替代
            public int compare(Map.Entry<String, Integer> obj1, Map.Entry<String, Integer> obj2) {
                return obj2.getValue() - obj1.getValue();
            }
        });
        return (ArrayList<Map.Entry<String, Integer>>) entries;
    }
}