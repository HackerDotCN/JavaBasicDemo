package bit_operation;

import org.junit.Test;

/**
 * Author: zhang
 * Time: 9/18/2017
 * Description: http://longcxm.iteye.com/blog/1461543
 * 问题：很多成对出现数字保存在磁盘文件中，注意成对的数字不一定是相邻的，如2, 3, 4, 3, 4, 2……，由于意外有一个数字消失了，如何尽快的找到是哪个数字消失了？
 */
public class XorFindLostNum {
    public static int findLost(int a[]){
        int result=0;
        for(int i=0;i<a.length;i++) {
            result^=a[i];
        }
        return result;
    }

    @Test
    public void test(){
        int[] arr = {2, 3, 4, 3, 4, 2,1,1,5,6,5};
        System.out.println(findLost(arr));
    }
}
