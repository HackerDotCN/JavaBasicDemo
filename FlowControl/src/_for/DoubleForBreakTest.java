package _for;

/**
 * @author: zhangyongbin
 * @Time: 10/1/2017.
 * @Description:
 * 实验证明：break只能跳出一层循环
 */
public class DoubleForBreakTest {
    public static void main(String[] args) {
        int a=0;
        for(int i=0;i<=9;i++)
        {
            for(int j=0;j<=9;j++)
            {
                a++;
                break;
            }
            a++;
        }
        System.out.println(a);
    }
}
