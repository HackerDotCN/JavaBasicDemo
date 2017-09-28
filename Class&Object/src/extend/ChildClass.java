package extend;

/**
 * @author: zhangyongbin
 * @Time: 2017/9/8  0008.
 * @Description:
 */
class A {
    public int func1(int a, int b) {
        return a - b;
    }
}

class B extends A {
    public int func1(int a, int b) {
        return a + b;
    }
}

public class ChildClass {
    public static void main(String[] args) {
        A a = new B();
        B b = new B();
        System.out.println("Result=" + a.func1(100, 50));
        System.out.println("Result=" + b.func1(100, 50));
    }
}
