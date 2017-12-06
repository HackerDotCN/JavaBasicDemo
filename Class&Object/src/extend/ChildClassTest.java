package extend;

/**
 * @author: zhangyongbin
 * @Time: 2017/9/8  0008.
 * @Description:
 */
class Base {
    public int func1(int a, int b) {
        return a - b;
    }
}

class Sub extends Base {
    public int func1(int a, int b) {
        return a + b;
    }
}

class Sub2 extends Base{

}

public class ChildClassTest {
    public static void main(String[] args) {
        Base a = new Sub();
        Sub b = new Sub();
        Base c = new Base();
        System.out.println("Result=" + a.func1(100, 50));
        System.out.println("Result=" + b.func1(100, 50));
        System.out.println("Result=" + c.func1(100, 50));
        System.out.println("Result=" + ((Base)b).func1(100, 50));
    }
}
