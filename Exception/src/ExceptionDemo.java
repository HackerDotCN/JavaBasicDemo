import java.util.Scanner;

/**
 * @author: zhangyongbin
 * @Time: 11/29/2017.
 * @Description:  http://www.importnew.com/26613.html
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("----欢迎使用命令行除法计算器----");
        CMDCalculate();
    }

    public static void CMDCalculate() {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int result = devide(num1, num2);
        System.out.println("result:" + result);
        scan.close();
    }

    public static int devide(int num1, int num2) {
        return num1 / num2;
    }
}
