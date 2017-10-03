package singleton;

/**
 * @author: zhangyongbin
 * @Time: 9/20/2017.
 * @Description:
 * 双重校验锁（第2种方式的升级版）
 * 对2方法确保了只有在初始化的时候需要同步，当初始化完成后，再次调用getInstance不会再进入synchronized块
 */
public class Singleton7 {
    private volatile static Singleton7 instance;

    private Singleton7() {
    }

    public static Singleton7 getInstance() {
        if (instance == null) {
            synchronized (Singleton7.class) {
                if (instance == null)
                    instance = new Singleton7();
            }
        }
        return instance;
    }
}
