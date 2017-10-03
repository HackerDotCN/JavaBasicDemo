package singleton;

/**
 * @author: zhangyongbin
 * @Time: 9/20/2017.
 * @Description:
 *  饿汉
 *
 */
public class Singleton3 {
    private static Singleton3 instance = new Singleton3();
    private Singleton3(){}
    public static Singleton3 getInstance(){
        return instance;
    }
}
