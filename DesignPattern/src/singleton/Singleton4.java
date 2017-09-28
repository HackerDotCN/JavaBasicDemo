package singleton;

/**
 * @author: zhangyongbin
 * @Time: 9/20/2017.
 * @Description:
 *  饿汉变种 (和3差不多)
 */
public class Singleton4 {
    private static Singleton4 instance = null;
    static {
        instance = new Singleton4();
    }
    private Singleton4(){}
    public static Singleton4 getInstance(){
        return instance;
    }
}
