package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Author: zhang
 * Time: 9/24/2017
 * Description:
 */
public class Arr2List {
    public static void main(String[] args) {
        String[] userArr = {"aa", "bb", "cc"};
        String[] userArr2 = {"aaa", "bbb", "ccc"};
        int[] arr3 = {1, 2, 3, 4, 5, 6};                    //这里如果定义成int类型编译器会报错！大概是primitive类型和包装类型的问题
        List<Integer> userList = new ArrayList<Integer>();
        Collections.addAll(userList, arr3);
        Collections.addAll(Arrays.asList(userArr2));
        List<Integer> userList2 = new ArrayList<Integer>(Arrays.asList(arr3)); //这种方式只有数组定义成Integer才行
    }
}
