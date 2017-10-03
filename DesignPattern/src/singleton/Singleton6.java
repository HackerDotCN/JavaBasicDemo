package singleton;

/**
 * @author: zhangyongbin
 * @Time: 9/20/2017.
 * @Description:
 * 枚举方式
 * 这种方式不仅避免多线程同步问题，还防止反序列化重新创建新的对象
 */
public enum  Singleton6 {
    INSTANCE;
    public void whateverMethod(){}
}
