package array;

import java.util.Arrays;

/**
 * @author: zhangyongbin
 * @Time: 10/6/2017.
 * @Description:
 * 测试用Arrays工具类实现数组拷贝
 * 测试数组为空和长度为0的区别，以及判断数组时的注意事项
 */
public class ArrayTest {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 7, 8};
        Integer[] iArr = toIntegerArray(arr);
        int[] arr2 = Arrays.copyOfRange(arr, 2, 5);//注意复制的区间是左闭右开的

        int[] array1 = null; //数组为空，此时array不指向任何对象；
        int[] array2 = new int[0]; //定义一个长度为0的数组；
        int[] array3 = new int[2]; //定义一个长度为2的数组，此时如果数组没有被初始化，默认的值为0；
        System.out.println(Arrays.toString(arr2));
        System.out.println(isArrayNull(array1));
        System.out.println(isArrayNull(array2));
        System.out.println(isArrayNull(array3));

        System.out.println(isArrayNull2(array1));
//        System.out.println(isArrayNull3(array1));
    }

    private static String isArrayNull(int[] arr) {
        if (arr == null || arr.length == 0) {
//        if( arr.length == 0 || arr == null ){
            if (arr == null) return "null array";
            if (arr.length == 0) return "not null,but length is 0";
            return "this can not be executed";                      //不加这句会报无返回值错误，因为if里的语句有可能不被执行。这句不会被执行，这么写其实是不规范的
        } else {
            return "array neither null nor length 0";
        }
    }

    private static String isArrayNull2(int[] arr) {
        String res;
        if ( null == arr) {                          //应该先判断数组是否为空
            res = "this array is null";
        } else if (arr.length == 0) {
            res = "this array.length is 0";
        } else {
            res = "neither null nor length is not 0";
        }
        return res;
    }

    private static String isArrayNull3(int[] arr) {
        if (arr.length == 0) {                      //先判断length不合理，因为array有可能为空
            return "this array.length is 0";
        } else if (arr == null) {
            return " this array is null";
        } else {
            return "neither null nor length is not 0";
        }
    }

    public static Integer[] toIntegerArray(int[] arr){
        int len=arr.length;
        Integer[] iArr=new Integer[len];
        for(int i=0;i<len;i++){
//            iArr[i]=new Integer(arr[i]);
            iArr[i] = arr[i];
        }
        return iArr;
    }

}
