package common_operation;

/**
 * Author: zhang
 * Time: 9/15/2017
 * Description:
 */
public class CommonOperation {
    public static void main(String[] args) {
        System.out.println(Math.floor(3.6));
        System.out.println(Math.ceil(3.1));
        System.out.println(Math.rint(3.5));
        System.out.println(Math.rint(3.4));
        System.out.println(Math.abs(-4));
        System.out.println(3 % 65);
        System.out.println("--------------------分割线------------------------------");
        for (int i = 0; i < 20; i++) {
            System.out.println(i+":"+(3*Math.pow(i,3)-30*Math.pow(i,2)-70*i-24));
        }
    }
}
