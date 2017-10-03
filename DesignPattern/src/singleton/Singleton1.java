package singleton;

/**
 * @author: zhangyongbin
 * @Time: 9/20/2017.
 * @Description:  http://www.blogjava.net/kenzhh/archive/2013/03/15/357824.html
 * 懒汉（lazy-loading），线程不安全
 */
public class Singleton1 {
    private static Singleton1 instance;
    private Singleton1(){}
    public static Singleton1 getInstance(){
        if(instance == null){
            instance = new Singleton1();
        }
        return instance;
    }
}
