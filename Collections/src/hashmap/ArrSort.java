package hashmap;

/**
 * Author: zhang
 * Time: 9/20/2017
 * Description:
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ArrSort {

    public static void main(String[] args) {
        String[] strArr = {"a", "b", "c", "c", "a", "c"};
        System.out.println(arraySort(strArr));

    }

    public static String arraySort(String[] arr) {
        // 定义map，存放数组中的字符及出现次数
        Map<String, Integer> map = new HashMap<>();

        // 遍历数组，将字符及出现次数存放map中
        for (String str : arr) {
            Integer count = map.get(str);
//            if (null == count)  map.put(str, 1);
//             else map.put(str, count + 1);

//            ( count == null) ? map.put(str,1):map.put(str,count+1);  //这种书写方式不对啊！！注意三目运算符的使用方式！后面的两个表达式都要有返回值才行，所以有了下面的写法
            map.put(str, (count == null) ? 1 : count + 1);
        }

        // 定义list，存放map中的entry
        List<Map.Entry<String, Integer>> list = new ArrayList<>();
        list.addAll(map.entrySet());

        // 对list中的entry，按照value值进行降序排列
        Collections.sort(list, new Comparator<Entry<String, Integer>>() {
            public int compare(Entry<String, Integer> arg0, Entry<String, Integer> arg1) {
                return arg1.getValue().compareTo(arg0.getValue());
            }
        });

        // 定义StringBuffer，存放返回的字符串
        StringBuffer retStr = new StringBuffer();
        for (Entry<String, Integer> entry : list) {
            retStr.append(entry.getKey()).append(",");
        }

        // 将字符串组装为需要的格式返回
        return "{" + retStr.delete(retStr.length() - 1, retStr.length()).toString() + "}";
    }
}
