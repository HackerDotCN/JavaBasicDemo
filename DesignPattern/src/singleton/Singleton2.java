package singleton;

/**
 * @author: zhangyongbin
 * @Time: 9/20/2017.
 * @Description:
 *  懒汉，线程安全，但是效率太低
 *  对象只需要在初次初始化时需要同步，多数情况下不需要互斥的获得对象，加锁会造成巨大无意义的资源消耗,7对此进行了优化
 */
public class Singleton2 {
    private static Singleton2 instance;
    private Singleton2(){};
    public static synchronized Singleton2 getInstance(){
        if(instance == null){
            instance = new Singleton2();
        }
        return instance;
    }
}
