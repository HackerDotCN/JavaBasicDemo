/**
 * Author: zhang
 * Time: 8/30/2017
 * Description:
 * 开启断言：在VM option中加上-ea参数
 */
public class AssertDemo {

    public static void main(String[] args) {

        test1(-5);
        test2(-3);
    }

    private static void test1(int a){
        assert a > 0;
        System.out.println(a);
    }
    private static void test2(int a){
        assert a > 0 : "something goes wrong here, a cannot be less than 0";
        System.out.println(a);
    }
}
