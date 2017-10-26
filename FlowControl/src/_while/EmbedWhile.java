package _while;

/**
 * @author: zhangyongbin
 * @Time: 10/16/2017.
 * @Description:
 */
public class EmbedWhile {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int i = 0;
        while (i < arr.length-1) {
            while (arr[i] < arr[i + 1]) {
//            while ( i < arr.length-1 && arr[i] < arr[i + 1]) {      //外层while的条件这里必须再写一遍，编程基础！！
                System.out.println(i+":"+"test");
                i++;
            }
        }
    }
}
