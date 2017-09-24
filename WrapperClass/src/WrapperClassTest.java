import java.util.ArrayList;
import java.util.Scanner;

/**
 * Author: zhang
 * Time: 8/27/2017
 * Description:
 *  Integer和int分别是引用类型和基本类型，在JDK5.0以后实现了自动打包和解包的功能，你无需自己打包就可以实现，Integer i = 3；
 *  当你那么 int[] a1 = new int[3] ;
 *          Integer[] i = a1;是会报错的，
 *  在java中数据也是一个对象，引用类型，而a1和i都是数组，所以他们都是对象，即引用类型，这个就不是打包和解包的问题了，对象类型不同是不能相互转换的
 *
 *  基本类型的一维数组可以被当作Objdect类型使用，不能当做Object[]类型使用；
 *  非基本数据类型的一维数组，既可以当做Object类型使用，又可以当做Object[]类型使用
 */
public class WrapperClassTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (in.hasNext()) {
            list.add(in.nextInt());
        }

//        Integer[] array = (Integer[]) list.toArray();
        Integer[] array = (Integer[]) list.toArray();
        int[] arr = new int[array.length];
        for (int i = 0; i <array.length ; i++) {
            arr[i] = array[i];
        }
//        int[] arr =(int[]) array;  //包装类型数组不能直接复制
    }


}
