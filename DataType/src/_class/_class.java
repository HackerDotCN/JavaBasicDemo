package _class;

/**
 * @author: zhangyongbin
 * @Time: 11/1/2017.
 * @Description:
 */
public class _class {
    public static void main(String[] args) {
        UserInfo userInfo = new UserInfo();
        System.out.println(userInfo == null);
        Test test = new Test();
        System.out.println(test == null);

    }
}

class UserInfo{
    private static int id;
    private static String name;
}
class Test{}
