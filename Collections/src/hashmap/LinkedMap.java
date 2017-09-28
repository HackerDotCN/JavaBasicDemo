package hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author TEANA E-mail: mmz06@163.com
 * @version 创建时间：2011-1-21 下午02:23:07
 * @DO LinkedHashMap与HashMap
 */
public class LinkedMap {
    public static void main(String[] args) {
        //LinkedHashMap 有序
        Map maps = new LinkedHashMap();
        maps.put("1", "张三");
        maps.put("2", "李四");
        maps.put("3", "王五");
        maps.put("4", "赵六");
        System.out.println("LinkedHashMap(有序):");
        Iterator it = maps.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entity = (Entry) it.next();
            System.out.println("[ key = " + entity.getKey() +
                    ", value = " + entity.getValue() + " ]");
        }
        //HashMap 无序
        Map map = new HashMap();
        map.put("1", "张三");
        map.put("2", "李四");
        map.put("3", "王五");
        map.put("4", "赵六");
        it = null;
        System.out.println("HashMap(无序):");
        it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entity = (Entry) it.next();
            System.out.println("[ key = " + entity.getKey() +
                    ", value = " + entity.getValue() + " ]");
        }
    }
}