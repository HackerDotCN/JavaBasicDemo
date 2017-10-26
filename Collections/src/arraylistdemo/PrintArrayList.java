package arraylistdemo;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;

/**
 * @author: zhangyongbin
 * @Time: 2017/9/13  0013.
 * @Description:
 */


public class PrintArrayList {
    public static void main(String args[]) {
        List<String> list = new ArrayList<>();
        list.add("AAA");
        list.add("BBB");
//        BitSet
        //直接打印
        System.out.println(list);
        // 方法1
        Iterator it1 = list.iterator();
        _while (it1.hasNext()) {
            System.out.println(it1.next());
        }
        // 方法2
        for (Iterator it2 = list.iterator(); it2.hasNext(); ) {
            System.out.println(it2.next());
        }
        // 方法3
        for (String tmp : list) {
            System.out.println(tmp);
        }
        // 方法4
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
