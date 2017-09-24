package threadpool;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Author: zhang
 * Time: 8/14/2017
 * Description:相比直接用Thread使用线程池的方式节省时间，因为线程池是复用线程的
 */
public class ThreadPoolSample {
    public static void main(String[] args) {
        int count = 200000;
        long startTime = System.currentTimeMillis();
        final List<Integer> l = new LinkedList<>();
        ThreadPoolExecutor tp = new ThreadPoolExecutor(1, 1, 60,
                TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>(count));//也可用Executors工厂类
        final Random random = new Random();
        for (int i = 0; i < count; i++) {
            tp.execute(new Runnable() {
                @Override
                public void run() {
                    l.add(random.nextInt());
                }
            });
        }
        tp.shutdown();

        try {
            tp.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(System.currentTimeMillis() - startTime);
        System.out.println(l.size());

    }
}
