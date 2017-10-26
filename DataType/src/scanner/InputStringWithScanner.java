package scanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author: zhangyongbin
 * @Time: 9/21/2017.
 * @Description:
 */
public class InputStringWithScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter(" ");
//        String[] str = input.nextLine().split(" ");
//        char[] arr = str.toCharArray();
//        _while (input.hasNext()){
            List<Integer> list = new ArrayList<>();
            list.add(input.nextInt());
//        }

        System.out.println(list.size());
    }
}
