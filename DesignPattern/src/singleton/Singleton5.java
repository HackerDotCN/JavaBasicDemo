package singleton;

/**
 * @author: zhangyongbin
 * @Time: 9/20/2017.
 * @Description:
 * 静态内部类
 * 和3、4有点类似，但是区别在于3、4只要加载类了就会实例化instance，而5只有显示调用getInstance方法的时候才会实例化
 */
public class Singleton5 {
    private static class SingletonHolder{
        private static final Singleton5 INSTANCE = new Singleton5();
    }
    private Singleton5(){}
    public static final Singleton5 getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
