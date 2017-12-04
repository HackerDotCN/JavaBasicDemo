package _classloader_test;

/**
 * @author: zhangyongbin
 * @Time: 11/24/2017.
 * @Description:
 */
public class SingletonLoadTest {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        System.out.println("counter1 = " + Singleton.counter1 +"\n"+ "counter2 = " + Singleton.counter2);
    }
}

class Singleton {
    private static Singleton instance = new Singleton();
    public static int counter1;
    public static int counter2 = 0;

    private Singleton() {
        counter1++;
        counter2++;
    }

    public static Singleton getInstance() {
        return instance;
    }
}

