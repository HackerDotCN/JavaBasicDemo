package scanner;

import java.util.Scanner;

/**
 * @author: zhangyongbin
 * @Time: 9/21/2017.
 * @Description:
 */
public class ScannerTest {

    public static void main(String[] args) throws Exception {
        Scanner sca = new Scanner(System.in);

        sca.useDelimiter("\n");
        System.out.print("请输入：");
        System.out.println(sca.next());
    }
}