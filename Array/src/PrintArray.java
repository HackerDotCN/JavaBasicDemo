/**
 * Author: zhang
 * Time: 8/25/2017
 * Description:
 */
public class PrintArray {
    public static void main(String[] args) {
//        int[] arr = new int[4];
        int[] arr = {2,3,3,4};
        int[] arr2 = new int[7];
        printArray("静态初始化数组：",arr);
        printArray("动态初始化数组：",arr2);
//        arr = {2,3,3,4};

    }

    private static void printArray(String message, int array[]) {
        System.out.println(message
                + ": [length: " + array.length + "]");
        for (int i = 0; i < array.length; i++) {
            if(i != 0){
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        System.out.println();
    }
}
