/**
 * Author: zhang
 * Time: 9/22/2017
 * Description: cisco
 */
class A{
    static {
        System.out.println("A");
    };
}

class B{
    static {
        System.out.println("B");
    };
}

class C{
    static {
        System.out.println("C");
    };
}

class D{
    static {
        System.out.println("D");
    };
}
public class InitOrder {
    B b = new B();
    static A a = new A();

    public static void main(String[] args) {
        try{
            int a = 1;
            if(a > 0){
                new D();
                throw new RuntimeException("");
            }else {
                new C();
            }
        } finally {
            new B();
        }
    }
}
